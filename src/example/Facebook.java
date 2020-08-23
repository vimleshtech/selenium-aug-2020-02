package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver d =new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		d.findElement(By.id("email")).sendKeys("9968362921");
		d.findElement(By.id("pass")).sendKeys("welcome1244");
		d.findElement(By.name("login")).click();
		
		
	}

}
