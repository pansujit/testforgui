package com.platform.gui.test;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;
import com.thoughtworks.selenium.Wait;

/**
 * @author pandey
 *
 */
public class Fileuploadclass {
	
	
public static WebDriver driver;
public static String FILE_PATH = "src/test/resources/file.txt";
	
	
	@Test
	public void openBrowser() throws InterruptedException{
		driver=new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "C:\\eclipsEspace\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.get("https://platform.systran.net/index/");
		//driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(1920, 1080));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(10000);
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
		
		//List<WebElement> list1=driver.findElements(By.xpath(".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]/div[1]"));
		//WebDriverWait wait = new WebDriverWait(driver, 5);
	   /* List<WebElement> listme=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]")));
		System.out.println(listme.size());
		for (WebElement linkme: listme){
			
			System.out.println(linkme.getAttribute("id"));
		}*/
		
		/*JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are " + numberOfFrames);
		//driver.findElement(By.xpath(".//div[#'swagger_sidebar']/div/div/div[2]/div[2]/div[1]/input[@id='input_apiKey']")).sendKeys("hello");*/
		//driver.switchTo().frame("");
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[id='documentationContent']")));
		driver.switchTo().frame(driver.findElement(By.id("documentationContent")));
		//WebElement heloo = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("".//*[@id='input_apiKey']"")));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='input_apiKey']")));
				
		//driver.findElement(By.xpath(".//*[@id='input_apiKey']")).sendKeys("hello");
		//driver.findElement(By.partialLinkText("Enter api key")).sendKeys("hello");
		
		//WebElement elem = driver.findElement(By.xpath(".//*[@id='input_apiKey']"));
		//String js = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";

		//((JavascriptExecutor) driver).executeScript(js, elem);
		//elem.sendKeys("hello");
		
		//Actions action = new Actions(driver);
		/*WebElement mainElement = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[2]/div[2]/div[1]/input']"));
		action.moveToElement(mainElement).perform();
		WebElement subElement = driver.findElement(By.id("input_apiKey"));
		action.moveToElement(subElement);
		action.sendKeys("hello");
		action.perform();*/
		
		
		//driver.findElement(By.xpath("//input[@id='edit-box-big' and @placeholder='Job Title *']"))
		//driver.findElement(By.xpath("//div[@class='panel-body']//div[@class='area controls']//input[@id='input_apiKey']")).sendKeys("14e3b094-1def-4673-a3fe-d4abaed56a9f");;
		Thread.sleep(10000);
		List<WebElement> list1=driver.findElements(By.xpath(".//*[@id='input_apiKey']"));
		System.out.println(list1.size());
		if (list1.get(1).isDisplayed()) {
			list1.get(1).sendKeys("hello");
			}
		else{
			System.out.println("display is not enabled");
		}
		driver.findElement(By.xpath(".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]")).click();;
			
		//driver.switchTo().defaultContent();
		//driver.findElement(By.xpath(".//*[@id='parm-Translation_post_translation_text_translate']/div[1]/div[2]/input")).sendKeys("hello");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]/div[2]")).click();
		Thread.sleep(2000);
		
		String x=null;
			File file = new File(FILE_PATH);
		if (file.exists())
		{
		    System.out.println(" file found!");
			 x=file.getAbsolutePath();
		}
		else{
			System.out.println("No file found");
		}
		
		//driver.findElement(By.xpath(".//*[@id='parm-Translation_post_translation_file_translate']/div[1]/div[2]/input")).sendKeys(FILE_PATH);
		//driver.findElement(By.cssSelector(".parameter.form-control.required")).sendKeys("C:\\Users\\pandey\\Documents\\test.txt");
		driver.findElement(By.xpath("//div[@id='parm-Translation_post_translation_file_translate']//div[@class='parameter-item']//div[@class='param-property']//input[@name='input']")).sendKeys(x);

		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='parm-Translation_post_translation_file_translate']/div[2]/div[2]/input")).clear();
		driver.findElement(By.xpath(".//*[@id='parm-Translation_post_translation_file_translate']/div[2]/div[2]/input")).sendKeys("en");
		driver.findElement(By.xpath(".//*[@id='parm-Translation_post_translation_file_translate']/div[3]/div[2]/input")).sendKeys("fr");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Translation_post_translation_file_translate']/div/form/div[6]/input")).click(); 
		
	//driver.findElement(By.xpath("//div[@id='parm-Translation_post_translation_file_translate']//div[@class='parameter-item']//div[@class='param-property']//input[@name='input']")).click();
	}

}