package webpackage.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		WebElement click1 = driver.findElement(By.xpath("//button[@id='Click']"));
		click1.click();
		String text1 = click1.getText();
		System.out.println("box1"+" -"+text1);
		
		driver.switchTo().defaultContent();//it will come to mainclass
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement click2 = driver.findElement(By.xpath("//button[@id='Click1']"));
		click2.click();
		String text2 = click2.getText();
		System.out.println("box2"+""+text2);
		driver.switchTo().defaultContent();
		
		List<WebElement> framesize = driver.findElements(By.tagName("iframe"));//plural many tag names
		int size=framesize.size();
		System.out.println(size);
	}
	
}
