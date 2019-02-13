package pkg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		System.out.println(driver.getTitle());
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		
		String parent = it.next();
		String child1 = it.next(); 
		
		driver.switchTo().window(child1);
		System.out.println(driver.getTitle());
		
		
		
		
	}


}
