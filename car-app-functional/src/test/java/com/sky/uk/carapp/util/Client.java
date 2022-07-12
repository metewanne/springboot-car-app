package com.sky.uk.carapp.util;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static io.restassured.RestAssured.given;

@Component
@Slf4j
public class Client {

    @Value("${service.base.url}")
    private String baseURL;

    RequestSpecBuilder specification = new RequestSpecBuilder();
    public Response sendGetRequest(String path) {
        RequestSpecification request = specification.build();
        log.info("Getting from this url: -->" + baseURL + path);
        return given(request).get(path);
    }
}
