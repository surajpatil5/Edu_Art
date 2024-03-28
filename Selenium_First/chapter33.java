
package TestNGFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chapter33 {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "E:\\SeleniumTraining\\Tools\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); // Java Upcasting or Runtime polymorphism 
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
	}

}
