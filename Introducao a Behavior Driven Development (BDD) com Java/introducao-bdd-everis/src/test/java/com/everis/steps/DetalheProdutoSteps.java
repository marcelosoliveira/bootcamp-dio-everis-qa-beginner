package com.everis.steps;

import com.everis.pages.DetalheProdutoPage;

import io.cucumber.java.pt.E;

public class DetalheProdutoSteps {

	@E("^aumenta a quantidade do produto$")
	public void aumentaQtdProduto() {
		DetalheProdutoPage detalheProdutoPage = new DetalheProdutoPage();
		detalheProdutoPage.aumentaQtdProduto();
	}
	
	
}