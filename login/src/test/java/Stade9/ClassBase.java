package Stade9;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassBase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// declarer les produits à acheter listes des produits

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
		

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		driver.manage().window().maximize();

		// attendre le telechargement de tous les produits

		Thread.sleep(3000);

		addItems(driver, itemsNeeded);
		
		

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded)

	{

		int j = 0;

		// get all the products

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{

			// Brocolli - 1 Kg

			// Brocolli, 1 kg

			// format it to get actual vegetable name//formatez-le pour obtenir le nom réel
			// du légume

			String[] name = products.get(i).getText().split("-");

			// choisir le 1er nom obtenue et eliminer l'espece

			String formattedName = name[0].trim();

// convert array into array list for easy search// convertir le tableau en liste de tableaux pour une recherche facile

			List itemsNeededList = Arrays.asList(itemsNeeded);

// check whether name you extracted is present in arrayList or not-// vérifie si le nom que vous avez extrait est présent dans arrayList ou non-

			if (itemsNeededList.contains(formattedName))

			{

				j++;

				// click on Add to cart use this xpath //div[@class='product-action']/button" le
				// button change lorsqu'on
				// click donc il va prendre le faux produit use parent to child ajouter/tagname
				// of child

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// use size to get size de array list and lenght to get size of array
				// utilisez size pour obtenir la taille de la liste du tableau
				// et la longueur pour obtenir la taille du tableau

				if (j == itemsNeeded.length)

				{

					break;

				}

			}

		}

	}

}
