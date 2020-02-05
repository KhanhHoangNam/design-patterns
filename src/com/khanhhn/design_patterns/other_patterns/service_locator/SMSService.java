package com.khanhhn.design_patterns.other_patterns.service_locator;

public class SMSService implements MessagingService {

    private static final String CONTENT = "This is message body of SMS message";
    private static final String SERVICE_NAME = "SMSService";

    @Override
    public String getMessageBody() {
        return CONTENT;
    }

    @Override
    public String getServiceName() {
        return SERVICE_NAME;
    }
}
