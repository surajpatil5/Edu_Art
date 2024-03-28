package TestNGFiles;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_Button_Facebook {

	// https://book.goindigo.in/

	// http://demowebshop.tricentis.com/register

	public static void main(String[] args)   {

			/*System.setProperty("webdriver.gecko.driver",
					"E:\\Study\\TestingStudy\\Testing\\selenium\\Selenium_jars\\geckodriver-v0.32.2-win64\\geckodriver.exe");*/

				try {
					WebDriver driver = new FirefoxDriver();

					driver.get("https://www.facebook.com/");

					driver.manage().window().maximize();

					driver.findElement(By.linkText("Create new account")).click();
					
					Thread.sleep(2000);
					
					List<WebElement> radiobuttons = driver.findElements(By.xpath("//input[@type='radio']"));
					
					System.out.println(radiobuttons.size());
					
					radiobuttons.get(0).click(); // for female as per index

					// radiobuttons.get(1).click(); // for male as per index

					Thread.sleep(2000);

					driver.quit();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
		
	}

}
