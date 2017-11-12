package zohowebsite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {

	
	
	@FindBy(xpath = ".//*[@id='tab_Contacts']")
	private WebElement Contacts;

	@FindBy(xpath = ".//*[@id='topRightIcons']/span[1]/input")
	private WebElement PlusButton;

	@FindBy(xpath = ".//*[@id='Contacts_fldRow_LASTNAME']/div[2]")
	private WebElement ContactLastname;
	
	@FindBy(xpath = ".//*[@id='saveContactsBtn']")
	private WebElement ContactSave;

	public void ContactClick()
	{
		Contacts.click();
	}
	public void PlusButton1()
	{
		PlusButton.click();
	}
	public void SaveButton1()
	{
		ContactSave.click();
	}
	
	public void ContactLastname1(String text)
	{
		ContactLastname.sendKeys("lastname");
	}
	
	public void validCredentials(String Ln)
	{
		ContactLastname1(Ln);		
	}
	
}
