package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class BankTransferPage {
    WebDriver driver;

    public BankTransferPage(WebDriver driver) {
        this.driver = driver;
    }

    //Using FindBy for locating elements
    @FindBy(how = How.CSS, using = "a[href='/parabank/transfer.htm']")
    WebElement transferFundsLink;
    @FindBy(how = How.CSS, using = "input[type='text']")
    WebElement amountTextBox;
    @FindBy(how = How.CSS, using = "input[value='Transfer']")
    WebElement transferLink;


    // Defining all the user actions (Methods) that can be performed
    public void clickTransferFundsLink() {
        transferFundsLink.click();
    }

    public void setAmountTextBox(String amt) {
        amountTextBox.sendKeys(amt);
    }

    public void selectFromAccount() {
        WebElement staticElement = driver.findElement(By.xpath("//select[@id='fromAccountId']"));
        System.out.println(staticElement.getText());
        Select select = new Select(staticElement);
        select.selectByValue("26442");
        System.out.println(select.getFirstSelectedOption().getText());
    }

    public void selectToAccount() {
        WebElement staticElement = driver.findElement(By.xpath("//select[@id='toAccountId']"));
        Select select = new Select(staticElement);
        select.selectByValue("26220");
        System.out.println(select.getFirstSelectedOption().getText());
    }

    public void clickTransferLink() {
        transferLink.click();
    }
}
