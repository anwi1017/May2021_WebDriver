package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbLogin {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			//driver.findElement(By.linkText("English (UK)")).click();
			
			WebElement UserName = driver.findElement(By.xpath("//input[@name='email']"));
			
			UserName.sendKeys("abc@xyz.com");
			

			WebElement Passowrd = driver.findElement(By.xpath("//input[@id='pass']"));
			
			Passowrd.sendKeys("abc123");
			
		WebElement LoginButton = driver.findElement(By.xpath("//button[@name='login']"));
		
		LoginButton.click();
		
		driver.close();
		
				
		


		}

	}


