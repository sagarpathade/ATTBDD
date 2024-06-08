package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SEarchButtonfun {
	private WebDriver driver;

	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	WebElement Searchfielteaxt;


public SEarchButtonfun(WebDriver driver) {
	this.driver=driver ;
	PageFactory.initElements(driver, this);
	
}


public void searchProduct (String product) {
	Searchfielteaxt.sendKeys(product);
}
}
