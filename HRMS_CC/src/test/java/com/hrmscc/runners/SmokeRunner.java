package com.hrmscc.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features"
		,glue="com/hrmscc/steps"
		,plugin = "pretty"
		,monochrome = true
		,dryRun = true
		,tags = "@smoke"
		)

public class SmokeRunner {

}
