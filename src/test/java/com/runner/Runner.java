package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature"
		, glue = "com\\steps" 
		, tags = {"@DataFlipkart" }
 		//,dryRun = true
        ,monochrome = true)

public class Runner {

}
