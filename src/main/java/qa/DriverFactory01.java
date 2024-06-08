package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory01 {
	WebDriver driver;

	public WebDriver initBRowser(String BrowserName) {

		if (BrowserName.equals("Chrome")) {

			driver = new ChromeDriver();

		} else

		{
			driver = new FirefoxDriver();

		}
		return driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

}
