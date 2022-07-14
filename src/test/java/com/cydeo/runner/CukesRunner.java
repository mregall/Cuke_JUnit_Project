package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html",
        features = "src/test/resources/features" ,
        //content route of features file
        glue = "com/cydeo/step_definitions" ,
        //source root of step definitions
        dryRun = true,
        tags ="@wip"
)

public class CukesRunner {

}
