package com.sky.uk.carapp.controller;

import com.sky.uk.carapp.service.GenerateHeaderService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)

public class AppControllerTest {

    @InjectMocks
    AppController appController;

    //in the examples the dependencies are mocked
    @Mock
    GenerateHeaderService generateHeaderService;

    @Test
    public void testResponseBody() {
        assertTrue(Objects.requireNonNull(appController.responseEntity().getBody()).matches("OK"));
    }

    @Test
    public void testResponseStatus() {
        assertTrue((appController.responseEntity().getStatusCode().is2xxSuccessful()));
    }

}
