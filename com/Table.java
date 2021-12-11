package webpackage.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\CURRENT WORKSPACE\\Project One\\Driver\\chromedriver.exe");
	WebDriver wd =new ChromeDriver();
	wd.get("http://www.leafground.com/pages/table.html");
	
	//all data
	List<WebElement> fulldata = wd.findElements(By.xpath("//table/tbody/tr/td"));
	for (WebElement s1 : fulldata) {
		System.out.println(s1.getText());
		}
	//header
	System.out.println("===========header==================");
	List<WebElement> header = wd.findElements(By.xpath("//table/tbody/tr/th"));
	for (WebElement s2 : header) {
		System.out.println(s2.getText());
	}
	System.out.println("========row data===============");
	List<WebElement> rowdata = wd.findElements(By.xpath("//table/tbody/tr[3]/td"));
	for (WebElement s3 : rowdata) {
		System.out.println(s3.getText());
	}
	System.out.println("========column data============");
	List<WebElement> columndata = wd.findElements(By.xpath("//table/tbody/tr/td[5]"));
	for (WebElement s4 : columndata) {
		System.out.println(s4.getText());
	}
	System.out.println("==========particular data===========");
	List<WebElement> particulardata = wd.findElements(By.xpath("//table/tbody/tr[5]/td[6]"));
	for (WebElement s5 : particulardata) {
		System.out.println(s5.getText());
		System.out.println("=====row size======");
		List<WebElement> rowsize = wd.findElements(By.tagName("tr"));
		int size1 = rowsize.size();
		System.out.println("rowsize"+size1);
		System.out.println("=======column size=======");
		List<WebElement> columnsize = wd.findElements(By.tagName("td"));
		int size2 = columnsize.size();
		System.out.println("columnsize"+size2);
		WebElement follow = wd.findElement(By.xpath("//td[normalize-space()='Learn Locators']//following::td[5 ]"));
		System.out.println(follow.getText());
	
	}
	
	
	
	
	
	
	
	
	
}
	
	
}
