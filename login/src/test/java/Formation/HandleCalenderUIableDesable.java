package Formation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandleCalenderUIableDesable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		driver.get("http://spicejet.com"); // URL in the browser

		
		driver.manage().window().maximize();
		// //a[@value='MAA'] - Xpath for chennai

				// //a[@value='BLR']   -Xpath for BLR

				driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

				driver.findElement(By.xpath("//a[@value='BLR']")).click();

				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();
		// choisir date actuelle
				
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		// s'assurer que ui est enable/desable -----return true
		
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		{

		System.out.println("its enabled");

		Assert.assertTrue(true);

		}

		else

		{

		Assert.assertTrue(false);

		}
	}

}
