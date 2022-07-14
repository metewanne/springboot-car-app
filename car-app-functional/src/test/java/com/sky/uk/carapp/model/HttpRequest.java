package com.sky.uk.carapp.model;

import io.restassured.response.Response;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class HttpRequest {
    private Response response;

    //Used Lombok instead of below get and set methods for concise code and efficiency
//    public Response getResponse() {
//        return response;
//    }
//
//    public void setResponse(Response response) {
//        this.response = response;
//    }

    public String getResponseBody() {
        return this.response.getBody().asString();
    }

    public int getResponseStatusCode() {
        return this.response.getStatusCode();
    }
}
