package com.everis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class DetalheProdutoPage extends BasePage {

	@FindBy(xpath = "//*[text()='Add to cart']")
	protected WebElement botaoAdicionarAoCarrinho;

	@FindBy(css = ".icon-plus")
	protected WebElement botaoAumentar;

	public DetalheProdutoPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public void aumentaQtdProduto() {
		for (int index = 1; index < 15; index++) {
			botaoAumentar.click();
		}
		log("Aumenta a quantidade do produto");
	}
	

}