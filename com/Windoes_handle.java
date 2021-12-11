package webpackage.com;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windoes_handle {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Actions ac=new Actions(driver);
		//	WebElement todaydeal =driver.findElement(By.xpath("//h2[text()='Today’s Deals']"));
		WebElement moblies =driver.findElement(By.xpath("//a[@class='nav-a  ']"));
		ac.contextClick(moblies).build().perform();

		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);  
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement bestseller = driver.findElement(By.xpath("(//a[@tabindex=0])[6]"));
		ac.contextClick(bestseller).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		//no of windows opened
		int size = driver.getWindowHandles().size();
		System.out.println("no fo windows: "+ size);
		//parent id
		String parent = driver.getWindowHandle();
		System.out.println("parent id:"+parent);
		//get all window title
		Set<String> alltitle = driver.getWindowHandles();
		for (String s : alltitle) {
			String title = driver.switchTo().window(s).getTitle();
			System.out.println("title:"+title);
		}
		//redirect to specific child
		//child title
		//for each with allwindow
		//if condition

		String child="Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		for (String each : alltitle) {
			if (driver.switchTo().window(each).getTitle().equalsIgnoreCase(child)) {
				break;
			}
		}
		/*//close only parent window
		for (String st : alltitle) {
		//today_deal !=parentid?--->yes->close()
		//parent window !=parentid?-->no--->it will not close
			if (!st.equals(parent)) {
				driver.switchTo().window(st);
				driver.close();
		 */


	}





}

