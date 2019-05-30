package com.company.testrest2.config;

import com.company.testrest2.service.CalculationRestService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig
{
    public JerseyConfig()
    {
        register(CalculationRestService.class);
    }
}