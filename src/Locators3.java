import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		   driver.get("https://rahulshettyacademy.com/locatorspractice/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		   driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		   driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
		   driver.findElement(By.className("signInBtn")).click();
		   Thread.sleep(2000);
		   System.out.println(driver.findElement(By.tagName("p")).getText());
		   Assert.assertEquals(driver.findElements(By.tagName("p")),"You are successfully logged in.");
		   Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+"Rahul"+",");
		   driver.findElement(By.xpath("//*[text()='Log Out']")).click();
           driver.quit();
	}
	
}
