package com.khanhhn.design_patterns.other_patterns.service_locator;

public class EmailService implements MessagingService {

    private static final String CONTENT = "This is message body of Email message";
    private static final String SERVICE_NAME = "EmailService";

    @Override
    public String getMessageBody() {
        return CONTENT;
    }

    @Override
    public String getServiceName() {
        return SERVICE_NAME;
    }
}
