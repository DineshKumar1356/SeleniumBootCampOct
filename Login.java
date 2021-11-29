package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass {
	
	@Test(priority=5)

	public void newoppourtunity() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none']")).click();
				
	WebElement newopp = driver.findElement(By.xpath("//span[text()='New Opportunity']"));
	JavascriptExecutor executor =(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();",newopp);
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by dinesh");
	driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("11/13/2021");
	WebElement dropopp = driver.findElement(By.xpath("//label[text()='Stage']/following::div[1]//input[@class='slds-input slds-combobox__input']"));
	executor.executeScript("arguments[0].click();", dropopp);
	driver.findElement(By.xpath("//span[text()='Needs Analysis']")).click();
	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	WebElement msg = driver.findElement(By.xpath("//span[text()[contains(.,'was created.')]]"));
	msg.getText();
	System.out.println(msg.isDisplayed());
		
	}

}
