package com.sky.uk.carapp.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;

import com.sky.uk.carapp.service.GenerateHeader;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;



@ExtendWith(MockitoExtension.class)



public class AppControllerTest {

    @Autowired
    private GenerateHeader generateHeader = new GenerateHeader();

    public AppControllerTest(GenerateHeader generateHeader) {
        this.generateHeader = generateHeader;
    }

    @InjectMocks
    AppController appController;

    @Mock
    ResponseEntity<String> responseEntity = new ResponseEntity<String>("body", generateHeader.generateRandomHeader(), HttpStatus.OK);


    @Test
    public void testResponseBody() {
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        assertThat(responseEntity.getBody()).isEqualTo("OK");
    }

}
