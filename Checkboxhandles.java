package seleniumtasksbyabhishek;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxhandles {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//1 select specific checkbox
		driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
		
		WebElement cb=driver.findElement(By.xpath("//input[@type ='checkbox']"));
		cb.click();
		System.out.println(cb.isSelected());// for check 
		
		WebElement cd=driver.findElement(By.xpath("//input[2]"));
		cd.click();
		System.out.println(cd.isSelected());// for uncheck 
		driver.quit();
		
		
		
		

	}

}
