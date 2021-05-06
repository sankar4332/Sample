package org.launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ddwm {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\launch\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		int count=0,
				a=0;
		WebElement dropfruits= driver.findElement(By.id("fruits"));
		Select s=new Select(dropfruits);
	
		
//		boolean b = s.isMultiple();
//		System.out.println(b);
	    List<WebElement> options = s.getOptions();
	    for (int i = 0; i <options.size(); i++) {
	    	WebElement WE = options.get(i);
			String text = WE.getText();
			if (text.contains("Apple")||text.contains("Grape")) {
				s.selectByVisibleText(text);	
				}

	    }
//		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
//		for (int i = 0; i < allSelectedOptions.size(); i++) {
//			WebElement webElement = allSelectedOptions.get(i);
//			String text = webElement.getText();
//			System.out.println(text);	
//		}
	    
	    for (int i = 0; i <options.size(); i++) {	
	    	
			if (i%2!=0) {
				count++;
				WebElement WE = options.get(i);
				String text = WE.getText();
				s.selectByIndex(i);
			}
			
				}
	    a=options.size()-count;
	    System.out.println(a);

	    }
			
		}

	    
			
		
		
		
	


