package Test_Case;

import org.testng.annotations.Test;

public class Test_Case_Flipkart extends Test_Case_Amazon{
	
@Test(groups = { "Flipkart" }, priority = 3)
public void FlipKart_SearchProduct() {
	Flipkart_Page
	.Navigate_FlipkartPages()
	.GetTitle();

	Flipkart_Page
	.Close_LoginPopup()
	.Search_(Amazon_MackbookName)
	.GetTitle();
}

public String Flikart_MackbookName;
public int Flikart_MackbookPrice;
public String Flikart_MackbookImage;
@Test(groups = { "Flipkart" }, priority = 4)
public void Extract_ProductDetails() {
Flikart_MackbookName=Flipkart_Page.Filpkart_MacbookName();
Flikart_MackbookPrice=Flipkart_Page.Filpkart_MacbookPrice();

System.out.println("Extarct Sucessfully");
}}