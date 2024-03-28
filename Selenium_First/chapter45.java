package TestNGFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chapter45 {

	public static void main(String[] args) throws Exception {

		/*System.setProperty("webdriver.gecko.driver",
				"E:\\Study\\TestingStudy\\Testing\\selenium\\Selenium_jars\\geckodriver-v0.32.2-win64\\geckodriver.exe");*/

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep((2000));

		driver.findElement(By.partialLinkText("Forgotten")).click();

		System.out.println(driver.getTitle());

		driver.quit();

	}

}
