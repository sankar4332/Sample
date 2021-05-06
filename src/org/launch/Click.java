package org.launch;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {
	public static void main(String[] args) throws AWTException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\launch\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement click = driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])[2]"));
	    Actions ac=new Actions(driver);
	    ac.moveToElement(click).perform();
		WebElement sign = driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
		sign.click();
		WebElement email = driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']"));
		email.sendKeys("nainar083@gmail.com");
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_A);
		Actions ac1=new Actions(driver);
		ac1.contextClick(email).perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
        rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	}
}

        
		
	
		
	

		
		
		
		
			
		
		
		
		
		
		
		



	
