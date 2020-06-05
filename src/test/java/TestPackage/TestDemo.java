package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDemo {
	
	
	@Test
	public static void setup(){
		
		System.out.println("hello india");
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Nov Preparation\\new23\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("http://www.facebook.com");
		 
		// Maximize browser
		 
		driver.manage().window().maximize();
		 
		}
		
	}


