package com.ng.web.stepdefinition;

import com.aventstack.extentreports.Status;
import com.cg.utils.ExtentManager;
import com.ng.Base.Test_Base;
import com.ng.web.pages.JQueryUI_Droppable;
import com.ng.web.pages.JQueryUI_Home;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_JQueryUI_Droppable extends Test_Base {
	ExtentManager extent;

	JQueryUI_Home homePage;
	JQueryUI_Droppable droppablePage;
	
	@Given("user launches the application")				
    public void openTest() throws Throwable							
    {		
		selenium.setDriver("chrome");
		selenium.setPageLoadTimeout(60);
		selenium.setImplicitWait(60);
		extent = new ExtentManager(selenium.getFileName("results/WebReport") + ".html", "JQueryUI_ExtentReports");
		extent.initializeExtentTest("Test JQueryUI Droppable", "Check dropabble funtion",
				"Ajay Kaurav", "Regression");

		// Initializing Application Pages (POM)
		homePage = new JQueryUI_Home(selenium, selenium.driver);
		droppablePage = new JQueryUI_Droppable(selenium, selenium.driver);
       					
    }		

    @When("user verifies Drag me to my target component to Drop here component")					
    public void test() throws Throwable 							
    {		
    	homePage.launch();
		extent.log(Status.PASS, "HomePage Launced");

		homePage.clickDroppable();
		extent.log(Status.PASS, "Clicked on Dropppable link");

		droppablePage.dragAndDropTarget();
		extent.createImageForLog(Status.PASS, "Performed on Drag and Drop operation",
				selenium.captureScreen(selenium.getFileName("JQueryUIImage")));
       
    }		

    @Then("user close the browser")					
    public void closeTest() throws Throwable 							
    {    		
    	if (selenium.driver != null)
			selenium.driver.close();
		extent.finish();			
    }		


}
