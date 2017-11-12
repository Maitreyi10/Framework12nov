package zohowebsite;


	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
	public class ContactExecute {
		
	public static void ContactExecute() throws InterruptedException{
		
		//public static void main(String[] args) throws InterruptedException{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\maitreyi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 	    WebDriver driver = new ChromeDriver();
		   driver.get("https://www.zoho.com/crm/lp/login.html");
		   driver.manage().window().maximize();
		   driver.switchTo().frame("zohoiam");
		   ContactPage NewContact=PageFactory.initElements(driver, ContactPage.class);
		 
		   Thread.sleep(3000);
		   	
		   NewContact.ContactClick();
		   Thread.sleep(1000);
		   NewContact.PlusButton1();
		   Thread.sleep(1000);
		   NewContact.ContactLastname1("Lastname");
		   Thread.sleep(5000);
		 
		 //  NewItem.typeProductName("Tea");
		   
		}
	}
		//}






