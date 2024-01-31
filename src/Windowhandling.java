import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");//parent
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a.blinkingText")).click();//child
		Set<String> windows = driver.getWindowHandles();//[parentid,childid]
		Iterator<String> it=windows.iterator();
		String parentId =it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
        driver.findElement(By.cssSelector(".im-para.red")).getText();
        //keep debug and click on select line watch and edit
        String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        Thread.sleep(1000);
        driver.switchTo().window(parentId);
        driver.findElement(By.id("username")).sendKeys(emailId);


		
		
		
		
	}
	

}
