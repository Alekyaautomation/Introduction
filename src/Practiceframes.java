import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practiceframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
	//	System.out.println(driver.findElement(By.tagName("frameset")).getSize());
		
		driver.switchTo().frame("frame-top");


		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());

		

	}

}
