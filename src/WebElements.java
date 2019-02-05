import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
			
		//STATIC DROPDOWNS
		/* {
		
		driver.get("https://www.spicejet.com/");  //URL
		
		Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByValue("USD");
		
		driver.findElement(By.id("divpaxinfo")).click(); //clicks to open the dropdown
		driver.findElement(By.id("hrefIncAdt")).click(); //increase adult by 1
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		} */
		
		
		
		
		//DYNAMIC dropdowns
		/* {
		//  chennai - //a[@value='MAA'] 
		//  bangalore - //a[@value='BLR']
		
		driver.get("https://www.spicejet.com/");  //URL
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@value='MAA']")).click();
		// the above line is not correct.. error - element not interactable 
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
			
		} */
		
		
		//AUTO-SUGGESTIVE dropdowns 
		/* { 
		driver.get("https://www.makemytrip.com/");  //URL
		
		WebElement source = driver.findElement(By.id("hp-widget__sfrom"));
		source.clear();
		source.sendKeys("MUM");
		Thread.sleep(1000);
		source.sendKeys(Keys.ENTER);
		
		WebElement destination = driver.findElement(By.id("hp-widget__sTo"));
		destination.clear();
		destination.sendKeys("DEL");
		Thread.sleep(1000);
		destination.sendKeys(Keys.ARROW_DOWN); //we want to select the 2nd option
		destination.sendKeys(Keys.ENTER);
		
		} */
		
		
		
		
		//RADIO BUTTONS
		/*  {
		 
		driver.get("http://www.echoecho.com/htmlforms10.htm"); //URL
		
		//clicking button for Cheese using value attr
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size(); //plural 
		
		//clicking all the buttons one by one
		for(int i=0; i<count; i++) {
		driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}
		
		// select 'Cheese'. Also, assume that we dont have the 'value' attribute
		for(int i=0; i<count; i++) {
			
		String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
		if (text == "Cheese") {
		driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
		
		}
		 */
		
		
		//ALERTS - Type : Java 
		
		/* {
		 	
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php"); //URL 
		
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		 
		 }  */
		
		
		//CHECKBOXES
		/* { 
		 driver.get("https://www.spicejet.com/"); //URL 
		
		//select the checkbox
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click(); //REGEX used 
		
		//check if it is selected
		boolean val =driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected();
		System.out.println(val);
		
		//print number of checkboxes 
		int num = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(num);
		
		} */
		
		
		//CALENDAR
		
		/* {
		
		driver.get("https://www.spicejet.com/"); //URL 
		
		driver.findElement(By.cssSelector(".ui-datepicker-trigger")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
			
		//it is selecting only the current date (which is highlighted in the calendar)
		 
		}*/
		
		
		//Validation of UI elements to be ENABLED or DISABLED
		/*   
		{
		driver.get("https://www.spicejet.com/"); //URL 
		
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Disabled");
		}
		
		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		
		//System.out.println("Disabled");
		Assert.assertTrue(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));
			  
		  
		 }
		  */
		
		
	}

}
