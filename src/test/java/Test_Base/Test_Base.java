package Test_Base;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import Amazon_Pages.*;
import Flipkart_pages.Flipkart_Dashboard_Page;
import Google_Pages.GooglePage_Amazon;
import Test_Case.Test_Case_Amazon;

public class Test_Base {
protected WebDriver driver; 
protected Product_Page Product_Page; protected Macbook_Page Macbook_Page;
protected GooglePage_Amazon Amazon;  protected Flipkart_Dashboard_Page Flipkart_Page;
Test_Case_Amazon AmazonPage;


 @BeforeTest
 public void GoogleSearch() {
	 ChromeOptions op=new ChromeOptions();
	 op.addArguments("--disable-notifications");
	 driver=new ChromeDriver(op);
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://www.google.com/");          
 }
 
	@BeforeGroups(groups = { "Amazon" })
	public void Initalize_AmazonPages(){
		Product_Page = PageFactory.initElements(driver, Product_Page.class);
		Macbook_Page =PageFactory.initElements(driver, Macbook_Page.class);
		Amazon = PageFactory.initElements(driver, GooglePage_Amazon.class);
	}
	
	@BeforeGroups(groups = { "Flipkart" })
	public void Initalize_FilpkartPages() {
	
		Flipkart_Page = PageFactory.initElements(driver, Flipkart_Dashboard_Page.class);
		AmazonPage=new Test_Case_Amazon(); 
	}
	
	@AfterTest
	public void logout() {
		driver.quit();
	}
}
