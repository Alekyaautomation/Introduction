import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxdropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.manage().window().maximize();
//driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
//how to know whether the checkbox is selected
System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
//to know number checkboxes are present
System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());


	}

}
