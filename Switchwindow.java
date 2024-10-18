package seleniumtasksbyabhishek;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Switchwindow {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		
		WebElement nw=driver.findElement(By.xpath("//a[text()='Click Here']"));
		nw.click();
		System.out.print("new window opened");
		
		
		

	}

}
