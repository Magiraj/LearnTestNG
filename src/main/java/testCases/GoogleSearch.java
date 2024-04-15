package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.CommonClass;

public class GoogleSearch extends CommonClass{
@Test
	public void search_Value() {
		driver.findElement(By.name("q")).sendKeys("Selenium");

	}
	
}
