package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginPage {

	public static WebElement userName() {
		return Driver.driver.findElement(By.id("email"));
	}
	
	public static WebElement password() {
		return Driver.driver.findElement(By.id("pass"));
	}

	public static WebElement logInButton() {
		return Driver.driver.findElement(By.name("login"));
	}
	
	
}
