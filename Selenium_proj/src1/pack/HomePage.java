package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends Common {
	
	public static WebElement profileLogo() {
		return Driver.driver.findElement(By.xpath("//span[text()='Aravind']"));
	}
}
