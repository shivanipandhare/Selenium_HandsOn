package pkg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@id='mceu_15']")).click();
		driver.findElement(By.xpath("//div[@id='mceu_32']")).click();
		
		WebElement fele = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(fele);
		
		driver.findElement(By.cssSelector("body.mce-content-body")).sendKeys("Hi! I am in a frame right now :)");
		
		
		
		
		
		
		
	}


}
