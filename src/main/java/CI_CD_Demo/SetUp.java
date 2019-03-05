package CI_CD_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SetUp {
	public WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kritika.dwivedi\\Downloads\\Drivers\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	}

	@AfterClass
	public void afterClass() {
	    driver.quit();
	}

}
