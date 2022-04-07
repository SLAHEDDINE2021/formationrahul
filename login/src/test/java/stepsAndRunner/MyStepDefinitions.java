package stepsAndRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepDefinitions {

	WebDriver driver= new ChromeDriver() ;
	


	public void init() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		
        String url ="www.login.salesforce.com";
		
		driver.get(url);
		
		
				

	}

}