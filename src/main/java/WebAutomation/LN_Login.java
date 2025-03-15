package WebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LN_Login {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		// Initialize the Chrome browser
		WebDriver driver = new ChromeDriver();

		// Open a website
		driver.get("https://qa-automation.loginextsolutions.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.ByCssSelector.id("username")).sendKeys("beta25@loginextsolutions.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("MayDay21Demo");
		driver.findElement(By.xpath("//button[@id='login']")).click();

		// Print the title of the page
		System.out.println("Page Title: " + driver.getTitle());
		System.out.println("push");
		// Close the browser
		//driver.quit();

	}

}
