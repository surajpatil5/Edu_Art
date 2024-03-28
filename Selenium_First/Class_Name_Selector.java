
package TestNGFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_Name_Selector {

	public static void main(String[] args) {

		/*System.setProperty("webdriver.gecko.driver",
				"E:\\Study\\TestingStudy\\Testing\\selenium\\Selenium_jars\\geckodriver-v0.31.0-win64\\geckodriver.exe");*/
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.className("inputtext _55r1 _6luy")).clear();
		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("prafullbarve26@gmail.com");
		driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).clear();
		driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("xxxxxxx");
		driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
		driver.quit();
	}

}
