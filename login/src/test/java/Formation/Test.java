package Formation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		String url = "https://rahulshettyacademy.com/dropdownsPractise/";

		driver.get(url);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();

		Thread.sleep(3000);
		// 1 ere methode

		int i = 1;
		int i2 = 0;
		int i3 = 0;
		/*
		 * for(i=1 ; i<5; i++) {
		 * driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();
		 * 
		 * }
		 * 
		 * for(i2=0;i2<3;i2++) {
		 * driver.findElement(By.xpath("//*[@id='hrefIncChd']")).click(); }
		 * 
		 * for(i3=0;i3<4;i3++) {
		 * driver.findElement(By.xpath("//*[@id='hrefIncInf']")).click();
		 * 
		 * }
		 * driver.findElement(By.cssSelector("input[id='btnclosepaxoption']")).click();
		 */
		// 2 eme methode

		while (i < 5)

		{
			driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();
			i++;

		}

		while (i2 < 3)

		{
			driver.findElement(By.xpath("//*[@id='hrefIncChd']")).click();
			i2++;

		}
		driver.findElement(By.xpath("//*[@id='hrefIncInf']")).click();

		while (i3 < 4)

		{
			driver.findElement(By.xpath("//*[@id='hrefIncInf']")).click();
			i3++;

		}
		
		
		driver.findElement(By.cssSelector("input[id='btnclosepaxoption']")).click();
	}

}
