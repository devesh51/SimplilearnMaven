package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test.BaseClass;


public class LoginPage {
	
	WebDriver driver = BaseClass.driver;
	ExtentTest test = BaseClass.test;
	
	
	
	  //================WEBElement Section=============
	@FindBy(linkText="Log in")
    WebElement LoginLink;
    
    @FindBy(name="user_login")
    WebElement UserName;
    
    @FindBy(id="password")
    WebElement Password;
    
    @FindBy(className="rememberMe")
    WebElement Remember;
    
    @FindBy(name="btn_login")
    WebElement LoginButton;
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//===================Method Section===============
	
	public void Login(String Uname, String pwd) {
		
		//WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		test.log(LogStatus.PASS, "click on link", "Sucssesfully clicked on the link");
		
		//WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(Uname);
		test.log(LogStatus.PASS, "click on Username", "Sucssesfully Entered the username");
		
		//WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(pwd);
		test.log(LogStatus.PASS, "click on user password", "Sucssesfully clicked on the user password");
		
	    //WebElement Rememeber =driver.findElement(By.className("rememberMe"));
	    Remember.click();
	    
		
		
		//WebElement LoginButton = driver.findElement(By.name("btn_login"));
		LoginButton.click();
		test.log(LogStatus.PASS, "click on login button", "Sucssesfully clicked on the login button");
		
	}
	
	
	
}
