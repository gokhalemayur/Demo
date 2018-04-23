package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reports_POM {

	public static WebElement element = null;
	
	public static WebElement SensorConfig_Menu(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(.,'Reports')]"));
		return element;
	}
	
}
