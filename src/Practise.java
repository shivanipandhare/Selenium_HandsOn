import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php"); //URL 
		
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}

}
