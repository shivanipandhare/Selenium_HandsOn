import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Section8_Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		//check that the checkbox is selected 
		driver.findElement(By.id("checkBoxOption1")).click(); 							//select
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());	//check
		
		//check that the checkbox is deselected 
		driver.findElement(By.id("checkBoxOption1")).click(); 							//deselect
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());	//check
		
		//get the number of checkboxes 
		int num = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(num); 
		
		
}
	
}
