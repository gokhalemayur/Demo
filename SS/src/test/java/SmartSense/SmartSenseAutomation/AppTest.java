package SmartSense.SmartSenseAutomation;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AppTest extends BaseClass {

	@Test
	public void test() throws InterruptedException {

		System.out.println("Test Start");

		// new instance

		LoginTest login = new LoginTest();
		login.login(driver);
		System.out.println("Logged in into the applicaiton");

		SensorConfig sensorCon = new SensorConfig();
		sensorCon.sensorConfig(driver);
		
		
		Logout logout = new Logout();
		logout.logout(driver);

		// starting test
		// ExtentTest test = extent.startTest("Test Name", "Sample description");

		// step log
		test.log(LogStatus.PASS, "Step details");

	}

	/*
	 * @Test public void initialize() throws InterruptedException { WebDriver driver
	 * = new ChromeDriver();
	 * 
	 * driver.get("https://server2.smartsen.se"); System.out.println("Open");
	 * driver.manage().window().maximize(); Thread.sleep(10000); String Tittle =
	 * driver.getTitle(); System.out.println("Tittle name is : " + Tittle);
	 * 
	 * driver.findElement(By.name("username")).sendKeys("qa2");
	 * driver.findElement(By.name("password")).sendKeys("qa2");
	 * System.out.println("Credentail etered");
	 * driver.findElement(By.cssSelector(".btn-lg")).click();
	 * 
	 * driver.quit(); }
	 */
}