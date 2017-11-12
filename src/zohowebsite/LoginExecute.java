package zohowebsite;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
public class LoginExecute {
public static	WebDriver driver;
 
public static void firstclass() throws InterruptedException, IOException{
	
	//public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\maitreyi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 
	 Properties prop1 = new Properties();
	 
	 File file = new File("F:\\JuneMorning6AM18\\zohowebsite\\object.properties");
	 
	  FileInputStream fileInput = new FileInputStream(file);
	
 	  // FileInputStream file1 = new FileInputStream(System.getProperty(("user.dir")+"\\src\\objects.properties"));
 	   prop1.load(fileInput);
	
	   driver.get(prop1.getProperty("URL"));
	
	   driver.switchTo().frame("zohoiam");
	   LoginPage NewItem=PageFactory.initElements(driver, LoginPage.class);
  	   prop1.load(fileInput);	

	   Thread.sleep(3000);
	   	
	   NewItem.typeUserName(prop1.getProperty("Username"));
	   Thread.sleep(1000);
	   NewItem.typePassword("testqa22435");
	   Thread.sleep(1000);
	   NewItem.clickSubmit();
	   Thread.sleep(5000);
	 
	 //  NewItem.typeProductName("Tea");
	   
	}
}
	//}




