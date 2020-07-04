package Test;

import static Core.DriverFactory.getDriver;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Core.Propriedades;
import PageBase.PaginaInicialPage;

public class fluxoAlternativoTest extends PaginaInicialPage{
	
	@Before	
	public void acessandoPaginaDeCompra() throws Exception {
		getDriver().get(Propriedades.URL);
		informandoCampoPesquisaInexistente("Molho de Tomate");
	}

	@Test
	public void adicionarAoCarrinho() throws IOException {
		buscarProduto();			
	}

	@After
	public void validarSeProdutoExiste () throws IOException {
		validarRetornodeProdutoInexistente();		
	}


}
