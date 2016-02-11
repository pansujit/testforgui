/**
 * 
 */
package com.platform.path.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author sujit
 *
 */
public class LocatorsInResourcesAPI {
	
	public WebDriver driver;
	
	public  LocatorsInResourcesAPI(WebDriver ldriver){
		this.driver=ldriver;
	}
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]") public WebElement clickdictionary;
	

}
