package webpackage.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_robottask {
public static void main(String[] args) throws AWTException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver\\\\chromedriver.exe");
	WebDriver wd=new ChromeDriver();
	wd.get("https://www.google.com/");
	
	Actions A=new Actions(wd);
	WebElement gmail = wd.findElement(By.xpath("(//a[@class='gb_f'])[1]"));
	A.contextClick(gmail).build().perform();
	
	Robot R=new Robot();
	R.keyPress(KeyEvent.VK_DOWN);
	R.keyRelease(KeyEvent.VK_DOWN);
	R.keyPress(KeyEvent.VK_DOWN);
	R.keyRelease(KeyEvent.VK_DOWN);
	
	R.keyPress(KeyEvent.VK_ENTER);
	R.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	wd.close();	
	}
}
