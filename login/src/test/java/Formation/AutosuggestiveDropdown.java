package Formation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // URL in the browser

		driver.manage().window().maximize();

		/*driver.findElement(By.id("autosuggest")).sendKeys("ind");*/
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		
	
		
		

		Thread.sleep(3000);
		
		
		
		// la liste déroulante s'affiche aprés l'ecrirure de "ind"
		// *//tagName[attribute='value'] espace tagNameChild = css
		/*List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));*/
		
		List<WebElement> options1 = driver.findElements(By.cssSelector("ul[id='ui-id-1'] li"));

		for (WebElement option : options1)

		{

			if (option.getText().equalsIgnoreCase("India"))

			{

				option.click();

				break;// pour fermer le boucle automatiquement

			}

		}

	}

}