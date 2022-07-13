package com.sky.uk.carapp.steps;

import io.cucumber.java.en.Then;
import com.sky.uk.carapp.model.HttpRequest;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import com.sky.uk.carapp.util.Client;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.is;

public class PrivateEndpointSteps {
    HttpRequest http = new HttpRequest();
    Client client = new Client();

    @When("the client calls {string}")
    public void clientCallsPrivateStatus(String outStr) {
        http.setResponse(client.sendGetRequest(outStr));
    }

    @Then("the client receives a status code of {int}")
    public void client_receives_a_code_of(Integer code) {
        assertThat(http.getResponseStatusCode()).isEqualTo(code);
    }
    @Then("the client receives a body of {string}")
    public void client_receives_a_body_of(String body) {
        assertThat(http.getResponseBody()).contains(body);
    }

}
