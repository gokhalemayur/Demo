package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage_POM {

	public static String MainMenu = "/html/body/div[1]/div/div[1]/headerpanel/div[3]/div/div[2]/ul[1]/li/a"; // by Xpath
	public static String SensorConfig_menu = "//span[contains(.,'Sensor Configuration')]"; // by xpath
	

	public static void ClickMainMenu(WebDriver driver) {
		driver.findElement(By.xpath(MainMenu)).click();
	}
	
	public static void ClickSensorConfig_Menu(WebDriver driver) {
		driver.findElement(By.xpath(SensorConfig_menu)).click();
	}

	
	
}
