package Google_Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GooglePage_Amazon {

	WebDriver driver;

	public GooglePage_Amazon(WebDriver driver) {
		this.driver = driver;
	}

	// Enter Amazon in Gooogle_Searchbox
	@FindBy(xpath = "//textarea[@id='APjFqb']")
	public WebElement Google_SearchBox;

	@FindBy(id = "jZ2SBf")
	private WebElement EnterAmazon;

	public GooglePage_Amazon Enter_Amazon(String text) {
	
		Google_SearchBox.sendKeys(text);
		EnterAmazon.click();
		return this;
	}

	// Click Amazon_Hyperlink
	@FindBy(xpath="//*[@id=\"tads\"]/div/div/div/div/div[1]/a")
	private WebElement AmazonHyperlink;

	public GooglePage_Amazon Navigate_AmazonPage() throws InterruptedException {
		Thread.sleep(3000);
		AmazonHyperlink.click();
		return this;
	}

	// Wait for Amazon Page open

	public GooglePage_Amazon WaitFor_ProductPage() {
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-logo-sprites")));
		return this;
	}
}
