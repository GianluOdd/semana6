package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	
	@Given("abrir chrome")
	public void abrir_chrome() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("En este paso abre el navegador google chrome");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\gianl\\Downloads\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://ced.iplacex,cl/login/index.php");
	    
	}

	@When("ingresa Username {string} Password {string}")
	public void ingresa_Username_Password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("En este paso ingresa las credenciales de usurio");
		 System.out.println("En este se ingresa el usuario y la clave");
		 driver.findElement(By.id("username")).sendKeys(string);
		 driver.findElement(By.id("password")).sendKeys(string2);
	}

	@Then("inicia sesion")
	public void inicia_sesion() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("En este paso inicia sesion con los datos desde Mytest");
		 driver.findElement(By.id("loginbtn")).click();
	}

}
