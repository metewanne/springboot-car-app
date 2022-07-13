package com.sky.uk.carapp.model;

import org.springframework.stereotype.Component;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;

@Component
public class ViewModel {

    public HttpHeaders generateRandomHeader() {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("x-sky-request-id", UUID.randomUUID().toString());
        return responseHeaders;
    }

}
