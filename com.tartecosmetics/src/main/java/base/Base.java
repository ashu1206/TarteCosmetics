package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://tartecosmetics.com/en_IN/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

}
