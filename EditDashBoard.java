package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditDashBoard extends BaseClass {

	@Test(priority=3)
		// TODO Auto-generated method stub
		public  void editDashBoardmain() throws InterruptedException {
			
			driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[text()='View All']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Dashboard");
			driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
			driver.findElement(By.xpath("//input[contains(@class,'search-text-field slds-input')]")).sendKeys("Salesforce Automation by Dinesh");

			WebElement edipdash =driver.findElement(By.xpath("//span[text()=' Dinesh']"));
			JavascriptExecutor executor =(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",edipdash);
		    Thread.sleep(10000);
			WebElement frameElement = driver.findElement(By.xpath("//*[@id=\"brandBand_2\"]/div/div/div[2]/div/div[2]/iframe"));
			driver.switchTo().frame(frameElement);
			System.out.println("success");
			driver.findElement(By.xpath("//button[text()='Edit']")).click();
			driver.findElement(By.xpath("//button[@title='Edit Dashboard Properties']")).click();
			driver.findElement(By.id("dashboardNameInput")).sendKeys("Salesforce Automation by Dineshedit");
			driver.findElement(By.id("submitBtn")).click();
			
		
	}

}
