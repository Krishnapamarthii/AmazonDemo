package Amazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Orders {
	
	public WebDriver driver;
	
	By Navorders = By.id("nav-orders");
	By Cancel = By.linkText("Cancelled Orders");
	
	public Orders(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public WebElement ordersummary()
	{
		return driver.findElement(Navorders);
	}
	public WebElement cancelorders()
	{
		return driver.findElement(Cancel);
	}

}
