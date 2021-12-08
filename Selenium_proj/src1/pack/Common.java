package pack;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Common {
		Utils util=new Utils();
		
	@Parameters("browser")
	@BeforeSuite
	public void launchBrowser(@Optional String browser) throws IOException {
		browser=(browser==null)?"chrome":browser;
		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			Driver.driver=new ChromeDriver(options);
			break;
		case "ff":

			break;
		case "ie":

			break;
		default:
			break;
		}
	}

	public void launchApp(String url) {
		Driver.driver.get(url);
		Driver.driver.manage().window().maximize();
	}
	
	@BeforeTest
	public void logIn() throws IOException {
		Data.config=util.readDataFromPropFile("Data/config.properties");
		Data.testData=util.readDataFromPropFile("Data/testData.properties");
		launchApp(Data.config.get("url"));
		Utils.takeScreenShotOfWebPage("logInPage");
		Assert.assertEquals(Driver.driver.getTitle(), "Facebook – log in or sign up","app is not launched");
		System.out.println("App launched successfully");
		Events.enterValue(loginPage.userName(), Data.config.get("userName"));
		Events.enterValue(loginPage.password(), Data.config.get("password"));
		Events.clickOnelement(loginPage.logInButton());
		Assert.assertTrue(Driver.driver.findElement(By.xpath("//div[@aria-label='Account controls and settings']//a/span/span/../preceding-sibling::div/div")).isDisplayed(),"Login is not successfull");
		Utils.takeScreenShotOfWebPage("HomePage");
		System.out.println("Login is successfull");
	}
}
