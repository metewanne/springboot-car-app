package com.sky.uk.carapp.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;

import com.sky.uk.carapp.service.GenerateHeader;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Objects;

@ExtendWith(MockitoExtension.class)

public class AppControllerTest {

    @InjectMocks
    AppController appController;

    //in the examples the dependencies are mocked
    @Mock
    GenerateHeader generateHeader;

    @Test
    public void testResponseBody() {
        assertTrue(Objects.requireNonNull(appController.responseEntity().getBody()).matches("OK"));
    }

    @Test
    public void testResponseStatus() {
        assertTrue((appController.responseEntity().getStatusCode().is2xxSuccessful()));
    }

}
