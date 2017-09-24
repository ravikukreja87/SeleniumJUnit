package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutTest {
	WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();

	}

	@Test
	public void loginTest() {
		System.out.println("This is Junit Test");
		String baseURL = "http://hms.techcanvass.co.in/";
		String userName = "Pradnya";
		String password = "1994";
		// Initialize WebDriver Instance (driver)

		driver.manage().window().maximize();
		// Maximize browser

		// Launch Chrome Browser
		driver.get(baseURL);
		// Navigate to HMS login page

		driver.findElement(By.id("txtUserName")).sendKeys(userName);
		// Enter User name

		driver.findElement(By.id("txtPassword")).sendKeys(password);
		// Enter Password

		driver.findElement(By.id("LoginButton")).click();
		// Click on Login button

		WebElement label = driver.findElement(By.id("ctl00_lblloginuser"));

		String actualUserName = label.getText();

		label.getClass();
		label.click();

		Assert.assertEquals("Failed -- Values are not equal","Pradnya", actualUserName);

	}

}
