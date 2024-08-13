package Flipkart_pages;

import java.time.temporal.WeekFields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Flipkart_Dashboard_Page {
  WebDriver driver;

public Flipkart_Dashboard_Page(WebDriver driver) {this.driver = driver;}

//-----------------Navigate to FilpkartPage------------------//
public Flipkart_Dashboard_Page Navigate_FlipkartPages() {
	driver.get("https://www.flipkart.com/");
	return this;}

public Flipkart_Dashboard_Page GetTitle() {
	driver.getTitle();
	return this;}

//-----------------Close Login pop-up--------------------------//
public Flipkart_Dashboard_Page Close_LoginPopup(){

	if(driver.getPageSource().contains("Get access to orders"))  
	driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
return this;
}

//---------------Search Product--------------------------------//
@FindBy(xpath="(//input[@placeholder='Search for Products, Brands and More'])[1]")
private WebElement Search_box;

@FindBy(xpath="(//*[name()='svg'])[1]")
private WebElement Search_icon;

public Flipkart_Dashboard_Page Search_(String Product) {
Search_box.sendKeys(Product);
Search_icon.click();
return this;}

//-----------------Extract All Value--------------------------//
@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
private WebElement Flipkart_MacbookName;

@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div[1]/div[1]")
private WebElement Flipkart_Price;

public String Filpkart_MacbookName() {
	return Flipkart_MacbookName.getText();}

public int Filpkart_MacbookPrice() {
	String text=Flipkart_Price.getText().replaceAll("₹", "").replaceAll(",", "");
	return Integer.parseInt(text);}
}
