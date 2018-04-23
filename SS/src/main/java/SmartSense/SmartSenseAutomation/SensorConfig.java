package SmartSense.SmartSenseAutomation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POM.Homepage_POM;
import POM.SensorConfig_POM;

public class SensorConfig extends BaseClass {

	public void sensorConfig(WebDriver driver) throws InterruptedException {

		Homepage_POM.ClickMainMenu(driver);
		Thread.sleep(5000);

		Homepage_POM.ClickSensorConfig_Menu(driver);
		Thread.sleep(5000);

		SensorConfig_POM.AddSensor_btn(driver);
		Thread.sleep(10000);

		SensorConfig_POM.SensorName(driver, "J4");
		Thread.sleep(5000);

		SensorConfig_POM.Description(driver, "Automaiton");
		Thread.sleep(5000);

		SensorConfig_POM.Manual_checkbox(driver);
		//SensorConfig_POM.MacAddress(driver, "99999#8");
		Thread.sleep(5000);

		SensorConfig_POM.Appliancetype(driver);
		List<WebElement> App_Type_List = driver.findElements(By.cssSelector(".ui-select-choices-row.ng-scope"));

		System.out.println("Size of appliance type : " + App_Type_List.size());
		Thread.sleep(5000);
		App_Type_List.get(1).click();
		Thread.sleep(1000);

		SensorConfig_POM.MeterMake(driver);
		Thread.sleep(10000);
		List<WebElement> MeterMake_List = driver.findElements(By.cssSelector(".ui-select-choices-row.ng-scope"));

		int size = MeterMake_List.size();
		for (int i = 0; i <= size; i++) {

			String EleName = MeterMake_List.get(i).getText();
			if (EleName.equals("Elite 445")) {
				MeterMake_List.get(i).click();
				break;
			}
		}
		Thread.sleep(5000);
		SensorConfig_POM.Save_btn(driver);
		Thread.sleep(10000);

		SensorConfig_POM.BulkUpload_btn(driver);
		Thread.sleep(10000);

		SensorConfig_POM.DownloadPISheet_btn(driver);
		Thread.sleep(10000);

		SensorConfig_POM.Browser_btn(driver);
		Thread.sleep(10000);

		SensorConfig_POM.Upload_btn(driver);
		Thread.sleep(10000);

		SensorConfig_POM.Search_field(driver, "j3");
		Thread.sleep(10000);
		
		SensorConfig_POM.Edit(driver);
		Thread.sleep(10000);
		
	}
}