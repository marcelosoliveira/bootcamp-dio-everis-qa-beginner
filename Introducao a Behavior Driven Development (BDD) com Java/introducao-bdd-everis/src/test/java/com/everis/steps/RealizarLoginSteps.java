package com.everis.steps;

import com.everis.pages.RealizarLoginPage;

import io.cucumber.java.pt.E;

public class RealizarLoginSteps {
	
	@E("^realiza o login$")
	public void realizarLogin() {
		RealizarLoginPage realizarLoginPage = new RealizarLoginPage();
		realizarLoginPage.realizarLogin();
	}
	
}