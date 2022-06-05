package stepDefinations;


import commonMethods.SpecificToSelenium;
import io.cucumber.java.en.*;
import utility.InvokeBrowser;


public class HomePage {
	
	
	@Given("user is on home page with title \"(.*)\"$")
	public void user_is_on_home_page(String expectedPageTitle) {
	    SpecificToSelenium.validate_PageTitle(InvokeBrowser.getDriver(), expectedPageTitle);
	}

}
