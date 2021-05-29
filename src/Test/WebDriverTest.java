package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		
		LoginLink.click();
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		
		UserName.sendKeys("anwi1017@mail.com");
		
		WebElement UserPwd = driver.findElement(By.name("user_pwd"));
		
		UserPwd.sendKeys("9876");
		
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		
		LoginBtn.click();
		
		WebElement LoginError = driver.findElement(By.className("error_msg"));
		
	
		
	}

}
