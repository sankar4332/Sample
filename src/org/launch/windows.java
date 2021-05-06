package org.launch;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\launch\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String windowHandle = driver.getWindowHandle();
	WebElement btnsel= driver.findElement(By.id("heading304"));
	btnsel.click();
	WebElement tsk = driver.findElement(By.xpath("//a[text()= ' TESTNG']"));
	tsk.click();
	Set<String> Wh = driver.getWindowHandles();
	for (String s : Wh) {
		if (!(windowHandle.equals(s))) {
				driver.switchTo().window(s);
				
			}
			
		} 
		WebElement WHqns = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
		String text = WHqns.getText();
		System.out.println(text);
	}
}

			
			
			
			
		
		
	


