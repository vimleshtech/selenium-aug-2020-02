package example;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GoogleAutomation {

	public static void main(String[] args) throws IOException {

		System.out.println("Hi, this is my first automation project ");
		
		//Create an object ChromeDriver
		WebDriver driver = new ChromeDriver();
		//WebDriver : is an inbuilt interface(library)
		//driver is object
		//new : is keyword which allocate memory of ChromeDriver()		

		//open Google.com
		driver.get("https://www.google.com");
		
		//read title 
		String title = driver.getTitle();
		System.out.println(title);
		
		//read url 
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//Full screen
		driver.manage().window().maximize();
		
		//Take ScreenShot 
		File f =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("C:\\Users\\Vimlesh.Kumar\\Documents\\Training\\Selenium\\Library\\out.png"));
		
		
		
		//Close the browse 
		//driver.close();
		
		
		
		
	}

}
