package com.hat.e2e.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:application.properties")
public class Properties {

    @Value("${baseUrl}")
    private String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }

}
