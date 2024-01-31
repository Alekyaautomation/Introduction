import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class Greenkart {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();



driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

String []itemsNeeded= {"Cucumber","Tomato","Carrot"};

driver.get("https://rahulshettyacademy.com/seleniumPractise/");

driver.manage().window().maximize();

Thread.sleep(2000);

additems(driver,itemsNeeded);

driver.findElement(By.xpath("//img[@alt='Cart']")).click();
driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
driver.findElement(By.xpath("//button[text()='Apply']")).click();
//explicity wait
//WebDriverWait w =new WebDriverWait(driver,5);

//w.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());


	}
	
		


	
private static void additems(WebDriver driver, String[] itemsNeeded) {
		// TODO Auto-generated method stub
		int j=0;
		List<WebElement> products =driver.findElements(By.xpath("//h4[@class='product-name']"));

		for(int i=0;i<products.size();i++)
		{
			//cucumber - 1kg
			//name[0]-cucumber
			//name[1]-1kg
			
			String[]name = products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			//check whether name you extracted is present in ArrayList or not
			
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if(itemsNeededList.contains(formattedName))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length)
				{
					break;
				}
	}
}
}
	}




