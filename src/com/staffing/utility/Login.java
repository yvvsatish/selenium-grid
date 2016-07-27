package com.staffing.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(css="a.btn.success")
	WebElement login;
	@FindBy(id="login-username")
	WebElement uname;
	@FindBy(id="login-password")
	WebElement pwd;
	@FindBy(tagName="button")
	WebElement submit;
	@FindBy(className="dropdown-toggle")
	WebElement dropdown;
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/ul/li/ul/li[3]/a")
	WebElement logout;
	public void login(String u,String p){
		login.click();
		uname.sendKeys(u);
		pwd.sendKeys(p);
		submit.click();
	}
	public void logout(WebDriver driver){
		Actions action = new Actions(driver);
		WebElement event1 = dropdown;
		WebElement event2 = logout;
		action.moveToElement(event1).moveToElement(event2).click().build().perform();			
	}
}