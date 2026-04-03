package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage{

	WebDriver driver ;
	 
	@BeforeTest
	public void setup() 
	{
		driver =new ChromeDriver();	
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void url() 
	{
		driver.get("https://demo.scaleup-business-builder.xyz/");
		//Thread.sleep(500);
	}
	@Test(priority=1)
	public void test()	
	{

		//Login//
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	            
		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div[1]/div/form/div[1]/input")).sendKeys("super-admin");
		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div[1]/div/form/div[2]/input")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[1]/div/body/div/div[1]/div[1]/div/form/button")).click();
	}
	@Test
	public void homePageTitle()
	{
		String s=driver.getTitle();
		String e="Scaleup Business Builder Demo";
		if(s.equals(e))
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Fail");
		}
	    //Assert.assertEquals(driver.getTitle(), "Scaleup Business Builder Demo");
	}

}                               
	
