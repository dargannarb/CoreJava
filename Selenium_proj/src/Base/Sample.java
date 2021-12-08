package Base;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String mainWindowHandle = driver.getWindowHandle();
		driver.findElement(By.xpath(
				"//div[@class='a-section a-spacing-none']//span[@class='a-size-medium a-color-base a-text-normal']"))
				.click();
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(mainWindowHandle)) {
				driver.switchTo().window(handle);
			}
		}
		driver.switchTo().defaultContent();

		driver.findElement(By.id("buy-now-button")).click();
		boolean bn = driver.findElement(By.id("ap_email")).isDisplayed();

		if (bn) {
			System.out.println("login page is displayed");
		} else {
			System.out.println("login page is NOT displayed");
		}
		Thread.sleep(3000);
		driver.switchTo().window(mainWindowHandle);
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"(//div[@class='a-section a-spacing-none']//span[@class='a-size-medium a-color-base a-text-normal'])[2]"))
				.click();
		handles.clear();
		handles = driver.getWindowHandles();// 3
		for (String handle : handles) {
			if (!handle.equals(mainWindowHandle)) {
				driver.switchTo().window(handle);
				if (driver.getTitle().equals("Apple iPhone XR (64GB) - White : Amazon.in: Electronics")) {
					break;
				}
			}
		}
		driver.findElement(By.id("buy-now-button")).click();
		bn = driver.findElement(By.id("ap_email")).isDisplayed();
		if (bn) {
			System.out.println("login page is displayed");
		} else {
			System.out.println("login page is NOT displayed");
		}
		Thread.sleep(3000);
		driver.close();

		/*
		 * driver=new FirefoxDriver(); driver=new SafariDriver(); driver=new
		 * InternetExplorerDriver();
		 */

		/*
		 * 
		 * 
		 * Select select =new Select(driver.findElement(By.id("countries")));
		 * Thread.sleep(5000); select.selectByValue("usa");
		 * 
		 * select.selectByValue(null); select.selectByIndex(0);
		 * 
		 * 
		 * List<WebElement> elements1 = select.getOptions(); for(WebElement
		 * ele:elements1) { System.out.println(ele.getText()); }
		 * 
		 * Thread.sleep(5000);
		 * 
		 * System.out.println("Selected options ---------------"); elements1 =
		 * select.getAllSelectedOptions(); for(WebElement ele:elements1) {
		 * System.out.println(ele.getText()); }
		 * 
		 * Thread.sleep(5000);
		 */

		/*
		 * 
		 * Alert A; //Actions class Actions action=new Actions(driver);
		 * 
		 * 
		 * 
		 * //action.doubleClick(driver.findElement(By.id("double-click"))).build().
		 * perform();
		 * 
		 * action.clickAndHold(); action.dragAndDrop(null, null).build().perform();
		 * action.contextClick(); action.moveToElement(null).build().perform();
		 * action.sendKeys("").build().perform(); action.click().build().perform();
		 * 
		 * 
		 * action.sendKeys(Keys.chord(Keys.ALT,Keys.F4)).build().perform();
		 * 
		 * 
		 * 
		 */

		/*
		 * WebElement ele= driver.findElement(By.xpath("//input[@name='alert']"));
		 * ele.click(); Thread.sleep(2000); A= driver.switchTo().alert(); A.accept();
		 * 
		 * WebElement ele1=
		 * driver.findElement(By.xpath("//input[@name='confirmation']"));//
		 * UnhandledAlertException: ele1.click(); A= driver.switchTo().alert();
		 * A.accept();
		 * 
		 * 
		 * WebElement ele2= driver.findElement(By.xpath("//input[@name='prompt']"));//
		 * UnhandledAlertException: ele2.click();
		 * driver.switchTo().alert().sendKeys("hello");
		 */

		//
		/*
		 * List<WebElement> searchBox1 =
		 * driver.findElements(By.id("twotabsearchtexhwc djlkbjtbox"));
		 * searchBox1.size();//0 searchBox.sendKeys("Apple");
		 */
		/*
		 * search contex (I) findElement(By by)-- it return webElement if element is not
		 * present in webpage it will throw exception-- NoSuchElementExeception
		 * findElements(By by) -- it return List of WebElements if element is not
		 * present in webpage it will return 0 elemets
		 * 
		 * WebDriver(I) get(); -- to launch URL in browser getCurrentUrl() -- current
		 * page URL getTitle() -- page title getPageSource() -- return html code
		 * getWindowHandles()-- to get window handle for all open windows
		 * 
		 * 
		 * 
		 * WebElement (I)
		 * 
		 * sendKeys(); click(); clear(); getText();
		 * 
		 * 
		 */

	}
}
