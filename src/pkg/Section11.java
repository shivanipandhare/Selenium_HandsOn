package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section11 {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://qaclickacademy.com/practice.php");
	
	int s = driver.findElements(By.tagName("a")).size();
	
	System.out.println("No. of links = "+s);

} 
	
}
