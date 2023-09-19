package page;

import org.openqa.selenium.By;

import metodos.Metodos;

public class LoginPage {
	Metodos metodos = new Metodos();
	By usuraio = By.id("user-name");
	By senha = By.id("password");
	By btnLogin = By.id("login-button");

	public void login(String ususario, String senha) {

		metodos.escrever(this.usuraio, ususario, "informar os usuario para login");
		metodos.escrever(this.senha, senha, "informar a senha para login");
		metodos.clicar(this.btnLogin, "clicar no batão para login");
	}

}
