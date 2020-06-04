package Amazon.Orders;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Amazon.pageobjects.Homepage;
import Amazon.pageobjects.Loginpage;
import Amazon.pageobjects.Orders;
import Amazon.resources.Base;

 class TestOne extends Base {
	 public static Logger log =LogManager.getLogger(Base.class.getName());
	 
	@BeforeTest
	public void intlz() throws IOException
	{
		driver =intializeDriver();
		log.info("Driver is initialized");
		driver.get(pro.getProperty("url"));
		log.info("Navigated to Home page");
	}
	
	@Test(dataProvider="getData")
	
	public void HomePage(String username, String password) throws IOException
	{
		
		Homepage p=new Homepage(driver);
		p.getlogin().click();
		Loginpage L = new Loginpage(driver);
		L.loginname().sendKeys(username);
		L.continuebutton().click();
		L.passwordfield().sendKeys(password);
		L.signclick().click();
		log.info("Successfully validated logged in");
		Orders O =new Orders(driver);
		O.ordersummary().click();
		O.cancelorders().click();
		log.info("Successfully clicked on cancelled orders");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		log.info("Driver is closed");
	}
		
	@DataProvider

	public Object[][] getData() 
	{
		//Non Restricted  user:
		Object[][] data=new Object[1][2];
		data[0][0]="krishnakanthpamarthi@gmail.com";
		data[0][1]="Indian@123";
		
		return data;
		
	}

	
}
