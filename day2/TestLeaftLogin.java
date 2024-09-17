package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeaftLogin {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");//attr based xpath
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("crmsfa");//attr partial xpath
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click(); 
		driver.findElement(By.xpath("//a[contains(text(),'CRM/')]")).click(); // text partial
		
	}

}
