package pkg;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Methods {

	@Test
	public static void login() {

		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://phptravels.org/clientarea.php");

		driver.findElement(By.id("inputEmail")).sendKeys("abc@email.com");

		driver.findElement(By.id("inputPassword")).sendKeys("password");

		driver.findElement(By.xpath("//*[@id=\'login\']")).click();
		

		String error = driver.findElement(By.cssSelector(
				"#main-body > div > div > div.col-xs-12.main-content > div > div.alert.alert-danger.text-center"))
				.getText();
		// System.out.println("Error : " + error);

		assertNotEquals(error, "Login Details Incorrect. Please try again.", "Login failed!!");

	}

}
