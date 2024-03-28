package TestNGFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chapter43 {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "E:\\Study\\TestingStudy\\Testing\\selenium\\Selenium_jars\\geckodriver-v0.31.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.id("email")).sendKeys("prafull");
		
		driver.findElement(By.id("pass")).clear();
		
		driver.findElement(By.id("pass")).sendKeys("jhvhvk");
		
		driver.findElement(By.name("login")).click();
		 
		driver.quit();
	}

}
