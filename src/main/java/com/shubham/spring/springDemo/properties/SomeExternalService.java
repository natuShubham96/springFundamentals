package com.shubham.spring.springDemo.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

    //will vary according to the environment app is running in, hence will be read from properties file
    @Value("${external.service.url}")
    private String url;

    public String getUrl() {
        return url;
    }
}
