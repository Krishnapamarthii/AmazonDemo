package Amazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	
	public WebDriver driver;
	
	By login =By.xpath("//*[@id='nav-link-accountList']");
	
	public Homepage(WebDriver driver) {
	
		this.driver=driver;
	}

	public WebElement getlogin()
	{
		return driver.findElement(login);
	}

}
