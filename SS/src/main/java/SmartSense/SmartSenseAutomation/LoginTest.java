package SmartSense.SmartSenseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import POM.Login_POM;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Log;

public class LoginTest extends BaseClass {

	public void login(WebDriver driver) {
		test.log(LogStatus.PASS, "Login Started");

		try {
			Login_POM.Username(driver).sendKeys("qa1");
			//driver.findElement(By.name("username")).sendKeys("qa1");
			// test.log(LogStatus.PASS, "Username Entered");

			Login_POM.Password(driver).sendKeys("Abcd@123");
			//driver.findElement(By.name("password")).sendKeys("Abcd@123");
			// test.log(LogStatus.PASS, "Password Entered")

			System.out.println("Credentail etered");
			Login_POM.Login_btn(driver).click();
			//driver.findElement(By.cssSelector(".btn-lg")).click();
			Thread.sleep(10000);

			String CurrenTittle = driver.getTitle();
			String ActualTittle = "My Dashboard - SmartSense";
			// Assert.assertEquals(ActualTittle, CurrenTittle);

			// Boolean logo = driver.findElement(By.cssSelector(".ng-scope")).isDisplayed();
			if (CurrenTittle.equals(ActualTittle)) {
				test.log(LogStatus.PASS, "Login Successfully");
			} else {
				test.log(LogStatus.FAIL, "Login Failed");
			}
		}

		catch (Exception e) {

			System.out.println("Generated Exception is " + e);
			test.log(LogStatus.FAIL, "Login Failed");
		}

	}
}
