import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class NameLocator {
	
	String fName;
	static WebDriver driver;
	
	public WebDriver setUpDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/shivanisenguttuvan/Desktop/chromedriver");
        driver = new ChromeDriver();
        return driver;
	}
	
	public String getNameLocator() {
		driver.get("http://webapps.tekstac.com/Shopify/");
		fName = driver.findElement(By.name("fname")).getAttribute("placeholder");
		return fName;
	}

	public static void main(String[] args) {
		NameLocator namLocator = new NameLocator();
		namLocator.setUpDriver();
		String name = namLocator.getNameLocator();
		System.out.println(name);
	}
		

	

}
