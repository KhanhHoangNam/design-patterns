package com.khanhhn.design_patterns.other_patterns.service_locator.example;

import com.khanhhn.design_patterns.other_patterns.service_locator.EmailService;
import com.khanhhn.design_patterns.other_patterns.service_locator.MessagingService;
import com.khanhhn.design_patterns.other_patterns.service_locator.SMSService;

public class InitialContext {
    private final static String EMAIL_SERVICE = "EmailService";
    private final static String SMS_SERVICE = "SMSService";

    public MessagingService lookup(String serviceName) {
        if (EMAIL_SERVICE.equalsIgnoreCase(serviceName)) {
            return new EmailService();
        } else if (SMS_SERVICE.equalsIgnoreCase(serviceName)){
            return new SMSService();
        }
        return null;
    }
}
