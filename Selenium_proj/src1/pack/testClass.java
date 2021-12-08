package pack;
	
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
	
public class testClass extends Common{
	/*@BeforeClass
	public void searchForFrind() throws InterruptedException {
		Events.enterValue(Driver.driver.findElement(By.xpath("//input[@type='search']")), "Thulasi");
	 Events.clickOnelement(Driver.driver.findElement(By.xpath("//ul[@aria-label='9 suggested searches']/li[1]//span/span/span[2]")));
	 for(WebElement ele: Events.waitForElements(By.xpath("//span[contains(text(),'Thulasi')]"))) {
		 System.out.println(ele.getText());
		 Assert.assertTrue(ele.getText().contains("Thulasi"), "Thulasi not fount in element text");
	 }
	 System.out.println("All Thulasi related friends are printed");
	}
	
	@Test(priority = 2)
	public void getCountOfFriends() throws InterruptedException {
		Thread.sleep(5000);
		Driver.driver.findElement(By.xpath("//div[@aria-label='Account controls and settings']//a/span/span/../preceding-sibling::div/div")).click();
		Thread.sleep(5000);
		System.out.println(Driver.driver.findElement(By.xpath("//span[text()='Friends']/span[2]")).getText());
		Assert.assertTrue(Driver.driver.findElement(By.xpath("//span[text()='Friends']/span[2]")).getText().equals("11"),"friends is not equal to 11");
		System.out.println("friends is equal to 11");
		
		*/
		
		
		
		/*
		 * Driver.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		 * Driver.driver.manage().timeouts().pageLoadTimeout(1000,TimeUnit.MILLISECONDS)
		 * ;
		 * 
		 * Driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 * Driver.driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
		 * 
		 * Duration d= Driver.driver.manage().timeouts().getPageLoadTimeout();
		 * 
		 * Driver.driver.manage().timeouts().wait(1000);
		 * 
		 * 
		 * FluentWait<WebDriver> fluentWait=new FluentWait<WebDriver>(Driver.driver);
		 * 
		 * fluentWait.withTimeout(Duration.ofSeconds(10));
		 * 
		 * fluentWait.pollingEvery(Duration.ofMillis(300));
		 * 
		 * fluentWait.ignoring(NoSuchElementException.class);
		 * 
		 * fluentWait.until(ExpectedConditions.visibilityOf(Driver.driver.findElement(By
		 * .id(""))));
		 * }
		 */
		
	
	
	
	
	
	
	
	
	
	@Test
	public void softAssert(){
		SoftAssert softAssertion= new SoftAssert();
		System.out.println("softAssert Method Was Started");
		softAssertion.assertEquals(10, 11);
		System.out.println("softAssert Method Was Executed");
		softAssertion.assertEquals(10, 11,"ijfiekpoedqokpeuirh");
		System.out.println("softAssert Method Was Executed");
		softAssertion.assertEquals(10, 11);
		System.out.println("softAssert Method Was Executed");
		softAssertion.assertAll();
	}
	
	@Test
	public void hardAssert(){
		System.out.println("hardAssert Method Was Started");
		Assert.assertEquals(12, 12);
		System.out.println("hardAssert Method Was Executed");
	}
	
}
