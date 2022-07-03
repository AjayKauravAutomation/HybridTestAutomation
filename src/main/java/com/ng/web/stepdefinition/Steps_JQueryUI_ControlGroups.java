package com.ng.web.stepdefinition;

import com.aventstack.extentreports.Status;
import com.cg.utils.ExtentManager;
import com.ng.Base.Test_Base;
import com.ng.web.pages.JQueryUI_ControlGroup;
import com.ng.web.pages.JQueryUI_Home;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_JQueryUI_ControlGroups extends Test_Base {
	ExtentManager extent;

	JQueryUI_Home homePage;
	JQueryUI_ControlGroup controlGroupPage;
	
	@Given("user launches application")				
    public void openTest() throws Throwable							
    {		
		selenium.setDriver("chrome");
		selenium.setPageLoadTimeout(60);
		selenium.setImplicitWait(60);
		extent = new ExtentManager(selenium.getFileName("results/WebReport") + ".html", "JQueryUI_ExtentReports");
		extent.initializeExtentTest("Test JQueryUI Control Groups feature", "Check Control Groups feature",
				"Ajay Kaurav", "Regression");

		// Initializing Application Pages (POM)
		homePage = new JQueryUI_Home(selenium, selenium.driver);
		controlGroupPage = new JQueryUI_ControlGroup(selenium, selenium.driver);
       					
    }		

    @When("user verifies ControlGroups")					
    public void test() throws Throwable 							
    {		
    	homePage.launch();
		extent.log(Status.PASS, "HomePage Launced");

		homePage.clickControlGroup();
		extent.log(Status.PASS, "Clicked on Selectable link");

		controlGroupPage.switchToDemoFrame();
		extent.log(Status.PASS, "Switched to Demo Frame");

		controlGroupPage.selectHorizontalCarType();
		controlGroupPage.selectHorizontalGroup();
		extent.log(Status.PASS, "Selected Horizontal Group");

		controlGroupPage.selectVerticalCarType();
		controlGroupPage.selectVerticalGroup();
		extent.createImageForLog(Status.PASS, "Performed on all control operations",
				selenium.captureScreen(selenium.getFileName("JQueryUIImage")));
       
    }		

    @Then("close the browser")					
    public void closeTest() throws Throwable 							
    {    		
    	if (selenium.driver != null)
			selenium.driver.close();
		extent.finish();			
    }		


}
