package Amazon.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	public WebDriver driver;
	public Properties pro;
	
	public WebDriver intializeDriver() throws IOException
	{
		pro= new Properties();
		FileInputStream File= new FileInputStream("C:\\Users\\KRISH-NA\\eclipse-workspace\\Orders\\src\\main\\java\\Amazon\\resources\\GeneralData.properties");
		pro.load(File);
		String BrowserName=pro.getProperty("browser");
		
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(BrowserName.equals("Firefox"))
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			driver= new FirefoxDriver();
		}
		else if(BrowserName.equals("IE"))
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			driver= new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
