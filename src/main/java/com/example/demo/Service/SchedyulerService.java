package com.example.demo.Service;

import com.example.demo.Repository.TblChargingRepo;
import com.example.demo.util.RequestSender;
import com.example.demo.util.RetryMqMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import com.example.demo.model.TblChargingEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Service
@EnableScheduling
public class SchedyulerService {
    Logger log = LoggerFactory.getLogger(SchedyulerService.class.getName());

    @Autowired
    TblChargingRepo chargingRepo;

    @Autowired
    RequestSender requestSender;

@Scheduled(cron = "30 59 12 * * *")

public void fetch (){
    System.out.println("fetch");
    List<TblChargingEntity> records = chargingRepo.findAll();
    int i=0;
    for(TblChargingEntity tr : records) {
        i++;
        if(i%5000==0) {
            try {
                log.info("Number Of Records Processed : " +i);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else{
               /* log.info("Sending to queue Msisdn : "+tr.getMsisdn()+
                " tbl_charging_id"+tr.getCtimestamp()+
                  "  Number Of Attempt"+tr.getNumOfAttempts()
                );*/
            process(tr);

        }

    }

}


    private void process(TblChargingEntity records){


        Object message = getMessage(records);
        requestSender.send("Updatetest",message);
        log.debug("Record Inserted in queue for msisnd "+ records.getSubscribernumber());

    }


    private Object getMessage(TblChargingEntity entity) {
        System.out.println("get message ");

        ObjectMapper objectMapper = new ObjectMapper();
        RetryMqMessage retryMqMessage = new RetryMqMessage();
        retryMqMessage.setAmount(entity.getAdjustmentamountrelative());
        retryMqMessage.setCtimestamp(entity.getOrigintimestamp());
        retryMqMessage.setId(entity.getId());
        retryMqMessage.setIsCharged(entity.getIscharged());
        retryMqMessage.setMsisdn(entity.getSubscribernumber());
        retryMqMessage.setNumOfAttempts(entity.getNumOfAttempts());
//        retryMqMessage.setOperatorId(Long.valueOf(entity.getOperatorid()));
        retryMqMessage.setPartnerId(entity.getPartnerid());
        retryMqMessage.setResponseCode(entity.getResponsecode());
        retryMqMessage.setShortCode(entity.getShortcode());
        retryMqMessage.setSmsId(entity.getOriginalSmsId());
        retryMqMessage.setSmsText(entity.getSmstext());
//        retryMqMessage.setTblChargingId(entity.getT);
        String object = null;
        try {
            object = objectMapper.writeValueAsString(retryMqMessage);
        } catch (JsonProcessingException e) {
            log.error("Error in JSON processing "+e);
        }
        return object;

    }



    @Scheduled (cron = "01 31 12 * * * ")
    void run() {
        System.out.println(" Inside- Scheduler ");
        chargingRepo.deleteAll();
    }
}
