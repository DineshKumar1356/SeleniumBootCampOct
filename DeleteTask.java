package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteTask extends BaseClass {

	@Test
	public  void deleteTask() throws InterruptedException {


		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[4]/one-app-nav-bar-item-dropdown/div")).click();
		System.out.println("success");
		WebElement newopp = driver.findElement(By.xpath("//span[text()='Open Tasks']"));
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",newopp);
		driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button--reset')]")).click();
		WebElement recentlyviewed = driver.findElement(By.xpath("//span[contains(@class,'slds-text-color_weak slds-text-body_small')]"));
				 
		 JavascriptExecutor executor1 =(JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();",recentlyviewed);
			Thread.sleep(10000);
			driver.findElement(By.xpath("//button[@title='Display as Split View']//lightning-primitive-icon[1]")).click();
			driver.findElement(By.xpath("//span[text()='Table']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(@class,'slds-button slds-button--icon-x-small')])[3]")).click();
			driver.findElement(By.xpath("(//a[@role='menuitem'])[4]")).click();
			driver.findElement(By.xpath("//span[text()='Delete']")).click();
			//driver.findElement(By.xpath("//a[contains(@class,'slds-grid slds-grid--vertical-align-center')]")).click();
	}

}
