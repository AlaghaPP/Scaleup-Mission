package URLCheck;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the URL to open:");
        String url = sc.nextLine();

        // Setup ChromeDriver
       
        WebDriver driver = new ChromeDriver();

        // Open the entered URL
        driver.get(url);

        // Maximize window
        driver.manage().window().maximize();

        sc.close();	
		
		
	}

}
