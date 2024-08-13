package Amazon_Pages;

import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class Macbook_Page{
WebDriver driver;

public Macbook_Page(WebDriver driver) {this.driver = driver;}

/*----------------------------Get_Title---------------------------*/
public String ActualTitle() {
	 return driver.getTitle();}  

/*----------------------------Select Price------------------------*/
By price=By.xpath("//span[@class='a-price-whole']['normalize-space()=']");


public Macbook_Page Select_LaptopPrice(int Price) throws InterruptedException {
	Thread.sleep(3000);
	String maxNumber = null; 
	int temp=0;
	List<WebElement> laptopList=driver.findElements(price);

	for (WebElement i : laptopList) {
//------ Store Price in integer
		int k = Integer.parseInt(i.getText().replaceAll(",", ""));
		if (k <= Price && temp < k) {
			maxNumber = i.getText(); // Store Max Price but less than Input Price
		    temp=k;	
		}
	}
//----- Click near Input Price laptop
	By macbook = By.xpath("//span[@class='a-price-whole'][normalize-space()='" + maxNumber + "']");
	driver.findElement(macbook).click();

//----- Switch to Windows
    ArrayList<String> tab=new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(tab.get(1));
  return this;}

/*---------------------------Get Laptop Name, Price--------------------*/
@FindBy(xpath="(//span[@id='productTitle'])[1]")
private WebElement Amazon_MacbookNameLabel;

@FindBy(xpath="//*[@id=\"corePriceDisplay_desktop_feature_div\"]/div[1]/span[3]/span[2]/span[2]")
private WebElement Amazon_MacbookPrice_Label;

@FindBy(xpath="(//div[@id='imgTagWrapperId'])[1]")
private WebElement Amazon_MacbookImage;

public String Amazon_MacbookName() {	
	return Amazon_MacbookNameLabel.getText();
}

public int Amazon_MacbookPrice() {
		String text=Amazon_MacbookPrice_Label.getText().replaceAll(",", "");
		return Integer.parseInt(text);
}

public String Amazon_MacbookImage() {
	return Amazon_MacbookImage.getText();
}
}
