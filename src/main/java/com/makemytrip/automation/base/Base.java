package com.makemytrip.automation.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.makemytrip.automation.utils.PropertiesRead;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base extends PropertiesRead{
	public static WebDriver driver;
	public static final PropertiesRead prop = new PropertiesRead();
	public static WebDriverWait wait;

	public void invokeBrowser() {
		closeBrowser();
		String browserName = prop.readProperty("browserName").toLowerCase();
		switch (browserName) {
		case "chrome" -> {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-http2", "--disable-quic");
			driver = new ChromeDriver(options);
		}
		case "firefox" -> {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		case "edge" -> {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		default -> throw new IllegalArgumentException("Unsupported browser: " + browserName);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
		//To open website url
		public void openURL() {
			driver.get(prop.readProperty("URL"));
		}

		// To close the Browser
		public void closeBrowser() {
			if (driver != null) {
				driver.quit();
				driver = null;
			}
		}

		public void Click(String locator) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.readProperty(locator)))).click();
		}

		public void Send(String locator,String data) {
			WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.readProperty(locator))));
			webElement.clear();
			webElement.sendKeys(data);
		}

		public String GetString(String locator) {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.readProperty(locator)))).getText();
		}

		public boolean displayed(String locator) {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.readProperty(locator)))).isDisplayed();
		}

		public void clickIfPresent(String locator) {
			var elements = driver.findElements(By.xpath(prop.readProperty(locator)));
			if (!elements.isEmpty() && elements.get(0).isDisplayed()) {
				wait.until(ExpectedConditions.elementToBeClickable(elements.get(0))).click();
			}
		}

		public void takeScreenShot() {
			TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
			File sourceFile = takeScreenShot.getScreenshotAs(OutputType.FILE);

			File screenshotDirectory = new File(System.getProperty("user.dir"), "ScreenShots");
			if (!screenshotDirectory.exists() && !screenshotDirectory.mkdirs()) {
				throw new IllegalStateException("Unable to create screenshot directory: " + screenshotDirectory);
			}
			File destFile = new File(screenshotDirectory, System.currentTimeMillis() + ".png");
			try {
				FileUtils.copyFile(sourceFile, destFile);
			} catch (IOException e) {
				throw new IllegalStateException("Unable to save screenshot: " + destFile, e);
			}

		}
}
