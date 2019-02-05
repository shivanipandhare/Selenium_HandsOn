import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://phptravels.org/clientarea.php");

		// Code for LOGIN

		driver.findElement(By.id("inputEmail")).sendKeys("abc@email.com");
		driver.findElement(By.id("inputPassword")).sendKeys("password");

		driver.findElement(By.xpath("//*[@id=\'login\']")).click();

		String error = driver.findElement(By.cssSelector(
				"#main-body > div > div > div.col-xs-12.main-content > div > div.alert.alert-danger.text-center"))
				.getText();

		if (error != null) {

			// Code to REGISTER

			driver.findElement(By.linkText("Register")).click();

			driver.findElement(By.id("inputFirstName")).sendKeys("Shivani");
			driver.findElement(By.id("inputLastName")).sendKeys("Pandhare");
			driver.findElement(By.id("inputEmail")).sendKeys("shivani@email.com");
			// driver.findElement(By.xpath("//div[@class='selected-dial-code']")).sendKeys("+91");

			// to enter the phone number
			driver.findElement(By.xpath("//div[@class='iti-arrow']")).click();
			driver.findElement(By.xpath("//li[@data-dial-code='91']")).click();

			driver.findElement(By.xpath("//input[@id='inputPhone']")).sendKeys("8329873347");

		}

		// driver.close();

	}

}
