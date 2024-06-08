package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	private	WebDriver driver; 
	
	@FindBy(xpath = "//*[@id='nav-cart']")
	private	WebElement cartIcon;
	
	@FindBy(xpath = "//*[@class='a-carousel-card']//img[@alt='Under 499']")
	private	WebElement dealSection;
	
	@FindBy(xpath = "//*[@class='a-list-item']//*[text()='Sports, Fitness & Outdoors']")
	private	WebElement fitnessSection;
	
	private	WebDriverWait wait;
	
	public HomePage(WebDriver driver)
	{
	this.driver	= driver;
	 
	PageFactory.initElements(driver, this);
	
	wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	
	
	
	
	public String getTitleOfPage()
	{
	String titleOfPage	= driver.getTitle();
	
	return titleOfPage;
	}

	
	public boolean isCartIconDisplayed()
	{
		boolean isDisplaying = cartIcon.isDisplayed();
		
		return isDisplaying;
	}
	
	
	public void checkoutDealsSection()
	{
		wait.until(ExpectedConditions.visibilityOf(dealSection));
		
		JavascriptExecutor	js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", dealSection);
		
				
	}
	
	public boolean fitnessSection()
	{
		wait.until(ExpectedConditions.visibilityOf(fitnessSection));
		boolean isDisplay = fitnessSection.isDisplayed();
		
		return isDisplay;
		
	}
	
	
	
	
	
}
