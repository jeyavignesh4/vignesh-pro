package webpackage.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	
	WebElement Dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
	Dresses.click();
	
	WebElement summer = driver.findElement(By.xpath("(//a[@title='Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.'])[1]"));
	summer.click();
	
	WebElement quick1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
	quick1.click();
	
	driver.switchTo().frame(0);
	WebElement quantity = driver.findElement(By.xpath("//*[@id='quantity_wanted']"));
	quantity.clear();
	quantity.sendKeys("5");

	WebElement size = driver.findElement(By.xpath("//select[@class='form-control attribute_select no-print']"));
	Select s=new Select(size);
	s.selectByIndex(2);
	
	WebElement addcart = driver.findElement(By.xpath("(//button)[5]"));
	addcart.click();
	
	WebElement proceed = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
	proceed.click();

	
	

}}