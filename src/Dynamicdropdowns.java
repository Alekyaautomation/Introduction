import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamicdropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
                WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
				Select Dropdown=new Select(staticDropdown);
				driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
				//dynamic dropdown with Index
				//driver.findElement(By.xpath("//a[@value='BLR']")).click();
				//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
				//dynamic dropdown with parent to child
				driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']")).click();
				driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
				

				
				

	}
}

				
