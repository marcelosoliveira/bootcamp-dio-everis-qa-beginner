package com.everis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class RealizarLoginPage extends BasePage {
	
	@FindBy(id = "email")
	protected WebElement campoEmail;
	
	@FindBy(id = "passwd")
	protected WebElement campoPassword;
	
	@FindBy(id = "SubmitLogin")
	protected WebElement botaoSubmit;
	
	public RealizarLoginPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}
	
	public void realizarLogin() {

		campoEmail.sendKeys("everisbootcamp@qabeginner.com");
		campoPassword.sendKeys("QA@everis213");
		botaoSubmit.click();
		
	}

}
