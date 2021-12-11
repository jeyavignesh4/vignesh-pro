package webpackage.com;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptscrolldownup {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor) driver;//narrowing
	js.executeScript("window.scroll(0,3000)","");
	Thread.sleep(3000);
	js.executeScript("window.scroll(0,-3000)","");
	
	WebElement help = driver.findElement(By.xpath("(//a[@class='nav_a'])[4]"));
	js.executeScript("arguments[0].scrollIntoView(true)",help);
	
	js.executeScript("arguments[0].click()",help);
}
}
