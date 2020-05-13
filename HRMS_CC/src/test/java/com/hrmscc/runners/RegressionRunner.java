package com.hrmscc.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="scr/test/resources/features"
		,glue="com/htmscc/steps"
		,plugin="pretty"
		,dryRun=true
		,monochrome=true
		,tags="@regression"
		)

public class RegressionRunner {

}
