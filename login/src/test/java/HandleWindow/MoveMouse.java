package HandleWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://amazon.com");

		driver.manage().window().maximize();
		// move to specific element
		Actions a = new Actions(driver);

		WebElement MoveToListe = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

		a.moveToElement(MoveToListe).contextClick().perform();

		// move to specific element

		WebElement MoveToTextBox = driver.findElement(By.id("twotabsearchtextbox"));

		// move to element/click/sendkeys capital lettre

		a.moveToElement(MoveToTextBox).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		a.moveToElement(MoveToTextBox).contextClick().build().perform();
		
		

	}

}
