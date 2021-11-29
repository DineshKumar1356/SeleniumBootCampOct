package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateTaskWithoutMandatoryFields extends BaseClass {
	
	@Test(priority=2)
	public void  createTaskWithoutMandatoryFields() throws InterruptedException {
		
	
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
	driver.findElement(By.xpath("(//input[@data-aura-class='uiInput uiInputTextForAutocomplete uiInput--default uiInput--input uiInput uiAutocomplete uiInput--default uiInput--lookup'])[2]")).sendKeys("anbu Selvam");
	driver.findElement(By.xpath("//mark[@class='data-match']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@title='Save']//span[1]")).click();
	WebElement error = driver.findElement(By.xpath("//div[@data-aura-class='forcePageError']//div[1]"));
	System.out.println(error.getText());
	
}
}
