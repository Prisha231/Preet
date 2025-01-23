package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.Baseclass;

public class LoginPage extends Baseclass {
	
	@FindBy(id="user-name")
	WebElement user;
	
	@FindBy(id="password")
	WebElement password1;
	
	@FindBy(id="login-button")
	WebElement loginbtn;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateLogin() {
		user.sendKeys("standard_user");
		password1.sendKeys("secret_sauce");
		loginbtn.click();
	}
	
	

}
