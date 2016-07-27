package com.staffing.testsuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.staffing.utility.Constants;
import com.staffing.utility.Login;

public class Employeeaddress extends Constants{
	@Test
	public void addAddress() throws InterruptedException, IOException{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Infogen-PC7\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//System.setProperty("webdriver.safari.noinstall", "true");
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Login l = PageFactory.initElements(driver, Login.class);
	l.login(uname,pwd);
	Thread.sleep(2000);
	driver.findElement(By.linkText("Employee")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Upload H1B Documents")).click();
	Thread.sleep(2000);
	for (int i = 0; i < 9; i++) {
	driver.findElement(By.xpath("//*[@id='big_table']/tbody/tr[1]/td[4]/span/a")).click();
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[starts-with(@id,'delete')]/div/div/div[2]/a[1]")).click();
	}
/*	driver.findElement(By.linkText("Add New")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("h1b_doc_title")).sendKeys("test");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector(".btn.green.fileinput-button")).click();
	Thread.sleep(1000);
	java.lang.Runtime.getRuntime().exec("C:\\Users\\Infogen-PC7\\Desktop\\upload.exe");
	Thread.sleep(3000);
	Alert alert = driver.switchTo().alert();
	alert.dismiss();
	driver.findElement(By.id("btnSubmit")).click();
	WebDriverWait mywait = new WebDriverWait(driver, 30);
	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='progress-div']//*[@style='width: 100%;']")));
	Thread.sleep(3000);	
	driver.findElement(By.xpath("//*[@class='btn red']//*[@href='#delete1204']")).click();
	Thread.sleep(3000);	
	alert.accept();*/
	
//	l.logout(driver);
//	driver.close();
	}
}