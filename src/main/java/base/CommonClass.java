package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class CommonClass {
public ChromeDriver driver;
	@BeforeMethod
	public void statApp() {
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");

	}
	
	
	
}
