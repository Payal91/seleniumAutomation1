package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(how = How.LINK_TEXT, using = "Log Out")
    WebElement logOutLink;

    public void clickLogOut() {
        logOutLink.click();
    }
}