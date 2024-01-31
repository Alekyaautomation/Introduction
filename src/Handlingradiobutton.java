import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Handlingradiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

driver.findElement(By.xpath("//a[@value='BLR']")).click();

Thread.sleep(2000);

//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

//current date

//driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click(); is not accepting this step
//driver.findElement(By.cssSelector("a.ui-state-highlight")).click();
driver.findElement(By.cssSelector("a.ui-state-default")).click();
driver.findElement(By.cssSelector("input[name='ctl00$mainContent$view_date2']")).click();
System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
 {
	 System.out.println("its Enabled");
	 Assert.assertTrue(true);
 }
 else

 {

 Assert.assertTrue(false);
 }
	}
}

