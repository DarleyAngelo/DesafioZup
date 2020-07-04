package Test;

import static Core.DriverFactory.getDriver;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Core.Propriedades;
import PageBase.PaginaInicialPage;

public class selecionaProdutoTest extends PaginaInicialPage {
	
	@Before	
	public void acessandoPaginaDeCompra() throws Exception {
		getDriver().get(Propriedades.URL);
		informandoCampoPesquisa("Antena AM FM");
		buscarProduto();	
	}
	
	@Test
	public void selecionandoProduto() throws IOException {
		cliquenoProduto();
		
	}
	
	@After
	public void validarDetalheProduto () throws IOException {
		validarDetalhedoProdutoSelecionado();		
	}


}
