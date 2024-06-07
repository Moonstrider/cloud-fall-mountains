package com.mytechathon.auto.test.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/lemon.feature",
        glue = "com.mytechathon.auto.test.cucumber.steps",
        monochrome = true
)
public class LemonRunnerTest extends AbstractTestNGCucumberTests {
}
