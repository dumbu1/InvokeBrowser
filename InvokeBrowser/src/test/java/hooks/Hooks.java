package hooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.InvokeBrowser;

public class Hooks {
	
	
	public static WebDriver driver;
	public static InvokeBrowser obj_invokBrowser;
	
	//to open browser and url
	@Before
	public void openBrowserAndUrl() {
		
		obj_invokBrowser=new InvokeBrowser();
		driver=obj_invokBrowser.openUrl(obj_invokBrowser.setDriver());
	}
	
	//to close browser
	@After
	public void closeBrowser() {
		obj_invokBrowser.bowserClose(driver);
	}

}
