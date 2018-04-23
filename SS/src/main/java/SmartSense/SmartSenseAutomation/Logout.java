package SmartSense.SmartSenseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.LogStatus;

public class Logout extends BaseClass {

	public void logout(WebDriver driver) throws InterruptedException {

		Thread.sleep(5000);
		System.out.println("Logout Started");
		Thread.sleep(5000);
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(5000);
		test.log(LogStatus.PASS, "Logout menu drop down open");

		driver.findElement(By.cssSelector(".fa-power-off")).click();
		Thread.sleep(5000);
		test.log(LogStatus.PASS, "Logout link clicked");
		
		driver.findElement(By.xpath("//button[@data-bb-handler='confirm']")).click();
		//driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		Thread.sleep(20000);
		test.log(LogStatus.PASS, "Logout confirmed ");
		
		
		/*
		 * driver.findElement(By.xpath("//*[@id=\"dLabel\"]")).click();
		 * 
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/div[1]/headerpanel/div[3]/div/div[2]/ul[2]/li/ul/li[5]/a"
		 * )) .click();
		 * driver.findElement(By.cssSelector("dropdown keep-open")).click();
		 */

	}
}
