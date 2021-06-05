package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
        WebElement From = driver.findElement(By.xpath("//li[@id='credit2']/a"));
        
        WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));
        
        Actions actionobj = new Actions(driver);
        
        actionobj.dragAndDrop(From, To).build().perform();
        
       //actionobj.moveToElement(From);
       
       //actionobj.contextClick(From);

	}

}
