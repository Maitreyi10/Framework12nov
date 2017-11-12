package zohowebsite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
public class LeadsPage  {
	

	
	   
	    	@FindBy(xpath = "//*[@id='createNew']")		
			private WebElement Leads;


			@FindBy(xpath = "//*[@id='submenu_Leads']")
			private WebElement PlusButton;

			@FindBy(xpath = "//*[@id='Crm_Leads_COMPANY']")
			private WebElement Company;
			
			
			@FindBy(xpath = ".//*[@id='Crm_Leads_LASTNAME']")
			private WebElement Lastname;
			
			@FindBy(xpath = ".//*[@id='saveLeadsBtn']")
			private WebElement Save;
			
			public void Leadsclick(){
				Leads.click();
			}
			
			public void Plusclick1(){
				PlusButton.click();
			}
			
			public void typecompanyname(String text){
				Company.sendKeys(text);
				}
			
			public void typeLastname(String text){
				Lastname.sendKeys(text);
				}
			public void saveButton(){
				Save.click();
				}
			public void entercredentials(String co , String Ln)
			{
				typecompanyname(co);
				typeLastname(Ln);
			}
	    	
}
	

