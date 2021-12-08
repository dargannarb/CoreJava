package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE {
	static JavascriptExecutor jse;
	static WebElement element;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		 jse = (JavascriptExecutor) driver;
		/*
		 * scroll highlight element buttons and fields we r not able to do action
		 * selenium
		 * 
		 * 
		 */

		// arguments[0].scrollIntoView(); upto given element visable
		// window.scrollTo(document.body.scrollHeight,0) - to scroll full body hieght
		// vertical
		// window.scrollBy(x-pixels,y-pixels) - to scroll particular position
		// arguments[0].click();
		element = driver.findElement(By.id("twotabsearchtextbox"));
		enterValueIntoElementWithHighLightByUsingJSE(element, driver, "apple");

		element = driver.findElement(By.id("nav-search-submit-button"));
		clickOnElementWithHighLightByUsingJSE(element, driver);
		
		element=driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (64GB) - Black']"));
		clickOnElementWithHighLightByUsingJSE(element, driver);
		
		
	}

	public static void clickOnElementWithHighLightByUsingJSE(WebElement element, WebDriver driver) throws InterruptedException {
		jse.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
		Thread.sleep(2000);
		jse.executeScript("arguments[0].click();", element);
	}

	public static void enterValueIntoElementWithHighLightByUsingJSE(WebElement element, WebDriver driver,
			String value) throws InterruptedException {
		jse.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
		Thread.sleep(2000);
		jse.executeScript("arguments[0].value='" + value + "'", element);
		
	}
//   org.openqa.selenium.StaleElementReferenceException:
}
