package zohowebsite;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import zohowebsite.LoginExecute;


public class LeadsExecute  {

	
	private static Logger log = Logger.getLogger(Log.class.getName());
	  
public static void main(String[] args) throws InterruptedException, IOException{
		
	 DOMConfigurator.configure("log4j.xml");
	 
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\maitreyi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 // WebDriver driver = new ChromeDriver();
	  // driver.get("https://www.zoho.com/crm/lp/login.html");
	  // driver.manage().window().maximize();
	  LoginExecute LE = new LoginExecute();
	  LE.firstclass();
	  
	 log.info("Login successful");
	 
		//WebDriver driver = new ChromeDriver();
	  
	
	  LeadsPage NewLead=PageFactory.initElements(LoginExecute.driver,  LeadsPage.class);
	 
 Thread.sleep(3000);
 NewLead.Leadsclick();
 NewLead.Plusclick1();
 Thread.sleep(3000);
	  NewLead.typecompanyname("mycompany");
	  Thread.sleep(1000);
	  NewLead.typeLastname("Lastname");
	Thread.sleep(1000);
	NewLead.saveButton();
		  
	   
	}
}
