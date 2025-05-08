package Testcases1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pageobjectclass1.Setup;

public class Applysetup {
	WebDriver driver;
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@Test
	void actin() {
		Setup up=new Setup(driver);
		up.setusername("Admin");
		up.setpassword("admin123");
		up.clicklogin();
		up.getlinks();
	}
	@AfterClass
	void teardown() {
		driver.quit();
	}
}
