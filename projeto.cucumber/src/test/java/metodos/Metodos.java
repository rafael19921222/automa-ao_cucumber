package metodos;

import org.openqa.selenium.By;

import drivers.DriversFactory;

public class Metodos extends DriversFactory {

	public  void escrever(By elemento, String texto, String passo) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("*** Erro Ao Escrever No Passo" + passo + "***");
			System.out.println("*** Causa Do Erro *** " + e.getCause());
			System.out.println("*** Mensagem Do Erro ***" + e.getMessage());

		}

	}

	public void clicar(By elemento, String passo) {
		try {
			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.out.println("*** Erro Ao Clicar No Passo" + passo + "***");
			System.out.println("*** Causa Do Erro *** " + e.getCause());
			System.out.println("*** Mensagem Do Erro ***" + e.getMessage());
		}

	}

}
