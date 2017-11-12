package zohowebsite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {


	
		//private WebElement SignIn;
	
	   
		@FindBy(xpath = ".//*[@id='lid']")
		private WebElement userName;

		
		
		@FindBy(xpath = ".//*[@id='pwd']")
		private WebElement password;

		@FindBy(xpath = ".//*[@id='submit_but']")
		private WebElement submit;

		
		
		public void typeUserName(String text)
		{
			userName.sendKeys(text);
		}
		public void typePassword(String text)
		{
			password.sendKeys(text);
		}
		
		
	
		public void clickSubmit()
		{
			submit.click();
		//	return new HomePage(driver);
			
		}
		
		//public HomePage validCredentials(String UN,String PWD)
		public void validCredentials(String UN,String PWD)
		{
			typeUserName(UN);
			typePassword(PWD);
		//	return clickSubmit();
		}
		} 



