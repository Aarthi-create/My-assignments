package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		
ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
				
		driver.findElement(By.id("email")).sendKeys("xys");
		driver.findElement(By.id("pass")).sendKeys("abc");
		driver.findElement(By.name("login")).click();
     	driver.findElement(By.partialLinkText("Find your")).click();
	}

}
