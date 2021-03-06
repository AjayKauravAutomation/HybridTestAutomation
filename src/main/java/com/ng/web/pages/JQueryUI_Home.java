package com.ng.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cg.utils.SeleniumUtil;

public class JQueryUI_Home {

	private SeleniumUtil selenium;
	private WebDriver driver;

	@FindBy(xpath = "//a[text()='Droppable']")
	private WebElement droppableLink;

	@FindBy(xpath = "//a[text()='Selectable']")
	private WebElement selectableLink;

	@FindBy(xpath = "//a[text()='Controlgroup']")
	private WebElement controlGroupLink;

	public JQueryUI_Home(SeleniumUtil selenium, WebDriver driver) {
		this.selenium = selenium;
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public void launch() {
		selenium.goTo("https://jqueryui.com/");
	}

	public void clickDroppable() {
		droppableLink.click();
	}

	public void clickSelectable() {
		selectableLink.click();
	}

	public void clickControlGroup() {
		controlGroupLink.click();
	}

}
