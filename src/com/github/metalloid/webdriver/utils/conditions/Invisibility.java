package com.github.metalloid.webdriver.utils.conditions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Invisibility extends Condition {

	public Invisibility(WebDriver driver, WebElement element) {
		super(driver, element);
	}

	@Override
	public ExpectedCondition<?> getExpectedCondition() {
		return ExpectedConditions.invisibilityOf(element);
	}
}
