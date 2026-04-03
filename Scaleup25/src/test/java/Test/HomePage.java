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

public class HomePage {

	
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
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("splash-screen")));
      
	            
		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div[1]/div/form/div[1]/input")).sendKeys("super-admin");
		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div[1]/div/form/div[2]/input")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[1]/div/body/div/div[1]/div[1]/div/form/button")).click();
	}	
	@Test(priority=2,dependsOnMethods= {"test"})
	public void test1()
	{
	    WebElement humburgerMenu=driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div[1]/div/div"));
	    Actions actions= new Actions(driver);
	    actions.moveToElement(humburgerMenu).click().perform();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}	
	
}
