package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LogoTest {

    WebDriver driver;

    
	@BeforeTest
	public void before()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.scaleup-business-builder.xyz/");
		
	}
	@Test
	public void test()
	{                 // Logo //
		
		WebElement w=driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div[1]/div/div/img"));
		Boolean DisplayedLogo=w.isDisplayed();
		if(DisplayedLogo==true)
		{
			System.out.println(" selected logois displayed");
			
		}
		else
		{
			System.out.println("is selected logo is not displayed");
		}
		    // radiobutton //
	
    }
    
    }


	

