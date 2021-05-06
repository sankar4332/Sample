package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\launch\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// confirmation alert
		driver.get(" http://demo.automationtesting.in/Alerts.html");
		WebElement txtclick = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		txtclick.click();
		WebElement txtc2 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		txtc2.click();
		
	    org.openqa.selenium.Alert alert = driver.switchTo().alert();
	    alert.sendKeys("selenium");
	    alert.dismiss();
	}

}
