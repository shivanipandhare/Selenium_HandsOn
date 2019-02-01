import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		//driver.get("https://www.ultimateqa.com/simple-html-elements-for-automation/");
		
		//STATIC DROPDOWNS
		
		Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByValue("USD");
		
		driver.findElement(By.id("divpaxinfo")).click(); //clicks to open the dropdown
		driver.findElement(By.id("hrefIncAdt")).click(); //increase adult by 1
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		
		
		
	}

}
