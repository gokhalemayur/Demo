package SmartSense.SmartSenseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.LogStatus;

public class Report extends BaseClass {

	public void reporting(WebDriver driver) throws InterruptedException {

		test.log(LogStatus.PASS, "Reporting Start");
		driver.findElement(By.cssSelector(".dropdown-toggle ng-binding")).click();
		Thread.sleep(5000);

		driver.findElement(By.cssSelector(".ng-binding")).click();
	}

}
