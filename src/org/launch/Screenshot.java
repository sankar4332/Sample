package org.launch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screenshot {
	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\launch\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	
		WebElement txtsearch = driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]"));
		txtsearch.sendKeys("motorola");
	
		TakesScreenshot tk=(TakesScreenshot)driver; //downcasting
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File f=new File("D:\\sub\\ss\\moto.jpg");
		FileUtils.copyFile(src, f);
	}
}

		
		
		
	
	
		
	

