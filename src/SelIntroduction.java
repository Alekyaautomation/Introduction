import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		
//Invoking Brower
		//chrome - chromeDriver->methods close get
		//firefox-firefoxDriver->methods close get 
		//safari saariDriver ->methods close get
		//webDriver close get
		// Web Driver methods + class methods
		//chromedriver.exe -> chrome brower Selenium Manager
	//step to invoke chrome driver//
	
		
		//chrome
		//System.setProperty("webdriver.chrome.driver", "/Users/Alekya/Documents/chromedriver.exe");
		//webdriver.chrome.driver->value of path
		//WebDriver driver = new ChromeDriver();
		
		
		//Firefox Launch
		//geckodriver
		//webdriver.gecko.driver
		//System.setProperty("webdriver.Firefox.driver", "/Users/Alekya/Documents/geckodriver.exe");
		//WebDriver driver =new FirefoxDriver();
		
		
		//Microsoft Edge
		//Edgedriver
		//Webdriver.Edge.driver
		System.setProperty("webdriver.Edge.driver", "/Users/Alekya/Documents/msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		
		
		driver.get("https://learning.tcsionhub.in/hub/national-qualifier-test/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}
}
