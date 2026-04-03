package Test;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Leads {

	WebDriver driver ;
	//WebDriverWait wait;

	 
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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("splash-screen")));
      
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	            
		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div[1]/div/form/div[1]/input")).sendKeys("super-admin");
		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div[1]/div/form/div[2]/input")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[1]/div/body/div/div[1]/div[1]/div/form/button")).click();
		
	}
	@Test(priority=2)
	public void lead()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("splash-screen")));
		
		driver.findElement(By.xpath("/html/body/div[1]/div/body/div/div[2]/div/ul/li[2]/a/span[1]")).click();
    }
	@Test(priority=3)
	public void search()
	{
		WebElement searchBox =driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[3]/div/div/div/div/div/div[1]/div[1]/div/input"));
		Actions act= new Actions(driver) ;
		act.moveToElement(searchBox).sendKeys("Praveen").perform();
	//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Alagha");
   // driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[3]/div/div/div/div/div/div[1]/div[1]/div/span")).click();
		
		
	}
	
}
