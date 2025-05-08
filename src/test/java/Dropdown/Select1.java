package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement dropcoun=driver.findElement(By.id("country"));
		Select dropli=new Select(dropcoun);
		//dropli.selectByIndex(2);
		//String selectedoption=dropli.getFirstSelectedOption().getText();
		//System.out.println("print the value :"+selectedoption);
		List<WebElement> all=dropli.getOptions();
		for(WebElement allone:all) {
			System.out.println(allone.getText());
		}

	}

}
