package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action_class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("thulasiram5333@gmail.com");
		
		
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
		
		
		
		
		
		
		
		/*
		 * String []heads= {"Jobs","Recruiters","Companies","Tools","Services","More",
		 * "Login","For Employers"};                
		 * 
		 * List<String> heads=new ArrayList<>(); for(WebElement
		 * ele:driver.findElements(By.xpath("//div[@class='mTxt']"))) {
		 * if(!ele.getText().equals("")) { heads.add(ele.getText()); } }
		 * System.out.println(heads);
		 * 
		 * 
		 * Actions act=new Actions(driver); for(String head:heads) {
		 * System.out.println(head+"\n"+"----------");
		 * act.moveToElement(driver.findElement(By.xpath("//div[text()='"+ head +
		 * "']"))).build().perform(); for(WebElement
		 * ele1:driver.findElements(By.xpath("//div[text()='"+ head +
		 * "']/../../div//a"))) { System.out.println(ele1.getText()); } }
		 */

		/*
		 * Actions act=new Actions(driver); List<WebElement>
		 * headers=driver.findElements(By.xpath("//div[@class='mTxt']")); for(WebElement
		 * ele:headers) { System.out.println(ele.getText()+"\n"+"--------------");
		 * if(!ele.getText().equals("")) { act.moveToElement(ele).build().perform();
		 * for(WebElement ele1:driver.findElements(By.xpath(
		 * "//div[@class='mTxt']/../../div[contains(@class,'subMenu')]/ul/li/a"))) {
		 * System.out.println(ele1.getText()); } } }
		 * 
		 * 
		 * 
		 */

		/*
		 * act.moveToElement(driver.findElement(By.xpath("//div[text()='Jobs']"))).build
		 * ().perform();
		 * System.out.println(driver.findElement(By.xpath("//div[text()='Jobs']")).
		 * getText()+"\n"+"-----------------"); for(WebElement
		 * ele:driver.findElements(By.xpath("//div[text()='Jobs']/../../div//a"))) {
		 * System.out.println(ele.getText()); }
		 * act.moveToElement(driver.findElement(By.xpath("//div[text()='Recruiters']")))
		 * .build().perform();
		 * System.out.println(driver.findElement(By.xpath("//div[text()='Recruiters']"))
		 * .getText()+"\n"+"-----------------"); for(WebElement
		 * ele:driver.findElements(By.xpath("//div[text()='Recruiters']/../../div//a")))
		 * { System.out.println(ele.getText()); }
		 * 
		 * act.moveToElement(driver.findElement(By.xpath("//div[text()='Companies']"))).
		 * build().perform();
		 * System.out.println(driver.findElement(By.xpath("//div[text()='Companies']")).
		 * getText()+"\n"+"-----------------"); for(WebElement
		 * ele:driver.findElements(By.xpath("//div[text()='Companies']/../../div//a")))
		 * { System.out.println(ele.getText()); }
		 * 
		 * act.moveToElement(driver.findElement(By.xpath("//div[text()='Tools']"))).
		 * build().perform();
		 * System.out.println(driver.findElement(By.xpath("//div[text()='Tools']")).
		 * getText()+"\n"+"-----------------"); for(WebElement
		 * ele:driver.findElements(By.xpath("//div[text()='Tools']/../../div//a"))) {
		 * System.out.println(ele.getText()); }
		 * act.moveToElement(driver.findElement(By.xpath("//div[text()='Service']"))).
		 * build().perform();
		 * System.out.println(driver.findElement(By.xpath("//div[text()='Service']")).
		 * getText()+"\n"+"-----------------"); for(WebElement
		 * ele:driver.findElements(By.xpath("//div[text()='Service']/../../div//a"))) {
		 * System.out.println(ele.getText()); }
		 */
	}

}
