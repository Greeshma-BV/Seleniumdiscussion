package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicPrgm1
{

	public static void main(String[] args) 
	{
		//For import Crtl+Shift+O
		WebDriver driver=new ChromeDriver();
		//Maximizing window
		driver.manage().window().maximize();
		//Opening an url 
		driver.get("https://www.flipkart.com/");
		//get title from the url
		System.out.println(driver.getTitle());
		//navigate to backword
		driver.navigate().back();
		//navigate to forward
		driver.navigate().forward();
		//close the browser
		driver.quit();
	}

}
