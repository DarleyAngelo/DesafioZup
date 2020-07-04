package Test;

import static Core.DriverFactory.getDriver;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Core.Propriedades;
import PageBase.PaginaInicialPage;

public class filtrarProdutoInexistenteTest extends PaginaInicialPage  {
	
	
	@Before	
	public void acessandoPaginaDeCompra() throws Exception {
		getDriver().get(Propriedades.URL);	
	}
	
	@Test
	public void pesquisarProdutoInexistente() throws IOException {
		informandoCampoPesquisaInexistente("Molho de Tomate");
		buscarProduto();		
	}
	
	@After
	public void validarProdutoPesquisado () throws IOException {
		validarRetornodeProdutoInexistente();		
	}


}
