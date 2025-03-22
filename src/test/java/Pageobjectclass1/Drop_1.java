package Pageobjectclass1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//*[@placeholder='Enter Name']")).sendKeys("prasad");
		driver.findElement(By.xpath("//*[@placeholder='Enter EMail']")).sendKeys("prasadbusam1996@gmail.com");
		driver.findElement(By.xpath("//*[@placeholder='Enter Phone']")).sendKeys("9951156294");
		driver.findElement(By.xpath("//*[@id='textarea']")).sendKeys("This is prasad");
		driver.findElement(By.xpath("//*[@id='female']")).click();
		driver.findElement(By.xpath("(//*[@type='checkbox'])[2]")).click();
		WebElement drop1 =driver.findElement(By.xpath("//*[@id='country']"));
		Thread.sleep(3000);
		Select sel=new Select(drop1);
		Thread.sleep(3000);
		sel.selectByIndex(7);

	}

}
