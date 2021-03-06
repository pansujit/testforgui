package com.platform.gui.test.baseclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocatorsInReferenceDropDown  {
	
	
	public  WebDriver driver;
	
	public LocatorsInReferenceDropDown(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	@FindBy(how=How.XPATH, using=".//*[@id='navBar']/ul[1]/li[1]/ul/li[1]/a") public WebElement clicktranslation;
	@FindBy(how=How.XPATH, using=".//*[@id='navBar']/ul[1]/li[1]/ul/li[2]/a") public WebElement clickNLP;
	@FindBy(how=How.XPATH, using=".//*[@id='navBar']/ul[1]/li[1]/ul/li[3]/a") public WebElement clickResources;
	@FindBy(how=How.XPATH, using=".//*[@id='navBar']/ul[1]/li[1]/ul/li[4]/a") public WebElement clickMultimodal;

	public  WebElement referenceDropDownItems(String name) throws InterruptedException {
		
		WebElement choiceElement=null;
		
		Thread.sleep(5000);
		 List<WebElement> element = driver.findElements(By.xpath("//*[@id='developer']"));
		 
		 //System.out.println(element.size());
		 //System.out.println(element.get(1).getText());
		// JavascriptExecutor executor = (JavascriptExecutor)driver;
		 //executor.executeScript("arguments[0].click();", element.get(0));
		 if(name=="reference")
			 choiceElement=element.get(0);
		 
		 return choiceElement;
	}
	
	
	
	
	
	

}

