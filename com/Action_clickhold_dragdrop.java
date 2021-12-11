package webpackage.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_clickhold_dragdrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver\\chromedriver.exe");
		WebDriver dddriver=new ChromeDriver();
		dddriver.get("http://www.leafground.com/pages/drop.html");
		
		Actions a=new Actions(dddriver);
		WebElement from = dddriver.findElement(By.xpath("//*[@id=\'draggable\']"));
		
		WebElement to = dddriver.findElement(By.xpath("//*[@id=\'droppable\']"));
		
		Thread.sleep(2000);
	//	a.clickAndHold(from).moveToElement(to).build().perform();
		a.dragAndDrop(from, to).build().perform();
		
		
	}

}
