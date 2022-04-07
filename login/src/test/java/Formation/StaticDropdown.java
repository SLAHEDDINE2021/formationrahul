package Formation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		String url = "https://rahulshettyacademy.com/dropdownsPractise/";

		driver.get(url);
		driver.manage().window().maximize();

		// Dropdown with select tag- dans le dopdown static on trouve toujour en html le mot select

		WebElement StaticDopdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select Dropdown = new Select(StaticDopdown);
        //1 ere methode
		Dropdown.selectByIndex(3);
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		
        //2 eme methhode
		Dropdown.selectByVisibleText("AED");
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		
		//3 eme methode
		
	    Dropdown.selectByValue("INR");
	    System.out.println(Dropdown.getFirstSelectedOption().getText());
	}

}
