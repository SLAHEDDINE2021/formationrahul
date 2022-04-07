package HandleWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		// compter le nombre de frame dans la page

		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);//localisation frame by index

	//	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));// localisation frame by string
		
		
		// driver.findElement(By.id("draggable")).click() ;
		Actions a = new Actions(driver);

		WebElement source = driver.findElement(By.id("draggable"));

		WebElement destination = driver.findElement(By.id("droppable"));

		a.dragAndDrop(source, destination).build().perform();

		driver.switchTo().defaultContent();//sortir de frame pour manipuler un autre element
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/ul/li[2]/a")).click()	;
	}
	

}
