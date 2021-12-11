package webpackage.com;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownsingle {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver\\chromedriver.exe");
		WebDriver w1=new ChromeDriver();
		w1.get("http://www.leafground.com/");
		
		WebElement dropdown = w1.findElement(By.xpath("//img[@alt='ListBox']"));
		dropdown.click();
		WebElement singledrop = w1.findElement(By.xpath("(//select[@id='dropdown1'])[1]"));
		Select s=new Select(singledrop);
		Thread.sleep(2000);
		s.selectByIndex(3);
		
		Thread.sleep(2000);
		WebElement drop2 = w1.findElement(By.xpath("//select[@name='dropdown2']"));
		Select s1=new Select(drop2); 
		s1.selectByVisibleText("Selenium");
		Thread.sleep(2000);
		
		WebElement drop3 = w1.findElement(By.xpath("//select[@id='dropdown3']"));
		Select s2=new Select(drop3);
		s2.selectByValue("2");
		Thread.sleep(2000);
		s2.selectByIndex(4);
		
		WebElement drop4 = w1.findElement(By.xpath("//select[@class='dropdown']"));
		Select s3=new Select(drop4);
		List<WebElement> count = s3.getOptions();
		int size=count.size();
		System.out.println("count"+size);

		//WebElement firstSelectedOption = s2.getFirstSelectedOption();
		//System.out.println(firstSelectedOption.getText());
		
		TakesScreenshot ts=(TakesScreenshot) w1;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\CURRENT WORKSPACE\\Project One\\screenshot//dp.png");
		FileUtils.copyFile(source,destination);
		
		WebElement multidrop = w1.findElement(By.xpath("(//select)[6]"));
		Select s4=new Select(multidrop);
		boolean multiple = s4.isMultiple();
		System.out.println("----IS MULTIPLE OR NOT------");
		System.out.println(multiple);
		
		List<WebElement> num = s4.getOptions();
		System.out.println("----list items------"); //FOR(DATA TYPE i:ARRRAY)
		for (WebElement i : num) {
			System.out.println(i.getText());
			}
		
		int size1=num.size();
		System.out.println("==MULTI DROP SIZE===:"+size1);// for iteration purpose
		for (int i=0;i<size1;i++) {
			if (i==4 | i==2) 
			{
				s4.selectByIndex(i);	
				}}
			
			System.out.println("----GET ALL SELECTED------");
			List<WebElement> all = s4.getAllSelectedOptions();
			for (WebElement i1 : all) {
				System.out.println(i1.getText());
			}
			System.out.println("---first selected option---");
			WebElement firstSelectedOption = s4.getFirstSelectedOption();
			System.out.println("--first option is--"+firstSelectedOption.getText());
			
			s4.deselectAll();
			System.out.println("---options are deseelected--");
			
		}}


	


