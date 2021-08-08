package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class CarrinhoPage extends BasePage {
	
	public CarrinhoPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}
	
	public boolean apresentouProdutoEsperadoNoCarrinho(String nomeProduto) {
		boolean apresentouProdutoEsperadoNoCarrinho = isElementDisplayed(By.xpath("//*[contains(@class,'cart_item')]//a[text()='" + nomeProduto + "']"));
		if (apresentouProdutoEsperadoNoCarrinho) {
			log("Apresentou o produto [" + nomeProduto + "] no carrinho conforme esperado.");
			return true;
		}
		logFail("Deveria ter apresentado o produto [" + nomeProduto + "] no carrinho.");
		return false;
	}

	public boolean oProdutoApresentouQuantidadeEsperada(String nomeProduto, String quantidadeProduto) {
		boolean apresentouProdutoEsperadoNoCarrinho = isElementDisplayed(
				By.xpath("//*[contains(@class,'product-name')]//a[text()='" + nomeProduto + "']"));
		
		boolean apresentouQuantidadeProdutoEsperadoNoCarrinho = isElementDisplayed(
				By.xpath("//*[contains(@class,'cart_quantity_input')][@value='" + quantidadeProduto + "']"));
		
        if (apresentouProdutoEsperadoNoCarrinho && apresentouQuantidadeProdutoEsperadoNoCarrinho) {
        	return true;
        }        
        logFail("Deveria ter apresentado o produto [" + nomeProduto + "] no carrinho, com a quantidade [" + quantidadeProduto +"].");
		return false;
	}

}