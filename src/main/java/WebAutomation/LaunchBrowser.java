package WebAutomation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		// Initialize the Chrome browser
		WebDriver driver = new ChromeDriver();

		// Open a website
		driver.get("https://www.google.com");

		// Print the title of the page
		System.out.println("Page Title: " + driver.getTitle());

		// Close the browser
		driver.quit();

	}
}
