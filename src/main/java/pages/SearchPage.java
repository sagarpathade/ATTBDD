package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	
private	WebDriver driver; 
	
	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	private	WebElement searchTextField;
	
	
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void searchProduct(String product)
	{
		searchTextField.sendKeys(product);
	}

}
