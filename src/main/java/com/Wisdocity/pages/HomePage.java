package com.Wisdocity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;

    private By wisdocityAIHeader = By.xpath("//*[text()='Wisdocity.ai']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getWelcomeMessage() {
        return driver.findElement(wisdocityAIHeader).getText();
    }

}
