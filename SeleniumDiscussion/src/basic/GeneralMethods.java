package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralMethods {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();   
		driver.manage().window().maximize();     
		driver.get("https://demowebshop.tricentis.com/");
		//getText gives text present inside an element
		/*1.single line
		System.out.println(driver.findElement(By.xpath("//*[@class='topic-html-content-header']")).getText());*/
		
		/*Assing into a sting and print the sting value
		String heading=driver.findElement(By.xpath("//*[@class='topic-html-content-header']")).getText();
		System.out.println(heading);*/
		
		WebElement heading = driver.findElement(By.xpath("//*[@class='topic-html-content-header']"));
		String headingText = heading.getText();
		System.out.println(headingText);
		
		//getDomAttribute gives attribute value of any webelement
		String attributeVal=driver.findElement(By.xpath("//*[@value='Subscribe']")).getDomAttribute("id");
		System.out.println(attributeVal);
				
		//grab value of css property of any web element
		String clr=driver.findElement(By.xpath("//*[@value='Subscribe']")).getCssValue("padding");
		System.out.println(clr);
				
				//tooltip is nothing but value of title attribute of WebElement
				
				driver.quit();
	}

}
