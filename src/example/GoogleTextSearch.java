package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTextSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium jar file download");
		
		driver.findElement(By.name("q")).submit();
		
		//backword
		driver.navigate().back();
		
		//forwared
		driver.navigate().forward();
		
		//refresh
		driver.navigate().refresh();
		
		
		
	}

}
