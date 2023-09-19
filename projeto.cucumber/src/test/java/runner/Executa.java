package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa  extends DriversFactory{
	
	/**
	 * Metodo Responsal por abrir navegador 
	 */
	
	public static void abrirNavegador() {
		String ambiente = "https://saucedemo.com";
		String navegador = "Chrome";
		
		if(navegador.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			}
		driver.get(ambiente);
		driver.manage().window().maximize();
	}
	
	public static void fecharNavegador () {
		driver.quit();
	}
		
	}
