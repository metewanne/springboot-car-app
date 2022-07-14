package com.sky.uk.carapp.service;

import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenerateHeaderServiceTest {
    GenerateHeaderService generateHeaderService = new GenerateHeaderService();

    @Test
    public void testValidUUIDLength() {

        assertEquals(UUID.randomUUID().toString().length(),
                Objects.requireNonNull(generateHeaderService.generateRandomHeader().getFirst("x-sky-request-id")).length());

    }

    @Test
    public void testValidUUIDRegex() throws Exception {
        String regexUUIDPattern = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$";
        assertTrue(generateHeaderService.generateRandomHeader().getFirst("x-sky-request-id").matches(regexUUIDPattern));
    }
}
