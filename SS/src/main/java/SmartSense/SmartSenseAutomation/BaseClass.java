package SmartSense.SmartSenseAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseClass {

	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;

	@BeforeSuite
	public void beforesuite() {
		extent = new ExtentReports("STMExtentReport.html", true);

		//extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
	}

	@BeforeTest
	public void initialize() throws InterruptedException {

		test = extent.startTest("initialize");

		driver = new ChromeDriver();
		test.log(LogStatus.PASS, "Browser launch Successfully");

		driver.get("https://server2.smartsen.se");
		String CurrentURL = driver.getCurrentUrl();
		test.log(LogStatus.PASS, "The Current URL of the page :: " + CurrentURL);
		System.out.println("Open");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		String Tittle = driver.getTitle();
		System.out.println("Tittle name is : " + Tittle);
		// return driver;

		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Browser Open");

	}

	@AfterTest
	public void End() {
		driver.quit();
	}

	@AfterSuite
	public void aftersuite() {
		extent.endTest(test);
		
		extent.flush();
		extent.close();
		
	}

}
