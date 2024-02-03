package seleniumPractica;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticaSel {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Obtener objetos/WebElements de la pagina web
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement passwordTxt = driver.findElement(By.name("password"));
		WebElement logintBtn = driver.findElement(By.id("login-button"));
		
		//Hacer login
		userName.sendKeys("standard_user");
		Thread.sleep(500);
		passwordTxt.sendKeys("secret_sauce");
		Thread.sleep(500);
		logintBtn.click();
		
		//Metodos del explorador
		//obtener el titulo de la pagina
		String title = driver.getTitle();
		System.out.println("el titulo de la pagina es: " + title);
		
		//Obtener la URL
		String url = driver.getCurrentUrl();
		System.out.println("La url actual es: " + url);
		
		//Metodos navegacion
		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().forward();
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		
		//verifica elemento desplegado en la pagina
		boolean prodcut = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		if(prodcut) {
			System.out.println("El articulo es desplegado");
		}
		
		//Obtener el texto de un Webelement
		String prodText = driver.findElement(By.className("inventory_item_name")).getText();
		
		boolean textCorrect = prodText.contains("Sauce Labs Backpack");//Contains es un metodo de JAVA que evalua 2 strings
		
		if(textCorrect) {
			System.out.println("El nombre del producto es correcto");
		}else {
			System.out.println("ERROR: El producto no es correcto");
		}
		Thread.sleep(2000);

		//Dropdown
		Select dropdwn = new Select(driver.findElement(By.className("product_sort_container")));
		dropdwn.selectByValue("lohi");
		
		//driver.close(); //cierra la ventana actual con la que se esta interactuando
		driver.quit(); //Ceiera todas la ventanas o pestañas que se abrieron que se abrieron
	}

}
