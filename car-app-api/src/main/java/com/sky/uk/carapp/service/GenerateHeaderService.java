package com.sky.uk.carapp.service;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class GenerateHeaderService {
    public HttpHeaders generateRandomHeader() {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("x-sky-request-id", UUID.randomUUID().toString());
        return responseHeaders;
    }
}
