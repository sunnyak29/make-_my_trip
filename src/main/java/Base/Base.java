package Base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



import Utils.PropertiesRead;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base extends PropertiesRead{
	 public WebElement element;
		public static WebDriver driver;
		public static PropertiesRead prop=new PropertiesRead();
		public  WebDriverWait wait;
	

		// To call different browsers
		@SuppressWarnings("deprecation")
		public void invokeBrowser() {

			// To Open Chrome Browser
			if (prop.readProperty("browserName").equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}

			// To Open Firefox Browser
			if (prop.readProperty("browserName").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}

			// To Open Edge Browser
			if (prop.readProperty("browserName").equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}

			// To maximize the Browser Window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		//To open website url
		public void openURL() {
			
			String string= prop.readProperty("URL");
			driver.get(string);
		}

		// To close the Browser
		public void closeBrowser() {
			System.out.println("closebrowser");
			driver.quit();
		}
		//To click on webelement
		public void Click(String locator) {
			driver.findElement(By.xpath(prop.readProperty(locator))).click();
		}
		//To send data to webelement
		public void Send(String locator,String data) {
			driver.findElement(By.xpath(prop.readProperty(locator))).sendKeys(data);
		}
		//To get text from webelement
		public String GetString(String locator) {
			return(driver.findElement(By.xpath(prop.readProperty(locator))).getText());
		}
		//To check webelement is present or not
		public boolean displayed(String locator) {
			return (driver.findElement(By.xpath(prop.readProperty(locator))).isDisplayed());
		}
	    
		//To add waite
		@SuppressWarnings("deprecation")
		public void AddWaite(long time) {
			try {
				driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);

			} catch (Exception e) {
				System.out.println(e);
				// TODO: handle exception
			}
		}
		
//		Capture Screen Shot 
		public void takeScreenShot() {
			TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
			File sourceFile = takeScreenShot.getScreenshotAs(OutputType.FILE);

			File destFile = new File(System.getProperty("user.dir") + "/ScreenShots/" + System.currentTimeMillis() + ".png");
			try {
				FileUtils.copyFile(sourceFile, destFile);
				System.out.println("ScreenShot is Taken");
//				logger.addScreenCaptureFromPath(
//						System.getProperty("user.dir") + "/ScreenShots/" +System.currentTimeMillis() + ".png");

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
		//To add page loadout time
//		@SuppressWarnings("deprecation")
//		public void pageloadwaite() {
//			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
//		}
//		public static void main(String[] args) {
//			Base n=new Base();
//			if (prop.readProperty("browserName").equalsIgnoreCase("chrome")) {
//				WebDriverManager.chromedriver().setup();
//				driver = new ChromeDriver();
//			}
//            driver.get(prop.readProperty("URL"));
//		}
}
