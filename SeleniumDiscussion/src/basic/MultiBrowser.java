package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser 
{

	public static void main(String[] args)
	{
		String browser="Edge";
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver(); 
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Please Enter a vaild Browser name");
		}
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.quit();
		
	}

}
