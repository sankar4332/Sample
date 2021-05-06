package org.launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropandDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\launch\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement btncreate = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btncreate.click();
		Thread.sleep(5000);
		WebElement ddwnday = driver.findElement(By.id("day"));
		Select s=new Select(ddwnday);
		s.selectByVisibleText("15");
		List<WebElement> op = s.getOptions();
		for (int i = 0; i < op.size(); i++) {
			if (i%2==0) {
			
			WebElement Element = op.get(i);
			System.out.println(Element.getText());
			}
		}
		
		}
	}


	
	


