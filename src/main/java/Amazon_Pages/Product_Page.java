package Amazon_Pages;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;


public class Product_Page {
WebDriver driver;

//Constructor
public Product_Page(WebDriver driver) {this.driver = driver;}


//Search Product
@FindBy(id="twotabsearchtextbox") private WebElement Search;

public Product_Page Search_(String Product){
	Search.sendKeys(Product); 
	return this;}

//Select Product
@FindBy(id="nav-search-submit-button")
protected WebElement  SearchBox_selectProduct;

 public  Product_Page Select_Product() {
	SearchBox_selectProduct.click();
	 return this;}
 
}
