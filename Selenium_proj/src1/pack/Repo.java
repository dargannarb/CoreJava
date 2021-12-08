package pack;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentXReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Repo {
	// builds a new report using the html template
	ExtentHtmlReporter htmlReporter;

	ExtentReports extent;
	// helps to generate the logs in test report.
	ExtentTest test;

	//@Parameters({ "OS", "browser" })
	@BeforeTest
	public void startReport() {
		 ExtentHtmlReporter html = new ExtentHtmlReporter("Execution Results//RAM.htmls");
		 ExtentXReporter extentx = new ExtentXReporter("localhost");
		 
		 ExtentReports extent = new ExtentReports();
		// extent.attachReporter(html, extentx);
		 
		 extent.createTest("TestName").pass("Test Passed");
		 
		 extent.flush();
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Extent Report Demo");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	}

	@Test
	public void testCase1() {
		test = extent.createTest("Test Case 1", "PASSED test case");
		Assert.assertTrue(true);
	}

	@Test
	public void testCase2() {
		test = extent.createTest("Test Case 2", "PASSED test case");
		Assert.assertTrue(true);
	}

	@Test
	public void testCase3() {
		test = extent.createTest("Test Case 3", "PASSED test case");
		Assert.assertTrue(true);
	}

	@Test
	public void testCase4() {
		test = extent.createTest("Test Case 4", "PASSED test case");
		Assert.assertTrue(false);
	}

	@Test
	public void testCase5() {
		test = extent.createTest("Test Case 5", "SKIPPED test case");
		throw new SkipException("Skipping this test with exception");
	}

	@Test(enabled = false)
	public void testCase6() {
		test = extent.createTest("Test Case 6", "I'm Not Ready, please don't execute me");
	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " FAILED ", ExtentColor.RED));
			test.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " PASSED ", ExtentColor.GREEN));
		} else {
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " SKIPPED ", ExtentColor.ORANGE));
			test.skip(result.getThrowable());
		}
	}

	@AfterTest
	public void tearDown() {
		// to write or update test information to reporter
		extent.flush();
	}
}
