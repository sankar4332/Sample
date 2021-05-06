package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\launch\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement txtusr = driver.findElement(By.name("username"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','nainar')",txtusr);
		WebElement txtpss = driver.findElement(By.name("password"));
		js.executeScript("arguments[0].setAttribute('value','muthappa')", txtpss);
		WebElement btnlogin = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", btnlogin);
	}
	
		
	}


