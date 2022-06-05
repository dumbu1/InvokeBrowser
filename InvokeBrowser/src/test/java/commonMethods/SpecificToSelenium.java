package commonMethods;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SpecificToSelenium {
	
	public static void validate_PageTitle(WebDriver driver,String expectedPageTitle) {
		
		Assert.assertEquals("window title "+expectedPageTitle+" doesnot match",expectedPageTitle, driver.getTitle());
		
	}

}
