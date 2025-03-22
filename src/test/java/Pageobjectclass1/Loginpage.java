package Pageobjectclass1;

import java.net.PasswordAuthentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	
	public Loginpage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='name']") WebElement User_loc;
    @FindBy(xpath="//input[@id='email']") WebElement email_loc;
    @FindBy(xpath="//input[@id='phone']") WebElement phone_loc;
    @FindBy(xpath="//textarea[@id='textarea']") WebElement text_loc;
    @FindBy(xpath="//input[@id='female']") WebElement female_loc;
    @FindBy(xpath="//input[@id='saturday']") WebElement Day_loc;
    @FindBy(xpath="//select[@id='country']") WebElement Country_loc;
    @FindBy(xpath="//select[@id='colors']//option[3]") WebElement colour_loc;
    @FindBy(xpath="//option[@value='cheetah']") WebElement Animal_loc;
    @FindBy(xpath="//input[@id='datepicker']") WebElement Date_picker_loc;
    @FindBy(xpath="//*[text()='Next']") WebElement clicknext_loc;       
    @FindBy(xpath="//span[@class='ui-datepicker-month']") WebElement Clickmon_loc;
    @FindBy(xpath="//span[@class='ui-datepicker-year']") WebElement Clickyear_loc;
    @FindBy(xpath="//a[normalize-space()='11']") WebElement Clickdate_loc;
    @FindBy(xpath="//input[@id='txtDate']") WebElement Txt_date_loc;

    @FindBy(xpath="//select[@aria-label='Select month']") WebElement Select_month_loc;
    @FindBy(xpath="//*[text()='May']") WebElement Select_may_loc;
    

    @FindBy(xpath="//select[@aria-label='Select year']") WebElement Select_year_loc;
    @FindBy(xpath="//*[text()='2026']") WebElement select_2026_loc;
    

    @FindBy(xpath="//a[normalize-space()='11']") WebElement Select_date_2026;
   
    		
    @FindBy(xpath="//input[@id='start-date']") WebElement Start_date_loc;
    
    
    

    @FindBy(xpath="//input[@id='end-date']") WebElement Enterdate_loc;
    
    @FindBy(xpath="//button[@class='submit-btn']") WebElement Submitbutton_loc;
    @FindBy(xpath="//div[@id='result']")
    private WebElement isdisplayed;
     
    
    public void SetUsername(String user)
    {
    	User_loc.sendKeys(user);
    }
    
    public void SetPassword(String password)
    {
    	email_loc.sendKeys(password);
    }
    
    public void SetPhoneno(String number)
    {
    	phone_loc.sendKeys(number);
    }
    
    public void Textarea(String text)
    {
    	text_loc.sendKeys(text);
    }
    
    public void Setradio()
    {
    	female_loc.click();
    }
    
    public void Setday()
    {
    	Day_loc.click();
    }
    
    public void Setcountry()
    {
    	Country_loc.click();
    }
    
    public void Setcolour()
    {
    	colour_loc.click();
    }
    
    public void Setanimal()
    {
    	Animal_loc.click();
    }
    
    
    public void Setstartdate()
    {
    	Date_picker_loc.click();
    }
    
    public void Month()
    {
    	clicknext_loc.click();
    }
    
    public void Nela()
    {
    	Clickmon_loc.click();
    }
    
    public void Setyear()
    {
    	Clickyear_loc.click();
    }
    
    public void date()
    {
    	Clickdate_loc.click();
    }
    
    public void Setenddate()
    {
    	Txt_date_loc.click();
    }
    
    public void Selectmonth()
    {
    	Select_month_loc.click();
    }
    
    public void selectmay()
    {
    	Select_may_loc.click();
    }
    
   public void select_year_next()
   {
	   Select_year_loc.click();
   }
    
   public void select_2026()
   {
	   select_2026_loc.click();
   }
   
   public void Select_2026_date()
   {
	   Select_date_2026.click();
   }
    public void Setdate(String date)
    {
    	Start_date_loc.sendKeys(date);
    }
    
    public void Setdatefieldbox(String date1)
    {
    	Enterdate_loc.sendKeys(date1);
    }
    
    public void Submitbutton()
    {
    	Submitbutton_loc.click();
    }
    
    public boolean text_dispalyed() {
        System.out.println("It is printing correct: " + isdisplayed.isDisplayed());
        return isdisplayed.isDisplayed();
    }
}
