package Pageobjectclass1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Setup {
	WebDriver driver;
	//constructor
	public Setup(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//locators
	@FindBy(xpath="//input[@placeholder='Username']")  WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")  WebElement password;
	@FindBy(xpath="//button[normalize-space()='Login']")  WebElement login;
	@FindBy(tagName="a") List<WebElement> links;
	
	
	//Action methods
	public void setusername(String user) {
		username.sendKeys(user);
	}
	public void setpassword(String pass) {
		password.sendKeys(pass);
	}
	public void clicklogin() {
		login.click();
	}
	public void getlinks() {
	    for (WebElement link : links) {
	        System.out.println(link.getText());  
	    }
	}
}




