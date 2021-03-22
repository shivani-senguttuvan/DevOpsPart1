import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class SetupDriver {
	
		String fName;
		static WebDriver driver;
		
		public WebDriver setUpDriver() {
	        System.setProperty("webdriver.chrome.driver", "/Users/shivanisenguttuvan/Desktop/chromedriver");
	        driver = new ChromeDriver();
	        return driver;
		}

}
