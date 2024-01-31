import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();	
driver.get("https://www.amazon.in/");
//driver.get("https://www.flipkart.com/");
Actions a = new Actions(driver);
a.moveToElement(driver.findElement(By.xpath("//span[@class='nav-line-2 ']"))).build().perform();
a.moveToElement(driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"))).build().perform();
//a.moveToElement(driver.findElement(By.xpath("//div[@class='_1wE2Px']"))).build().perform();
a.moveToElement(driver.findElement(By.id("//a[@id='nav-link-amazonprime']"))).build().perform();
a.moveToElement(driver.findElement(By.id("nav-search-bar-form"))).keyDown("Hp Laptop").build().perform();
	}

}
