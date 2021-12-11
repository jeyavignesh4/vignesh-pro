package webpackage.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_types {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// implicit wait//global
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		
		 //explicit wait//local WebElement gift =
		  WebElement gift = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]")); 
		  WebDriverWait w=new WebDriverWait(driver, 30);
		  w.until(ExpectedConditions.invisibilityOf(gift));
		 

		
		  //fluent wait//frequency of interval
		Wait<WebDriver> wait =new FluentWait<WebDriver>(driver) 
				.withTimeout(60,TimeUnit.SECONDS)
		  .pollingEvery(5,TimeUnit.SECONDS) 
		  .ignoring(NoSuchElementException.class);
		  
		 

	}
}