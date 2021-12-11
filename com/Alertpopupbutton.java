package webpackage.com;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alertpopupbutton {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\CURRENT WORKSPACE\\Project One\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement ok = d.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		ok.click();
		WebElement okok = d.findElement(By.xpath("(//button[@class='btn btn-danger'])[1]"));
		okok.click();
		Thread.sleep(2000);
		Alert alert = d.switchTo().alert();
		
		alert.accept();
		
		WebElement okcancel = d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		okcancel.click();
		WebElement pop = d.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		pop.click();
		Alert alert2 = d.switchTo().alert();
		alert2.accept();
		
		WebElement textbox = d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		textbox.click();
		WebElement poptext = d.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		poptext.click();
		Alert alert3 = d.switchTo().alert();
		alert3.sendKeys("hi vignesh");
		alert3.accept();
	
		TakesScreenshot ts=(TakesScreenshot) d;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File desti=new File("E:\\CURRENT WORKSPACE\\Project One\\screenshot//alert.png");
		FileUtils.copyFile(source,desti);
	}
	
}
