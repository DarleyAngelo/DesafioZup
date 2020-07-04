package Test;

import static Core.DriverFactory.getDriver;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Core.Propriedades;
import PageBase.PaginaInicialPage;

public class fluxoPrincipalTest extends PaginaInicialPage {

	@Before	
	public void acessandoPaginaDeCompra() throws Exception {
		getDriver().get(Propriedades.URL);
		informandoCampoPesquisa("Antena AM FM");
	}

	@Test
	public void validarBuscaInclusaoCarrinho() throws IOException {
		buscarProduto();	
		cliquenoProduto();
		validarRetornodeProduto();
		adicionarCompraAoCarrinho();
		validarProdutoNoCarrinho();	
	}

	@After
	public void validarexcluirProdutoCarrinho() throws IOException {
		excluirProdutoCarrinho();		
	}


}
