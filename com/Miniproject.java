package webpackage.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Miniproject {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\CURRENT WORKSPACE\\Project One\\Driver\\chromedriver.exe");
		WebDriver d =new ChromeDriver();
		d.get("https://adactinhotelapp.com/");
	/*
		WebElement newregister = d.findElement(By.xpath("//a[@href='Register.php']"));
		newregister.click();
		
		WebElement usedid = d.findElement(By.xpath("//input[@name='username']"));
		usedid.sendKeys("jeyaviki1");
		
		WebElement password = d.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("1234567");
		WebElement repasword = d.findElement(By.xpath("//input[@name='re_password']"));
		repasword.sendKeys("1234567");
		
		WebElement name = d.findElement(By.xpath("//input[@name='full_name']"));
		name.sendKeys("JEYAVIGNESH");
		WebElement email = d.findElement(By.xpath("//input[@name='email_add']"));
		email.sendKeys("matescallmephilander@gmail.com");
		
		WebElement captcha = d.findElement(By.xpath("//input[@name='captcha']"));
		captcha.sendKeys("");
		WebElement agree = d.findElement(By.xpath("//input[@type='checkbox']"));
		agree.click();
		
		WebElement register = d.findElement(By.xpath("//input[@type='submit']"));
		register.click();
		**/
		
		WebElement usernam = d.findElement(By.xpath("//input[@type='text']"));
		usernam.sendKeys("jeyaviki1");
		WebElement pass = d.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("1234567");
		WebElement submit = d.findElement(By.xpath("//input[@type='Submit']"));
		submit.click();
		d.manage().window().maximize();
		
		WebElement location = d.findElement(By.xpath("//select[@name='location']"));
		Select s=new Select(location);
		s.selectByIndex(5);
		
		WebElement hotel = d.findElement(By.xpath("//select[@name='hotels']"));
		Select s1=new Select(hotel);
		s1.selectByIndex(3);
		
		WebElement roomtype = d.findElement(By.xpath("//select[@name='room_type']"));
		Select s2=new Select(roomtype);
		s2.selectByIndex(2);
		
		WebElement rooms = d.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3=new Select(rooms);
		s3.selectByValue("2");
		
		WebElement checkin = d.findElement(By.xpath("//input[@name='datepick_in']"));
		checkin.sendKeys("26/12/2021");
		WebElement checkout = d.findElement(By.xpath("//input[@name='datepick_out']"));
		checkout.sendKeys("30/12/2021");
		WebElement adult = d.findElement(By.xpath("//select[@name='adult_room']"));
		Select s4=new Select(adult);
		s4.selectByValue("3");
		WebElement child = d.findElement(By.xpath("//select[@name='child_room']"));
		Select s5=new Select(child);
		s5.selectByIndex(1);
		WebElement search = d.findElement(By.xpath("//input[@type='submit']"));
		search.click();
		WebElement radiobt = d.findElement(By.xpath("//input[@name='radiobutton_0']"));
		radiobt.click();
		WebElement continuebt = d.findElement(By.xpath("//input[@type='submit']"));
		continuebt.click();
		WebElement firstname = d.findElement(By.xpath("//input[@name='first_name']"));
		firstname.sendKeys("vignesh");
		WebElement lastname = d.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("jeya");
		WebElement address = d.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("dindigul");
		WebElement cardno = d.findElement(By.xpath("//input[@name='cc_num']"));
		cardno.sendKeys("1579578945681649");
		WebElement cardtype = d.findElement(By.id("cc_type"));		
		Select s6=new Select(cardtype);
		s6.selectByIndex(1);
		WebElement cdmonth = d.findElement(By.className("select_combobox2"));
		Select s7=new Select(cdmonth);
		s7.selectByVisibleText("September");
		WebElement year = d.findElement(By.id("cc_exp_year"));
		Select s8= new Select(year);
		s8.selectByVisibleText("2021");
		WebElement cvv  = d.findElement(By.name("cc_cvv"));
		cvv.sendKeys("987");
		WebElement booknow = d.findElement(By.name("book_now"));
		booknow.click();
		
		TakesScreenshot ts=(TakesScreenshot) d;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File desti=new File("E:\\CURRENT WORKSPACE\\Project One\\screenshot//hotel.png");
		FileUtils.copyFile(source, desti);
		}
	}
