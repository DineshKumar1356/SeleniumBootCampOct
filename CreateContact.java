package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact  extends BaseClass {
	
	@Test(priority =1,invocationCount =2)

	public void  createContact()  throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(5000);
		// click on viewALL
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		// search contact 
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Contacts");
		
		//click on contacts
		driver.findElement(By.xpath("//mark[text()='Contacts']")).click();
		// click on new contacts
		driver.findElement(By.xpath("//div[@title='New']")).click();
		
		driver.findElement(By.xpath("//input[@id='input-664']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"input-664-1-664\"]/span[2]")).click();
		
		
	}

}
