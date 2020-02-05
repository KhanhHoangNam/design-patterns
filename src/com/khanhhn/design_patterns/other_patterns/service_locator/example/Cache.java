package com.khanhhn.design_patterns.other_patterns.service_locator.example;

import com.khanhhn.design_patterns.other_patterns.service_locator.MessagingService;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    private static final List<MessagingService> SERVICES = new ArrayList<>();

    public MessagingService getService(String serviceName) {
        for (MessagingService service : SERVICES) {
            if (serviceName.equals(service.getClass().getCanonicalName())) {
                return service;
            }
        }

        return null;
    }

    public void addService(MessagingService newService) {
        SERVICES.add(newService);
    }
}
