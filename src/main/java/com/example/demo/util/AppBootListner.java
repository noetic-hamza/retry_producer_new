//package com.example.demo.util;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.ApplicationListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AppBootListner implements ApplicationListener<ApplicationReadyEvent> {
//
//    @Autowired
//    ConfigurationService configurationService;
//
//    @Override
//    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
//        configurationService.loadAllConfigs();
//    }
//}
