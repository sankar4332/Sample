package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textxpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\launch\\driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://greenstech.in/selenium-course-content.html");
		 WebElement txt = driver.findElement(By.xpath("//span[contains(text(),'11')]"));
		 WebElement txt1 = driver.findElement(By.xpath("//span[contains(text(),'First')]"));
		 WebElement txt2 = driver.findElement(By.xpath("//span[contains(text(),'padmanabha')]"));
		 WebElement txt3 = driver.findElement(By.xpath("(//span[contains(text(),'Adyar')])[1]"));
		 WebElement txt4 = driver.findElement(By.xpath("(//span[contains(text(),'Chennai')])[1]"));
		 String text = txt.getText();
		 System.out.println(text);
		 String text2 = txt1.getText();
		 System.out.println(text2);
		 String text3 = txt2.getText();
		 System.out.println(text3);
		 String text4 = txt3.getText();
		 System.out.println(text4);
		 String text5 = txt4.getText();
		 System.out.println(text5);
	}
}

	       
	    
	     
	
