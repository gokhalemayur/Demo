package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.base.FinalizablePhantomReference;

public class SensorConfig_POM {

	public static String AddSensor_btn = "/html/body/div[1]/div/div[2]/div/div[1]/div[1]/div[2]/h4/button[2]"; // by
																												// xpath
	public static String SensorName_field = "//*[@id=\"name\"]"; // by Xpath
	public static String Description_field = "//*[@id=\"description\"]"; // by Xpath
	public static String Mac_field = "//*[@id=\"macaddress\"]"; // by Xpath
	public static String Appliancetype_field = "/html/body/div[1]/div/div[2]/div/div[1]/div[1]/div[2]/ng-include[1]/div/div/div/form/div[2]/div[6]/div/div[1]/span"; // by
																																										// Xpath
	public static String Metermake_field = "//span[contains(.,'Select Meter Make')]"; // by Xpath
	public static String Save_btn = "//button[contains(@ng-click,'save_sensor(SensorForm, selected_sensor)')]"; // by
																												// Xpath
	public static String Reset_btn = "//button[contains(@ng-click,'save_sensor(SensorForm, selected_sensor)')]"; // by
																													// Xpath
	public static String BulkUpload_btn = "//button[contains(@ng-click,'show_upload()')]"; // by Xpath
	public static String DownloadSheet_btn = "//button[contains(@ng-click,'download_template()')]"; // by Xpath
	public static String Browse_btn = "/html/body/div[1]/div/div[2]/div/div[1]/div[1]/div[2]/ng-include[2]/div/div/div/div[2]/div[2]/input"; // by
																																				// Xpath
	public static String Upload_btn = "//button[contains(@ng-click,'item.upload()')]"; // by Xpath
	public static String Search_field = "/html/body/div[1]/div/div[2]/div/div[1]/div[1]/div[2]/h4/div/input"; //by Xpath
	public static String Edit = "/html/body/div[1]/div/div[2]/div/div[1]/div[1]/div[2]/div/table/tbody/tr[1]/td[7]"; //by Xpath
	public static String Manual_checkbox = "/html/body/div[1]/div/div[2]/div/div[1]/div[1]/div[2]/ng-include[1]/div/div/div/form/div[2]/div[4]/label/input"; //by Xpath
	//public static String Manual_chekbox = "//checkbox[contains(@ng-checked,'selected_sensor.ismanualupload')]"; //by cssSelector
	public static String filepath = "/home/ecolibrium/Downloads/SensorConfiguration (23).xlsx";
	
	public static void AddSensor_btn(WebDriver driver) {
		driver.findElement(By.xpath(AddSensor_btn)).click();
	}

	public static void SensorName(WebDriver driver,String name) {
		driver.findElement(By.xpath(SensorName_field)).sendKeys(name);
	}

	public static void Description(WebDriver driver,String Desc) {
		driver.findElement(By.xpath(Description_field)).sendKeys(Desc);
	}

	public static void MacAddress(WebDriver driver,String Mac) {
		driver.findElement(By.xpath(Mac_field)).sendKeys(Mac);
	}
	
	public static void Manual_checkbox(WebDriver driver) {
		driver.findElement(By.xpath(Manual_checkbox)).click();
	}

	public static void Appliancetype(WebDriver driver) {
		driver.findElement(By.xpath(Appliancetype_field)).click();
	}

	public static void MeterMake(WebDriver driver) {
		driver.findElement(By.xpath(Metermake_field)).click();
	}

	public static void Save_btn(WebDriver driver) {
		driver.findElement(By.xpath(Save_btn)).click();
	}

	public static void Reset_btn(WebDriver driver) {
		driver.findElement(By.xpath(Reset_btn)).click();
	}

	public static void BulkUpload_btn(WebDriver driver) {
		driver.findElement(By.xpath(BulkUpload_btn)).click();
	}

	public static void DownloadPISheet_btn(WebDriver driver) {
		driver.findElement(By.xpath(DownloadSheet_btn)).click();
	}

	public static void Browser_btn(WebDriver driver) {
		driver.findElement(By.xpath(Browse_btn)).sendKeys(filepath);
	}

	public static void Upload_btn(WebDriver driver) {
		driver.findElement(By.xpath(Upload_btn)).click();
	}

	public static void Search_field(WebDriver driver,String search) {
		driver.findElement(By.xpath(Search_field)).sendKeys(search);
	}
	
	public static void Edit(WebDriver driver) {
		driver.findElement(By.xpath(Edit)).click();
	}
}
