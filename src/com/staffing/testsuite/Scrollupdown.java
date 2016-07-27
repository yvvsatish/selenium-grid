package com.staffing.testsuite;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Scrollupdown {
	@Parameters("browser")
	@Test
	public void scrollUpDown(String b) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = null;
		if (b.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Neeraj\\Downloads\\chromedriver.exe");
			cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}
		else if(b.equals("firefox"))
		{
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);
		} 
		else
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Neeraj\\Downloads\\IEDriverServer.exe");
			cap = DesiredCapabilities.internetExplorer();
			cap.setBrowserName("ie");
			cap.setPlatform(Platform.ANY);
		}
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://10.10.1.109:5555/wd/hub"), cap);
		Thread.sleep(5000);
		driver.get("http://www.flipkart.com/");
		driver.manage().window().setSize(new Dimension(1000,700));
		System.out.println(driver.findElement(By.name("q")).getSize().getWidth());
		System.out.println(driver.findElement(By.name("q")).getSize().getHeight());
		driver.findElement(By.name("q")).sendKeys("washing machine");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
}