import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicewindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");//parent
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='/windows']")).click();//c1
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();//c2
		Set<String> windows =driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentId =it.next();
		String childId1=it.next();
		driver.switchTo().window(childId1);
		System.out.println(driver.findElement(By.cssSelector(".example")).getText());
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
	}

}
