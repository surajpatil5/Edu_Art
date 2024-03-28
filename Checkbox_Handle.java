package TestNGFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox_Handle {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();  //upcasting runtime polymorphism
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Log in")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@id='RememberMe']")).isDisplayed());
		
		System.out.println(driver.findElement(By.xpath("//input[@id='RememberMe']")).isSelected());
		
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@id='RememberMe']")).isSelected());
		
		driver.quit();
		
	}

}
