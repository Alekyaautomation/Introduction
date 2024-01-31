import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		   driver.get("https://rahulshettyacademy.com/locatorspractice/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		   //driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		   //driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshetty");
		   driver.findElement(By.linkText("Forgot your password?")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Rahul");
		   driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rahulshettyacademy");
		   driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9958625850");
		   driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		 System.out.println( driver.findElement(By.cssSelector("form p")).getText());
		 
		 
	}

}
