package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.CommonClass;
@Test
public class Dynamic_Dropdown extends CommonClass {

	public void dropDown_Handle() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(4000);
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
for (WebElement webe : ele) {
	String text = webe.getText();
	System.out.println(text);
	
}
	}
	
}
