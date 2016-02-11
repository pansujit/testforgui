package com.platform.gui.test;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testfortest {
	
	
	
	public  WebDriver driver;
	
	
	
	@Test
	public void testtoFR() throws InterruptedException{
		
		
		driver=new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "C:\\eclipsEspace\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.get("https://platform-stag.systran.net");
		//driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(1920, 1080));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='signinLink']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='signinMenu']/div/div/div[2]/div/a[1]")).click();
		driver.findElement(By.name("username")).sendKeys("sujit.pandey@systrangroup.com");
		driver.findElement(By.name("password")).sendKeys("SESpassword");
		driver.findElement(By.xpath(".//*[@id='submit_login']")).click();
		
		
	List<WebElement> list=driver.findElements(By.xpath(".//*[@id='developer']"));
		
	
		
		for(WebElement linkme:list){
			if(linkme.getAttribute("title").contains("Reference")){
				Thread.sleep(2000);
				linkme.click();
				Thread.sleep(2000);
									
			}
							
			}
		driver.findElement(By.xpath(".//*[@id='navBar']/ul[1]/li[1]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.id("documentationContent")));
		
		//List<WebElement> list1=driver.findElements(By.cssSelector("#input_apiKey"));
		//System.out.println(list1.size());
		//System.out.println(list1.get(1).isDisplayed());
		//driver.executeScript("document.getElementById('list1.get(1)').setAttribute('placeholder', 'hello')");
		
		//JavascriptExecutor ldriver = (JavascriptExecutor)driver;
		//ldriver.executeScript("document.getElementByXpath('.//*[@id='input_apiKey']').setAttribute('placeholder', 'hello')");
		//ldriver.executeScript("arguments[0].setAttribute('placeholder', '" + "hello"+"')", driver.findElements(By.xpath(".//*[@id='input_apiKey']")));
		

		
	
		
		/*if (list1.get(1).isDisplayed()) {
			list1.get(1).sendKeys("hello");
			}*/
		
		
		
	
	}
	
	

}
