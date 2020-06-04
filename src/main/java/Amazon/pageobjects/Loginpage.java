package Amazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	public WebDriver driver;
	By loginfield = By.id("ap_email");
	By Continue = By.id("continue");
	By Password = By.id("ap_password");
	By Signin = By.id("signInSubmit");
	
	public Loginpage(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement loginname()
	{
		return driver.findElement(loginfield);
	}
	
	public WebElement continuebutton()
	{
		return driver.findElement(Continue);
	}
	public WebElement passwordfield()
	{
		return driver.findElement(Password);
	}
	public WebElement signclick()
	{
		return driver.findElement(Signin);
	}
}
