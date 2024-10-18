package seleniumtasksbyabhishek;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		
			WebDriver driver =new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			//draganddrop.....
			
			driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
			Actions act=new Actions(driver);
			WebElement A=driver.findElement(By.xpath("//div[@id='column-a']"));
			WebElement B=driver.findElement(By.xpath("//div[@id='column-b']"));
			 for (int i = 0; i < 1; i++) { 
			act.dragAndDrop(B, A).perform();
			act.dragAndDrop(A, B).perform();
			 }
			System.out.print("drag and drop sucessful");
			
			driver.quit();
					

	}

}
