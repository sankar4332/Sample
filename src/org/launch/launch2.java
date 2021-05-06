package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\launch\\driver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("http://greenstech.in/selenium-course-content.html");
	 String currentUrl = driver.getCurrentUrl();
	 System.out.println(currentUrl);
	 String title = driver.getTitle();
    System.out.println(title);
   
    WebElement btn1= driver.findElement(By.xpath("//div[@id='heading20']"));
    btn1.click();
    
   // WebElement txtph = driver.findElement(By.name("mobile"));
    //txtph.sendKeys("8248053419");
   // WebElement txtname = driver.findElement(By.name("name"));
    //txtname.sendKeys("nainar");
   // WebElement txtusr = driver.findElement(By.name("email"));
    //txtusr.sendKeys("nainar0832gmail.com");
    //WebElement txtpss = driver.findElement(By.name("password"));
    //txtpss.sendKeys("muthusankar");
    WebElement btn2 = driver.findElement(By.xpath("//a[@href='http://greenstech.in/interview-questions/cts.pdf#toolbar=0']"));
    btn2.click();
}
}



  
    
    
    
	

