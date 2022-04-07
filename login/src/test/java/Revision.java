import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Revision {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");

		driver.manage().window().maximize();

		driver.findElement(By.id("travel_date")).click();
		
		////div[@class='datepicker-days'] //th[@class='datepicker-switch']
		
		 List<WebElement> days = driver.findElements(By.className("day"));
		 
		 int i=0;
		 int NombreJours= driver.findElements(By.className("day")).size();
		 String text= driver.findElements(By.className("day")).get(i).getText();
		
		while(!driver.findElement(By.xpath("[class='datepicker-days'] th[class='next']")).getText().contains("May"))
		{
			
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		for(int i=0 ;i<NombreJours;i++) {
			
			
		}
	}
}