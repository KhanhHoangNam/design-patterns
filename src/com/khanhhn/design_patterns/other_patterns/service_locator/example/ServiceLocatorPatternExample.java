package com.khanhhn.design_patterns.other_patterns.service_locator.example;

import com.khanhhn.design_patterns.other_patterns.service_locator.EmailService;
import com.khanhhn.design_patterns.other_patterns.service_locator.MessagingService;
import com.khanhhn.design_patterns.other_patterns.service_locator.SMSService;


public class ServiceLocatorPatternExample {
    public static void main(String[] args) {
        MessagingService service = ServiceLocator.getService(EmailService.class.getCanonicalName());
        System.out.println(service.getMessageBody());

        MessagingService smsService = ServiceLocator.getService(SMSService.class.getCanonicalName());
        System.out.println(smsService.getMessageBody());

        MessagingService emailService = ServiceLocator.getService(EmailService.class.getCanonicalName());
        System.out.println(emailService.getMessageBody());
    }
}