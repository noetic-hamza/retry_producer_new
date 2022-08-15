package com.example.demo.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tbl_charging", schema = "public")
public class TblChargingEntity {
    private BigInteger id;
    private Long originalSmsId;
    private String origintransactionid;
    private Timestamp origintimestamp;
    private Integer statuscode;
    private String shortcode;
    private String keyword;
    private Integer ischarged;
    private Integer partnerid;
    private Integer responsecode;
    private Integer attempt;
    private String subscribernumber;
    private Double adjustmentamountrelative;
    private Integer operatorid;
    private String smstext;
    private Integer chargingMechanism;
    private Integer isPostpaid;
    private Integer numOfAttempts;
    private Timestamp lastAttemptTime;

    @Id
    @Column(name = "id")
    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    @Basic
    @Column(name = "original_sms_id")
    public Long getOriginalSmsId() {
        return originalSmsId;
    }

    public void setOriginalSmsId(Long originalSmsId) {
        this.originalSmsId = originalSmsId;
    }

    @Basic
    @Column(name = "origintransactionid")
    public String getOrigintransactionid() {
        return origintransactionid;
    }

    public void setOrigintransactionid(String origintransactionid) {
        this.origintransactionid = origintransactionid;
    }

    @Basic
    @Column(name = "origintimestamp")
    public Timestamp getOrigintimestamp() {
        return origintimestamp;
    }

    public void setOrigintimestamp(Timestamp origintimestamp) {
        this.origintimestamp = origintimestamp;
    }

    @Basic
    @Column(name = "statuscode")
    public Integer getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(Integer statuscode) {
        this.statuscode = statuscode;
    }

    @Basic
    @Column(name = "shortcode")
    public String getShortcode() {
        return shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    @Basic
    @Column(name = "keyword")
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Basic
    @Column(name = "ischarged")
    public Integer getIscharged() {
        return ischarged;
    }

    public void setIscharged(Integer ischarged) {
        this.ischarged = ischarged;
    }

    @Basic
    @Column(name = "partnerid")
    public Integer getPartnerid() {
        return partnerid;
    }

    public void setPartnerid(Integer partnerid) {
        this.partnerid = partnerid;
    }

    @Basic
    @Column(name = "responsecode")
    public Integer getResponsecode() {
        return responsecode;
    }

    public void setResponsecode(Integer responsecode) {
        this.responsecode = responsecode;
    }

    @Basic
    @Column(name = "attempt")
    public Integer getAttempt() {
        return attempt;
    }

    public void setAttempt(Integer attempt) {
        this.attempt = attempt;
    }

    @Basic
    @Column(name = "subscribernumber")
    public String getSubscribernumber() {
        return subscribernumber;
    }

    public void setSubscribernumber(String subscribernumber) {
        this.subscribernumber = subscribernumber;
    }

    @Basic
    @Column(name = "adjustmentamountrelative")
    public Double getAdjustmentamountrelative() {
        return adjustmentamountrelative;
    }

    public void setAdjustmentamountrelative(Double adjustmentamountrelative) {
        this.adjustmentamountrelative = adjustmentamountrelative;
    }

    @Basic
    @Column(name = "operatorid")
    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    @Basic
    @Column(name = "smstext")
    public String getSmstext() {
        return smstext;
    }

    public void setSmstext(String smstext) {
        this.smstext = smstext;
    }

    @Basic
    @Column(name = "charging_mechanism")
    public Integer getChargingMechanism() {
        return chargingMechanism;
    }

    public void setChargingMechanism(Integer chargingMechanism) {
        this.chargingMechanism = chargingMechanism;
    }

    @Basic
    @Column(name = "is_postpaid")
    public Integer getIsPostpaid() {
        return isPostpaid;
    }

    public void setIsPostpaid(Integer isPostpaid) {
        this.isPostpaid = isPostpaid;
    }

    @Basic
    @Column(name = "num_of_attempts")
    public Integer getNumOfAttempts() {
        return numOfAttempts;
    }

    public void setNumOfAttempts(Integer numOfAttempts) {
        this.numOfAttempts = numOfAttempts;
    }

    @Basic
    @Column(name = "last_attempt_time")
    public Timestamp getLastAttemptTime() {
        return lastAttemptTime;
    }

    public void setLastAttemptTime(Timestamp lastAttemptTime) {
        this.lastAttemptTime = lastAttemptTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblChargingEntity that = (TblChargingEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(originalSmsId, that.originalSmsId) &&
                Objects.equals(origintransactionid, that.origintransactionid) &&
                Objects.equals(origintimestamp, that.origintimestamp) &&
                Objects.equals(statuscode, that.statuscode) &&
                Objects.equals(shortcode, that.shortcode) &&
                Objects.equals(keyword, that.keyword) &&
                Objects.equals(ischarged, that.ischarged) &&
                Objects.equals(partnerid, that.partnerid) &&
                Objects.equals(responsecode, that.responsecode) &&
                Objects.equals(attempt, that.attempt) &&
                Objects.equals(subscribernumber, that.subscribernumber) &&
                Objects.equals(adjustmentamountrelative, that.adjustmentamountrelative) &&
                Objects.equals(operatorid, that.operatorid) &&
                Objects.equals(smstext, that.smstext) &&
                Objects.equals(chargingMechanism, that.chargingMechanism) &&
                Objects.equals(isPostpaid, that.isPostpaid) &&
                Objects.equals(numOfAttempts, that.numOfAttempts) &&
                Objects.equals(lastAttemptTime, that.lastAttemptTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, originalSmsId, origintransactionid, origintimestamp, statuscode, shortcode, keyword, ischarged, partnerid, responsecode, attempt, subscribernumber, adjustmentamountrelative, operatorid, smstext, chargingMechanism, isPostpaid, numOfAttempts, lastAttemptTime);
    }
}
