import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Angularpractice {

	private static final WebElement StaticDropdown = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Ramesh");
		driver.findElement(By.name("email")).sendKeys("RameshBaggi16@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("RameshBaggi");
        //driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        driver.findElement(By.cssSelector("input#exampleCheck1")).click();
      //driver.findElement(By.id("exampleCheck1")).click();
        //driver.findElement(By.cssSelector("input#exampleCheck1[type='checkbox']")).click();
         System.out.println(driver.findElement(By.cssSelector("input#exampleCheck1")).isSelected());
        WebElement StaticDropdown= driver.findElement(By.id("exampleFormControlSelect1"));
         Select dropdown  =new Select(StaticDropdown);
         dropdown.selectByIndex(0);
       System.out.println (dropdown.getFirstSelectedOption().getText());
        //dropdown.selectByVisibleText("Male");
       driver.findElement(By.cssSelector("input[id='inlineRadio1']")).click();
       System.out.println(driver.findElement(By.cssSelector("input[id='inlineRadio1']")).isSelected());
       driver.findElement(By.name("bday")).sendKeys("16/03/1992");
     driver.findElement(By.cssSelector("input[type='submit']")).click();
    System.out.println(driver.findElement(By.cssSelector(".alert")).getText());
       
         
	

		

	}

}
