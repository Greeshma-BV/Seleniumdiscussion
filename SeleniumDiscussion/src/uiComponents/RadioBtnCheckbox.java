package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnCheckbox
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();   
		driver.manage().window().maximize();     
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox=driver.findElement(By.xpath("//*[@id='gridCheck']"));
		boolean checkStatus=checkbox.isSelected();
		System.out.println("Is checkbox checked :"+checkStatus);
		System.out.println("Is checkbox Displayed :"+checkbox.isDisplayed());
		System.out.println("Is checkbox Enabled :"+checkbox.isEnabled());
		checkbox.click();
		System.out.println("Is checkbox checked :"+checkbox.isSelected());
		driver.quit();
		

		
	}
		
}
