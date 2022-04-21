package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class TestBaseTransfer {

    public static WebDriver driver = null;
    WebDriverWait driverWait = null;

    @BeforeSuite
    public void initialize() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\pureh\\Downloads\\chromedriver_win32\\chromeDriver.exe");
        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/overview.htm");
    }
    @AfterSuite
//Test cleanup
    public void TeardownTest() {
        TestBaseTransfer.driver.quit();
    }


}