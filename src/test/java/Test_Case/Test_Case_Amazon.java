package Test_Case;

import org.testng.Assert;
import org.testng.annotations.Test;

import Test_Base.Test_Base;

public class Test_Case_Amazon extends Test_Base {

@Test(groups = {"Amazon"},priority = 0)
public void Amazon_login() throws InterruptedException {
	Amazon
	.Enter_Amazon("Amazon.in")
	.Navigate_AmazonPage()
	.WaitFor_ProductPage();
}
	
@Test(groups = {"Amazon" },priority = 1)
public void SearchProduct() {
	Product_Page
	   .Search_("Apple macbook")
	   .Select_Product();
	Assert.assertTrue(Macbook_Page.ActualTitle().contains("macbook"));
}

public String Amazon_MackbookName;
public int Amazon_MackbookPrice;
public String Amazon_MackbookImage;
@Test(groups = {"Amazon" },priority = 2)
public void Select_Macbook() throws InterruptedException {
	Macbook_Page
       .Select_LaptopPrice(100000);
	
	//----------Extract MacbookName, Price and Image-------//
	Amazon_MackbookName=Macbook_Page.Amazon_MacbookName();
    Amazon_MackbookPrice=Macbook_Page.Amazon_MacbookPrice();
    Amazon_MackbookImage=Macbook_Page.Amazon_MacbookImage();
	}

}
