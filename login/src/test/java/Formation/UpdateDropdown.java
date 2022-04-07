package Formation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		String url = "https://rahulshettyacademy.com/dropdownsPractise/";

		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000L);

		// 1 ere methode pour cliquer pour ajouter le nombre des adultes a 5
		int i = 1;
		int i2 = 0;

		while (i < 5)

		{

			driver.findElement(By.id("hrefIncAdt")).click();// 4 times

			i++;

			while (i2 < 2)

			{

				driver.findElement(By.id("hrefIncChd")).click();// 2 times

				i2++;
			}

			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

// 2 eme  methode cliquer pour choisir 5 adultes et 2 child et 3 infant

			/*
			 * for(int i=1;i<5;i++)
			 * 
			 * {
			 * 
			 * driver.findElement(By.id("hrefIncAdt")).click();
			 * 
			 * } for(int i2=0;i2<2;i2++)
			 * 
			 * {
			 * 
			 * driver.findElement(By.id("hrefIncChd")).click(); } for(int i3=0;i3<3;i3++)
			 * 
			 * {
			 * 
			 * driver.findElement(By.id("hrefIncInf")).click();
			 * 
			 * 
			 * } driver.findElement(By.id("btnclosepaxoption")).click();
			 * 
			 * Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),
			 * "5 Adult, 2 Child, 3 Infant");
			 * 
			 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			 */

		}

	}
}
