package com.ng.Base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cg.utils.SeleniumUtil;

public class Test_Base {

	protected SeleniumUtil selenium = SeleniumUtil.getInstance();
     
	@BeforeClass
	public void setup() {
		selenium = SeleniumUtil.getInstance();
	}

	@AfterClass
	public void tearDown() {
		if (selenium.driver != null)
			selenium.driver.quit();
	}
}
