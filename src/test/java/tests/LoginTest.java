package tests;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class LoginTest {
	
	WebDriver drvier;
	
	@Test

	public void loginTest() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\OneDrive\\Documents\\Chetan\\Lahu_Automation_Notes\\Driver\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
	}
	
	
	
	

}
