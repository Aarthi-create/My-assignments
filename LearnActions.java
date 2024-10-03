package week4.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) throws IOException {
		  ChromeDriver driver=new ChromeDriver();
	      driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  
	 Actions action = new Actions(driver);
		  WebElement ele = driver.findElement(By.xpath("//a[text()=\"Conditions of Use & Sale\"]"));
		  
		  action.moveToElement(ele).perform();
		  String text = ele.getText();
		  System.out.println(text);
		  
		  File source = driver.getScreenshotAs(OutputType.FILE);
		  File des = new File("./screenshots/currentPage.png");
		  FileUtils.copyFile(source, des);
	}

}
