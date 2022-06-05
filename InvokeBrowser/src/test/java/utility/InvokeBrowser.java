package utility;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeBrowser {
	
	
	private static WebDriver driver=null;
	
	private static Properties getPropertiesFromPropertyReader;
	
	public WebDriver setDriver() {
		
		//creating the object of PropertyReader by passing the property file name
		PropertyReader obj_PropertyReader=new PropertyReader("browser_url.properties");
		//to get the property values
		getPropertiesFromPropertyReader=obj_PropertyReader.propertyReader();
		
		if(getPropertiesFromPropertyReader.getProperty("browser").equalsIgnoreCase("chrome")) {
			ChromeOptions obj_chromeoOptions=new ChromeOptions();
			obj_chromeoOptions.addArguments("InCognito");
			obj_chromeoOptions.addArguments("start-maximized");
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(obj_chromeoOptions);
		}
				
		
		return driver;
	}
	
	
	//to get browser
	
	public static WebDriver getDriver() {
		
		return driver;
	}
	
	//to open url
	
	public WebDriver openUrl(WebDriver driver) {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
		driver.get(getPropertiesFromPropertyReader.getProperty("url"));
		
		return driver;
	}
	
	//to close browser
	public static void bowserClose(WebDriver diriver) {
		driver.close();
	}

}
