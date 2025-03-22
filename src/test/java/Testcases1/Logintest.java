package Testcases1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pageobjectclass1.Loginpage;

public class Logintest {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://testautomationpractice.blogspot.com/");
	}
	
	@Test
	public void Login() {
		Loginpage obj=new Loginpage(driver);
		obj.SetUsername("prasad");
		obj.SetPassword("prasad@123");
		obj.SetPhoneno("9951156294");
		obj.Textarea("This is prasad from machilipatnam");
		obj.Setradio();
		obj.Setday();
		obj.Setcountry();
		obj.Setcolour();
		obj.Setanimal();
		obj.Setstartdate();
		obj.Month();
		obj.Nela();
		obj.Setyear();
		obj.date();
		obj.Setenddate();
		obj.Selectmonth();
		obj.selectmay();
		obj.select_year_next();
		obj.select_2026();
		obj.Select_2026_date();
		obj.Setdate("11-05-2025");
		obj.Setdatefieldbox("11-05-2026");
		obj.Submitbutton();
		obj.text_dispalyed();
	}
	
	@AfterClass
	public void Teardown() {
		//driver.quit();
	}

}
