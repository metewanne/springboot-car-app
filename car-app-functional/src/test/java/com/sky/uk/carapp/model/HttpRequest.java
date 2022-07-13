package com.sky.uk.carapp.model;

import io.restassured.response.Response;
import org.springframework.stereotype.Component;

@Component
public class HttpRequest {
    private Response response;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public String getResponseBody() {
        return this.response.getBody().asString();
    }

    public int getResponseStatusCode() {
        return this.response.getStatusCode();
    }
}
