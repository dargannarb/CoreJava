package pack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class Events {
	static Alert alert;

	public static void clickOnelement(WebElement ele) {
		waitForElement(ele).click();
	}

	public static void enterValue(WebElement ele, String value) {
		waitForElement(ele).sendKeys(value);
	}

	public static void acceptAlert() {
		alert = Driver.driver.switchTo().alert();
		alert.accept();
	}

	public static void rejectAlert() {
		alert = Driver.driver.switchTo().alert();
		alert.dismiss();
	}
	
	public static void isDisplayed(WebElement ele ,String stepName) {
		if(waitForElement(ele).isDisplayed()) {
			System.out.println(stepName);
		}else {
			System.out.println("NOT Dispalyed "+stepName);
			System.exit(0);
		}
	}
	
	public static WebElement waitForElement(WebElement ele) {
		WebDriverWait wait=new WebDriverWait(Driver.driver,10);
		wait.pollingEvery(Duration.ofMillis(100));
		return wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static List<WebElement> waitForElements(By by) {
		WebDriverWait wait=new WebDriverWait(Driver.driver, 20);
		wait.pollingEvery(Duration.ofMillis(200));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
	}
}
