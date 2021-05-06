package org.launch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\launch\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame("Revamp_Banner_ID");
		WebElement txtusr = driver.findElement(By.id("DUMMY1"));
		txtusr.sendKeys("nainar");
		WebElement txtpss = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		txtpss.sendKeys("123");
		WebElement login = driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
		login.click();
		
		
		
	}

}
