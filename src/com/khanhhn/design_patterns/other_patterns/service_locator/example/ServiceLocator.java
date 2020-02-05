package com.khanhhn.design_patterns.other_patterns.service_locator.example;

import com.khanhhn.design_patterns.other_patterns.service_locator.MessagingService;

public class ServiceLocator {

    private static Cache cache = new Cache();

    public ServiceLocator() {
        throw new IllegalAccessError("Can't construct this class directly");
    }

    public static MessagingService getService(String serviceName) throws NullPointerException {

            MessagingService service = cache.getService(serviceName);

            if (service != null) {
                System.out.println("Get service from cache: " + serviceName);
            }

            System.out.println("Create a new service and add to cache " + serviceName);
            InitialContext context = new InitialContext();

            service = context.lookup(serviceName);
            cache.addService(service);

            return service;

    }
}
