package demo;

import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class CreateTask extends BaseClass {
		
		@Test

		public void createTask() throws InterruptedException {
			// TODO Auto-generated method stub
			driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[text()='View All']")).click();
			driver.findElement(By.xpath("//p[text()='Sales']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[4]/one-app-nav-bar-item-dropdown/div")).click();
			System.out.println("success");
			WebElement newopp = driver.findElement(By.xpath("//span[text()='New Task']"));
			JavascriptExecutor executor =(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",newopp);
		
			WebElement status = driver.findElement(By.xpath("//a[@class='select']"));
			JavascriptExecutor executor1 =(JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();",status);
			driver.findElement(By.xpath("//a[@title='Waiting on someone else']")).click();
			driver.findElement(By.xpath("//label[text()='Subject']/following::input")).sendKeys("Bootcamp by dinesh");
			driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		}

	

}


