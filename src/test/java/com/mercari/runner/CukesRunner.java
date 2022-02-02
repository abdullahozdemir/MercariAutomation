package com.mercari.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue ="com/mercari/step_definitions",
        dryRun = true,
        tags = ""

)


public class CukesRunner {


}
