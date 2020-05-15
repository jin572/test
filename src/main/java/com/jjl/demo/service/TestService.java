package com.jjl.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Value("${management.server.port}")
    private String port;

    public String getPort() {
        return port;
    }

}
