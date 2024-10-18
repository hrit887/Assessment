package seleniumtasksbyabhishek;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shifitingcontentss {

	public static void main(String[] args) {
		
			WebDriver driver =new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//a[text()='Shifting Content']")).click();
			
			driver.findElement(By.xpath("//a[text()='Example 1: Menu Element']")).click();			
			WebElement cdd =driver.findElement(By.xpath("//a[@href='/shifting_content/menu?mode=random']"));
			  if (cdd.isDisplayed()) {
		            System.out.println("Shifting is completed.");
		        } else {
		            System.out.println("Shifting is not completed.");
		        }
			  driver.navigate().back();
			 driver.findElement(By.xpath("//a[text()='Example 2: An image']")).click();
			 WebElement drr=driver.findElement(By.xpath("//p[4]//a[1]"));
			 if(drr.isDisplayed()) {
				 System.out.println("drr shifting is completed");
			 
			    }else {
			    	System.out.println("drr is no shifted");
			    }

			  
			  
			  

	}

}
