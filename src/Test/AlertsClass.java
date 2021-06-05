package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement CusID = driver.findElement(By.xpath("//*[@name='cusid']"));
		
		CusID.sendKeys("1234");
		
		WebElement Submit = driver.findElement(By.xpath("//*[@name='submit']"));
		
		Submit.click();
		
		Alert alertobj = driver.switchTo().alert();
		
		alertobj.accept();
		
		//alertobj.dismiss();
		
	    //alertobj.toString();

	}

}
