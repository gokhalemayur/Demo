package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_POM {

	public static WebElement element = null;

	public static WebElement Username(WebDriver driver) {
		element = driver.findElement(By.name("username"));
		return element;
	}

	public static WebElement Password(WebDriver driver) {
		element = driver.findElement(By.name("password"));
		return element;
	}
	
	public static WebElement Login_btn(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".btn-lg"));
		return element;
	}
}
