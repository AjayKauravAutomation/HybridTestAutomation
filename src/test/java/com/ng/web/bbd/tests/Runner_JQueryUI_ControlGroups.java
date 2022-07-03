package com.ng.web.bbd.tests;

import java.net.MalformedURLException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features/Web.feature"
		, tags = "@Scenario1"
		, glue = "com.ng.web.stepdefinition"
		, plugin = {"pretty", "html:results/WebBDDTest_Results_Scenario1.html"}
		, monochrome = true
		)

@Test
public class Runner_JQueryUI_ControlGroups extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void setup() throws MalformedURLException, InterruptedException {
		System.out.println("Testing Started");
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("Testing Ended");
	}
	
}