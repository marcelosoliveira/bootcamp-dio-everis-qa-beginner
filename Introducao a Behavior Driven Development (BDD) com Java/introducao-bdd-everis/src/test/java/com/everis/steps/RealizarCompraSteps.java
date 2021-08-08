package com.everis.steps;

import com.everis.pages.RealizarCompra;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class RealizarCompraSteps {
	
	@E("^acessa o checkout$")
	public void acessaCheckout() {
		RealizarCompra realizarCompra = new RealizarCompra();
		realizarCompra.acessaCheckout();
	}
	
	@E("^confirma o endereco de entrega$")
	public void confirmaEnderecoEntrega() {
		RealizarCompra realizarCompra = new RealizarCompra();
		realizarCompra.confirmaEnderecoEntrega();
	}
	
	@E("^escolhe a forma de transporte$")
	public void confirmaFormaTransporte() {
		RealizarCompra realizarCompra = new RealizarCompra();
		realizarCompra.confirmaFormaTransporte();
	}
	
	@Quando("^o pagamento for confirmado$")
	public void confirmaPagamento() {
		RealizarCompra realizarCompra = new RealizarCompra();
		realizarCompra.confirmaPagamento();
	}
	
	@Entao("^deve ser apresentado a mensagem \"(.*)\"$")
	public void mensagemCompra(String mensagem) {
		RealizarCompra realizarCompra = new RealizarCompra();
		realizarCompra.mensagemCompra(mensagem);
	}
}