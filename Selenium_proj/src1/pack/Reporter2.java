package pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import freemarker.log.Logger;

public class Reporter2 {

	public Logger detailedLog;
	public String curTestName;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	public int i = 0;
	static ChromeDriver driver;

	@BeforeTest
	public void initiateReport(ITestContext ctx) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String fileName = ctx.getName() + "_" + timeStamp + ".log";
		String filePath = System.getProperty("user.dir") + "\\Logs\\" + fileName;
		File f = new File(filePath);

		System.setProperty("log.file", filePath);
		System.setProperty("log.parent.path", f.getParent());
		System.setProperty("log.file.name", FilenameUtils.getBaseName(f.getName()));
		detailedLog = Logger.getLogger(ctx.getName());

		String logFilePath = System.getProperty("user.dir") + "/Execution Results/" + "RAM"+ ".html";
		detailedLog.info("-----Initializing the extent report : " + logFilePath);
		htmlReporter = new ExtentHtmlReporter(logFilePath);
		extent = new ExtentReports();
		//extent.
		curTestName = ctx.getName();
		detailedLog.info("Retrieved the current Test Name as  : " + curTestName);
		System.out.println(logFilePath);
		try {
			extent.setSystemInfo("Host Name", InetAddress.getLocalHost().getHostName());
			extent.setSystemInfo("IP Address", InetAddress.getLocalHost().getHostAddress());
			extent.setSystemInfo("User Name", System.getProperty("user.name"));

		} catch (UnknownHostException e) {

			e.printStackTrace();
		}
		htmlReporter.config()
				.setDocumentTitle("Execution results for Suit : " + ctx.getSuite().getName() + " - " + timeStamp);
		htmlReporter.config().setReportName("Report for Test : " + ctx.getSuite().getName());
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);

	}

	@Test(priority = -1)
	public void test1(ITestContext ctx) {
		System.out.println("-1");
	}

	@Test(priority = 2)
	public void test2(ITestContext ctx) {
		System.out.println("2");
	}

	@Test(priority = -3)
	public void test3(ITestContext ctx) {
		System.out.println("-3");
	}

// **************************************************************************************************
//@AfterTest
	public void finalizeLog(ITestContext ctx) {

		Status currentResult = logger.getStatus();

		switch (currentResult) {
		case PASS:
			logger.log(Status.PASS, MarkupHelper.createLabel("Test Case has been Passed.", ExtentColor.GREY));
			Assert.assertTrue(true);
			break;

		case FAIL:
			logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case has been failed.", ExtentColor.RED));
			Assert.fail("Test " + ctx.getName() + " has been failed.");
			break;

		case WARNING:
			logger.log(Status.WARNING, MarkupHelper.createLabel("Test Case has been Passed.", ExtentColor.YELLOW));
			Assert.assertTrue(true, "Test " + ctx.getName() + " passed with warnings.");
			break;

		default:
			break;
		}
		extent.flush();

	}

// *******************************************************************************

	public void highlightElement(WebElement element, String stepName, int maxTimeToWait) {
		JavascriptExecutor jse = (JavascriptExecutor) Driver.driver;
		jse.executeScript("arguments[0].style.border='3px solid red'", element);
	}

//******************************************
	public String getScreenshot(String locator) {
		// System.out.println("Taking screenshot of the page with the locator " +
		// locator);
		// Remove illegal file name characters from the locator
		String legalNamelocator = locator.toString().replaceAll("[^a-zA-Z0-9\\._]+", "");
		// Take a screenshot of the current page
		String screenShotDir = System.getProperty("user.dir") + "/Execution Results/Screenshots" + "/";

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String newFilePath = screenShotDir + legalNamelocator + "_"
				+ new SimpleDateFormat("MM.dd_HH.mm.ss:SSS").format(new Date()) + "" + ".png";
		File newFileName = new File(newFilePath);

		try {
			FileUtils.moveFile(screenshot, newFileName);
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return newFilePath;

	}
// *******************************************************************************

	public String captureScreenshotToBase64(String imageName) {
		String encodedfile = "";

		String ImagePath = getScreenshot(imageName);

		try {
			File imageFile = new File(ImagePath);
			FileInputStream fileInputStreamReader = new FileInputStream(imageFile);
			byte[] bytes = new byte[(int) imageFile.length()];
			fileInputStreamReader.read(bytes);
			encodedfile = Base64.getEncoder().encodeToString(bytes);
			fileInputStreamReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}

		return encodedfile;

	}

// *************************************************************************************************

	public void writeLog(String status, String stepName, String actualResult) {
		Status stepStatus;

		switch (status.toLowerCase()) {
		case "pass":
			stepStatus = Status.PASS;
			break;
		case "fail":
			stepStatus = Status.FAIL;
			break;

		case "warning":
			stepStatus = Status.WARNING;
			break;

		default:
			stepStatus = Status.INFO;
			break;

		}
		logger.log(stepStatus, stepName + '\n' + '\n' + actualResult);

	}

// *********************************************************************************************

	public void writeLog(String status, String stepName, String actualResult, String screenshotName) {
		Status stepStatus;

		switch (status.toLowerCase()) {
		case "pass":
			stepStatus = Status.PASS;
			break;
		case "fail":
			stepStatus = Status.FAIL;
			break;

		case "warning":
			stepStatus = Status.WARNING;
			break;

		default:
			stepStatus = Status.INFO;
			break;

		}

		logger.log(stepStatus, "Step Name : " + stepName + '\n' + '\n' + "Actual Result : " + actualResult,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshotToBase64(screenshotName)).build());
	}

	public void writeLog1(String status, String stepName, String actualResult, String screenshotName) {
		Status stepStatus;
		switch (status.toLowerCase()) {
		case "pass":
			stepStatus = Status.PASS;
			break;
		case "fail":
			stepStatus = Status.FAIL;
			break;

		case "warning":
			stepStatus = Status.WARNING;
			break;

		default:
			stepStatus = Status.INFO;
			break;

		}

		logger.log(stepStatus, "Step Name : " + stepName + '\n' + '\n' + "Actual Result : " + actualResult,
				MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot(screenshotName)).build());

	}

}
