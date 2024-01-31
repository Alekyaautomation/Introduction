import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.manage().window().maximize();
driver.findElement(By.id("autosuggest")).sendKeys("ind");
Thread.sleep(3000);

List<WebElement> Autosuggests=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));


//for loop enhancement

for(WebElement Autosuggest:Autosuggests)
{
	if(Autosuggest.getText().equalsIgnoreCase("India"))
	{
		Autosuggest.click();
		break;
	}
}
	}
}


