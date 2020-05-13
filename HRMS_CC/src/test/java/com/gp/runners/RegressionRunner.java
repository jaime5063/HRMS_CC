package com.gp.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="scr/test/resources/features"
		,glue="com/gp/steps"
		,plugin="pretty"
		,dryRun=false
		,monochrome=true
//		,tags="@regression"
		)

public class RegressionRunner {

}
