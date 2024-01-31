import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkboxpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.manage().window().maximize();

//check Box


//driver.findElement(By.id("checkBoxOption2")).click();
driver.findElement(By.cssSelector("input#checkBoxOption2")).click();
System.out.println(driver.findElement(By.cssSelector("input#checkBoxOption2")).getText());

//AutoSuggestive Dropdown


WebElement StaticDropdown=driver.findElement(By.name("dropdown-class-example"));
Select dropdown=new Select(StaticDropdown);
dropdown.selectByValue("option3");
System.out.println(dropdown.getFirstSelectedOption().getText());
driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("IND");
Thread.sleep(2000);
List<WebElement>options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
for (WebElement option : options)
{
    if (option.getText().equalsIgnoreCase("India")) {
        option.click();
        break;
    }
}
//radio button


driver.findElement(By.xpath("//label[@for='radio2']/input")).click();

//Alerts

String name="Ramesh";
driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys(name);
driver.findElement(By.xpath("//input[@value='Alert']")).click();
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().accept();
driver.findElement(By.xpath("//input[@value='Confirm']")).click();
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().dismiss();

//Switch tab

//driver.findElement(By.xpath("//a[@class='btn-style class1 class2']")).click();
//driver.findElement(By.xpath("//button[@onclick='openWindow()']")).click(); 

//element display
driver.findElement(By.xpath("//input[@name='show-hide']")).sendKeys("Ramesh");
driver.findElement(By.xpath("//input[@value='Hide']")).click();
System.out.println(driver.findElement(By.xpath("//input[@value='Hide']")).getText());




	}
}



