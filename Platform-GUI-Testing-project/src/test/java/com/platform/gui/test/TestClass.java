/**
 * 
 */
package com.platform.gui.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author pandey
 *
 */
public class TestClass {

	public static WebDriver driver;
	
	
	@BeforeTest
	public void openBrowser(){
		driver=new FirefoxDriver();
		driver.get("https://platform.systran.net/index/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void mainTest() throws InterruptedException{
		
		String homepage=driver.getWindowHandle();
		System.out.println(homepage);
		driver.findElement(By.xpath(".//*[@id='signinLink']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='signinMenu']/div/div/div[2]/div/a[1]")).click();
		      		
	}
	
}
