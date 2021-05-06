package org.launch;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Launch1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\launch\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		WebElement btnprime = driver.findElement(By.xpath("//span[text()='Prime']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(btnprime).perform();
		Thread.sleep(3000);
		WebElement btnimg= driver.findElement(By.xpath("//div[@class='student-nav-content-img']"));
		btnimg.click();
		
		
	}
}
		

		
		

		
	

		
		
		
	


		
		
		
		
	

	
		
		
		
		
		
	
	

