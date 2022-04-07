package Formation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		driver.get("http://spicejet.com"); // URL in the browser
		driver.manage().window().maximize();

		// css selector input[id*='SeniorCitizenDiscount'] on ajoute * apres attribute
		// pour defenir
		// que id contient les mots utilisées
		// on utilise isselected pour verifier que le checkbox est selectionnée ou nn

		// s'assurer que le box n'est pas coché

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
          
		// cocher checkbox

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		// verifier qu'il est coche 
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//SIZE UTILISER pour savoir le nombre de cheeckbook
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); 
		
		 
		  
		 
	}

}
