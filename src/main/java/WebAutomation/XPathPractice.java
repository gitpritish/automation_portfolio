package WebAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class XPathPractice {
	public static void main(String[] args) {
		// Set up WebDriver (Make sure you have ChromeDriver installed and configured)
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Update path
		WebDriver driver = new ChromeDriver();
		System.out.println("push");
		// Open a demo website (You can replace this with your own test site)
		driver.get("https://www.saucedemo.com/");

		// Maximize the window and set implicit wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// 1️⃣ XPath using Attribute
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");

		// 2️⃣ XPath using text()
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();

		// 3️⃣ XPath using contains()
		WebElement productLabel = driver.findElement(By.xpath("//div[contains(text(),'Products')]"));
		System.out.println("Product Label: " + productLabel.getText());

		// 4️⃣ XPath using starts-with()
		WebElement cartIcon = driver.findElement(By.xpath("//a[starts-with(@class, 'shopping_cart')]"));
		cartIcon.click();

		// 5️⃣ XPath using parent to child
		WebElement menuButton = driver.findElement(By.xpath("//div[@class='bm-burger-button']/button"));
		menuButton.click();

		// 6️⃣ XPath using child to parent
		WebElement sidebar = driver.findElement(By.xpath("//nav[@class='bm-item-list']/.."));
		System.out.println("Sidebar found: " + (sidebar != null));

		// 7️⃣ XPath using following-sibling
		WebElement firstItem = driver
				.findElement(By.xpath("//div[@class='inventory_item_label']/following-sibling::div"));
		System.out.println("First Item Found: " + firstItem.getText());

		// 8️⃣ XPath using preceding-sibling
		WebElement backToProducts = driver.findElement(By.xpath("//button[text()='Remove']/preceding-sibling::button"));
		System.out.println("Back Button: " + backToProducts.getText());

		// Close the browser
		driver.quit();

	}
}
