package com.sky.uk.carapp.service;

import org.springframework.stereotype.Component;

import org.springframework.http.HttpHeaders;

import java.util.UUID;

@Component
public class GenerateHeader {
    public HttpHeaders generateRandomHeader() {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("x-sky-request-id", UUID.randomUUID().toString());
        return responseHeaders;
    }
}
