package com.everis.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.util.Hooks;

public class RealizarCompra extends BasePage {
	
	@FindBy(css = ".cheque-indent")
	protected WebElement mensagemFinalCompra;
	
	@FindBy(css = ".standard-checkout")
	protected WebElement botaoCheckout;
	
	@FindBy(css = ".bankwire")
	protected WebElement botaoTipoPagamento;
	
	@FindBy(xpath = "//*[text()='I confirm my order']")
	protected WebElement botaoPagamentoComfirmado;
	
	@FindBy(xpath = "//*[text()='Add a new address']")
	protected WebElement botaoAddEndereco;
	
	@FindBy(xpath = "//*[text()='Proceed to checkout']")
	protected WebElement botaoProsseguir;
	
	public RealizarCompra() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}
	
	public void acessaCheckout() {
		waitElement(botaoCheckout, 5).click();		
		log("Faz o checkout para realizar a compra");
	}

	public void confirmaEnderecoEntrega() {
		String address = "Address Principal";
		driver.findElement(By.id("id_address_delivery")).sendKeys(address);
		String addressExiste = driver.findElement(By.id("id_address_delivery")).getText();
		
		if (addressExiste.contains(address)) {
			botaoProsseguir.click();
		} else {			
			botaoAddEndereco.click();
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstname")));
			driver.findElement(By.id("firstname")).clear();
			driver.findElement(By.id("firstname")).sendKeys("Kelly");
			driver.findElement(By.id("lastname")).clear();
			driver.findElement(By.id("lastname")).sendKeys("Princes");
			driver.findElement(By.id("address1")).clear();
			driver.findElement(By.id("address1")).sendKeys("Rua Parkson 123");
			driver.findElement(By.id("city")).clear();
			driver.findElement(By.id("city")).sendKeys("Xablau");
			driver.findElement(By.id("id_state")).sendKeys("Hawaii");
			driver.findElement(By.id("postcode")).clear();
			driver.findElement(By.id("postcode")).sendKeys("96815");
			driver.findElement(By.id("id_country")).sendKeys("United States");
			driver.findElement(By.id("phone_mobile")).clear();
			driver.findElement(By.id("phone_mobile")).sendKeys("9779977997");
			driver.findElement(By.id("alias")).clear();
			driver.findElement(By.id("alias")).sendKeys(address);
			driver.findElement(By.id("submitAddress")).click();
			driver.findElement(By.id("id_address_delivery")).sendKeys(address);
			botaoProsseguir.click();
		}
		
		
	}

	public void confirmaFormaTransporte() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cgv")));
		driver.findElement(By.id("cgv")).click();
		botaoCheckout.click();		
	}

	public void confirmaPagamento() {
		botaoTipoPagamento.click();
		botaoPagamentoComfirmado.click();		
	}

	public void mensagemCompra(String mensagem) {
		Assert.assertEquals(mensagem, mensagemFinalCompra.getText());		
	}
	
}