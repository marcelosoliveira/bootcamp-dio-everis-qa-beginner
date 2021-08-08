package com.everis.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginUtils {
	private WebDriver driver;

	public LoginUtils(WebDriver driver) {
		this.driver = driver;
	}

	public void preencheCampoPorId(String id_campo, String value) {

		driver.findElement(By.id(id_campo)).sendKeys(value);
	}
	
	public void preencheCampoPorCss(String id_campo, String value) {

		driver.findElement(By.cssSelector(id_campo)).sendKeys(value);
	}

	public void clickPorCss(String css_campo) {

		driver.findElement(By.cssSelector(css_campo)).click();
	}

	public void clickPorNome(String name_campo) {

		driver.findElement(By.name(name_campo)).click();
	}

	public void clickPorId(String id_campo) {

		driver.findElement(By.id(id_campo)).click();
	}
	
	public WebDriverWait webWaitDriver(WebDriver driver, long timeSeconds) {
		return new WebDriverWait(driver, timeSeconds);
	}

}
