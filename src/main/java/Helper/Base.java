package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Base {
	
	public static Properties prop;
	public static WebDriver driver;
	
	static {
		
		
		try {
			FileInputStream File = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/Resources/Env.Properties");
			prop=new Properties();
			prop.load(File);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		
		
	}
	
	@Before
	public void setup() {
		
	String browsername=	prop.getProperty("Browser");
	
	if(browsername.equals("Chrome")) {
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--incognito");
	    driver=new ChromeDriver(options);
		
	}else if(browsername.equals("Edge")) {
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--incognito");
		 driver=new EdgeDriver(options);
	}
		
	driver.get(prop.getProperty("URL"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	 @After
     public void TakeScreenshot() {
	//driver.quit();
	}
	

	
	public WebElement Wait(By by) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	

}
