package seleniumtasksbyabhishek;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filedownloaddd {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//for downloading
//		driver.findElement(By.xpath("//a[text()='File Download']")).click();
//		driver.findElement(By.xpath("//a[text()='LambdaTest.txt']")).click();
		// for uploading------
		driver.findElement(By.xpath("//a[text()='File Upload']")).click();
		WebElement dr = driver.findElement(By.xpath("//input[@id='file-upload']"));
		dr.sendKeys("C:\\Users\\Hrithik.koul\\Downloads\\test.txt");
		driver.findElement(By.xpath("//input[@id='file-submit']")).click();
		driver.quit();

	}

}
