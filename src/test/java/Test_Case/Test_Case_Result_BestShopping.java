package Test_Case;

import org.testng.annotations.Test;

public class Test_Case_Result_BestShopping extends Test_Case_Flipkart{
  @Test(priority = 5)
  public void Compare_price() {
	  System.out.println("Better Shopping for Mackbook under 1 lakhs");
	  
	  if(Amazon_MackbookPrice>Flikart_MackbookPrice) {
		System.out.println("Amazon");
		System.out.println("Macbook Name: "+Amazon_MackbookName);
		System.out.println("Price- Rs:"+Amazon_MackbookPrice);}
	  
	  else if(Flikart_MackbookPrice>Amazon_MackbookPrice) {
		   System.out.println("Flipkart");
			System.out.println("Macbook Name: "+Flikart_MackbookName);
			System.out.println("Price- Rs:"+Flikart_MackbookPrice);}
      
	  else if(Flikart_MackbookPrice==Amazon_MackbookPrice) {
		  System.out.println("Both Amazon and Flipkart have same Price");
		  System.out.println("Mackbook Name: "+Amazon_MackbookName);
		  System.out.println("Price- Rs:"+Amazon_MackbookPrice);
	  }
  }
}
