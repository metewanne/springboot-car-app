package com.sky.uk.carapp;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/",
        glue = "com.sky.uk.carapp")


public class RunCucumberTest {
}

