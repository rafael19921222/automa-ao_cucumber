package steps;

import org.junit.After;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;





public class FuncionalidadeLoginTeste {
	
	
	 Metodos metodos = new Metodos();
	 
	 
	@After
	public void finalizarTeste() {
//	Executa.fecharNavegador();
		
	}
	
	@Given("que esteja na tela de login")
	public void que_esteja_na_tela_de_login() {
		Executa.abrirNavegador();
	   
	}

	@When("enviar os dados de login")
	public void enviar_os_dados_de_login() {
	    
	}

	@Then("login realizado com sucesso")
	public void login_realizado_com_sucesso() {
	    
	}

}
