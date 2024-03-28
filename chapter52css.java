package TestNGFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chapter52css {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[id='email']")).clear();

		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("prafullbarve26@gmail.com");

		driver.findElement(By.cssSelector("input[id='pass']")).clear();
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("");

		driver.findElement(By.cssSelector("button[id='loginbutton']")).click();

		driver.quit();
	}

}
