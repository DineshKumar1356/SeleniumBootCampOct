package demo;



import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
		
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

		public class NewDashBoard extends BaseClass {
			
			@Test(priority=4)

			public void newdashboard() throws InterruptedException {
				
				driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[text()='View All']")).click();
				driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Dashboard");
				driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
				driver.findElement(By.xpath("//div[@title='New Dashboard']")).click();
				Thread.sleep(3000);
				List<WebElement> frameElement = driver.findElements(By.xpath("//iframe"));
				
				driver.switchTo().frame(frameElement.get(0));
				driver.findElement(By.id("dashboardNameInput")).sendKeys("Salesforce Automation by Dinesh");
				driver.findElement(By.id("submitBtn")).click();
				Thread.sleep(10000);
				List<WebElement> frameElement1 = driver.findElements(By.xpath("//iframe"));
				System.out.println(frameElement1.size());
				//driver.switchTo().frame(frameElement1);
				//driver.switchTo().frame(frameElement.get(0));
				//List<WebElement>save = driver.findElements(By.xpath("//div[@id='main']//button[text()='Save']"));
				//System.out.println(save.size());
			}
			
		



	}


