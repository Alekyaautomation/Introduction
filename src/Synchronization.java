import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/loginpagePractise/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
driver.findElement(By.id("password")).sendKeys("learning");
driver.findElement(By.xpath("//input[@value='user']")).click();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
driver.findElement(By.id("okayBtn")).click();
WebElement Staticdropdown=driver.findElement(By.xpath("//select[@class='form-control']"));
Select Dropdown=new Select(Staticdropdown);
Dropdown.selectByValue("stud");
driver.findElement(By.xpath("//input[@id='terms']")).click();
driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
Thread.sleep(2000);

String []Smartphones= {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};

	
}
}
