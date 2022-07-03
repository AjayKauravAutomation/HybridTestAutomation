package com.ng.web.stepdefinition;

import com.aventstack.extentreports.Status;
import com.cg.utils.ExtentManager;
import com.ng.Base.Test_Base;
import com.ng.web.pages.JQueryUI_Home;
import com.ng.web.pages.JQueryUI_Selectable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_JQueryUI_Selectable extends Test_Base {
	ExtentManager extent;

	JQueryUI_Home homePage;
	JQueryUI_Selectable selectablePage;
	
	@Given("user launche the application")				
    public void openTest() throws Throwable							
    {		
		
			selenium.setDriver("chrome");
			selenium.setPageLoadTimeout(60);
			selenium.setImplicitWait(60);
			extent = new ExtentManager(selenium.getFileName("results/WebReport") + ".html", "JQueryUI_ExtentReports");
			extent.initializeExtentTest("Test JQueryUI Selectable feature", "Check selectable feature", "Ajay Kaurav",
					"Regression");

			// Initializing Application Pages (POM)
			homePage = new JQueryUI_Home(selenium, selenium.driver);
			selectablePage = new JQueryUI_Selectable(selenium, selenium.driver);
       					
    }		

    @When("user select Item 1, Item 3, Item 7")					
    public void test() throws Throwable 							
    {		
    	homePage.launch();
		extent.log(Status.PASS, "HomePage Launced");

		homePage.clickSelectable();
		extent.log(Status.PASS, "Clicked on Selectable link");

		selectablePage.selectItems();
		extent.createImageForLog(Status.PASS, "Performed on multiple selections operation",
				selenium.captureScreen(selenium.getFileName("JQueryUIImage")));
    }		

    @Then("user close the chrome browser")					
    public void closeTest() throws Throwable						
    {    		
    	if (selenium.driver != null)
			selenium.driver.close();
		extent.finish();			
    }		


}
