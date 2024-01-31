import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriver driver=new ChromeDriver();
   driver.get("https://rahulshettyacademy.com/locatorspractice/");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
   driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
   //driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("99493@");
   //driver.findElement(By.id("chkboxTwo")).click();
   
   driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
   driver.findElement(By.cssSelector("button[type='submit']")).click();
   System.out.println(driver.findElement(By.tagName("p")).getText());
   
  
   
   
   
   


	}

}
