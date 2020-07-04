package PageBase;

import static Core.DriverFactory.getDriver;
import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import DSL.Tempo;


public class PaginaInicialPage {


	public PaginaInicialPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void informandoCampoPesquisa(String produto) throws IOException {

		WebDriverWait aguarda = new WebDriverWait(getDriver(), 20);
		WebElement campoFiltro = aguarda.until(ExpectedConditions.elementToBeClickable(By.id("neemu-input")));
		campoFiltro.sendKeys(produto);		

	}

	public void informandoCampoPesquisaInexistente(String produto) throws IOException {

		WebDriverWait aguarda = new WebDriverWait(getDriver(), 20);
		WebElement campoFiltro = aguarda.until(ExpectedConditions.elementToBeClickable(By.id("neemu-input")));
		campoFiltro.sendKeys(produto);		

	}

	public void buscarProduto() {
		WebDriverWait aguarda = new WebDriverWait(getDriver(), 20);
		WebElement btnBuscar = aguarda.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-buscar")));
		btnBuscar.click();		
	}

	public void validarRetornodeProduto() {
		String produtoEsperado = "Antena Stetsom ST3300 AM FM Teto Palio Weekend Strada Siena Idea Uno Fiorino 84 a 16 Tipo Original";

		WebDriverWait aguarda = new WebDriverWait(getDriver(), 20);
		WebElement protudoEncontrado = aguarda.until(ExpectedConditions.presenceOfElementLocated(By.id("Antena Stetsom ST3300 AM FM Teto Palio Weekend Strada Siena Idea Uno Fiorino 84 a 16 Tipo Original")));

		Assert.assertEquals(produtoEsperado, protudoEncontrado.getAttribute("title"));		

	}

	public void validarRetornodeProdutoInexistente() {

		WebDriverWait aguarda = new WebDriverWait(getDriver(), 20);
		WebElement protudoEncontrado = aguarda.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".prateleira-padrao prateleira-3")));

	}

	public void cliquenoProduto() {

		WebDriverWait aguarda = new WebDriverWait(getDriver(), 20);
		WebElement protudoEncontrado = aguarda.until(ExpectedConditions.presenceOfElementLocated(By.id("Antena Stetsom ST3300 AM FM Teto Palio Weekend Strada Siena Idea Uno Fiorino 84 a 16 Tipo Original")));
		protudoEncontrado.click();		
	}

	public void validarDetalhedoProdutoSelecionado() {
		String produtoEsperado = "Antena Stetsom ST3300 AM FM Teto Palio Weekend Strada Siena Idea Uno Fiorino 84 a 16 Tipo Original";
		WebDriverWait aguarda = new WebDriverWait(getDriver(), 20);
		WebElement protudoEncontrado = aguarda.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".nome-produto")));
		Assert.assertEquals(produtoEsperado, protudoEncontrado.getText());		


	}


	public void validarProdutoNoCarrinho() {

		String produtoEsperado = "Antena Stetsom ST3300 AM FM Teto Palio Weekend Strada Siena Idea Uno Fiorino 84 a 16 Tipo Original";
		WebDriverWait aguarda = new WebDriverWait(getDriver(), 20);
		WebElement carrinho = aguarda.until(ExpectedConditions.presenceOfElementLocated(By.id("cp-dropdown-1")));
		Tempo.aguardarAplicacao(5);
		carrinho.click();		
		WebElement protudoEncontrado = aguarda.until(ExpectedConditions.presenceOfElementLocated(By.id("cp-dropdown-1")));
		Assert.assertEquals(produtoEsperado, protudoEncontrado.getText());

	}


	public void adicionarCompraAoCarrinho() {

		WebDriverWait aguarda = new WebDriverWait(getDriver(), 20);
		WebElement btnComprar = aguarda.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ad-btn-comprar")));
		btnComprar.click();	
		Tempo.aguardarAplicacao(5);

	}

	public void excluirProdutoCarrinho() {

		String mensagemDeExclusao = "Seu carrinho está vazio.";	
		WebDriverWait aguarda = new WebDriverWait(getDriver(), 20);
		WebElement mensagemRetornada = aguarda.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".empty-cart-title")));
		Assert.assertEquals(mensagemDeExclusao, mensagemRetornada.getText());
		
		

	}

}
