package petdisesealert_utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pet_Utils {

	public static WebDriver driver;

	// WebDriver initialization
	public  WebDriver browser(String browser)
	{
		switch(browser)
		{
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "safari":
			driver=new SafariDriver();
			break;
		case "FireFox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			default :
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;	
		}
		driver.get("https://petdiseasealerts.org/forecast#/");
		driver.manage().window().maximize();
		return driver;
	}
	
	//opening states
	
 public void openstate(String st_name) throws Exception
 {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,300)");// to view the down element
	 Thread.sleep(2000);
	 WebElement country=driver.findElement(By.xpath("//*[name()=\"svg\" and @id=\"map-svg\"]/*[name()=\"g\" ]/*/*[@id=\""+st_name+"\"]/*[name()=\"path\"]"));
	 
	
 Actions act=new Actions(driver);
 act.moveToElement(country).doubleClick().build().perform();
 }

}
