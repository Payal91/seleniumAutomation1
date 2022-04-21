package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankSignInPage {
    WebDriver webDriver;

    public BankSignInPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(how = How.LINK_TEXT, using = "Register")
    WebElement registerLink;

    @FindBy(how = How.XPATH, using = "//input[@id='customer.firstName']")
    WebElement firstNameTextBox;

    @FindBy(how = How.CSS, using = "input[name='customer.lastName']")
    WebElement lastNameTextBox;

    @FindBy(how = How.XPATH, using = "//input[@id='customer.address.street']")
    WebElement addressTextBox;

    @FindBy(how = How.CSS, using = "input[id='customer.address.city']")
    WebElement cityTextBox;

    @FindBy(how = How.ID, using = "customer.address.state")
    WebElement stateTextBox;

    @FindBy(how = How.XPATH, using = "//input[@id='customer.address.zipCode']")
    WebElement zipCodeTextBox;

    @FindBy(how = How.CSS, using = "input[id='customer.phoneNumber']")
    WebElement phoneTextBox;

    @FindBy(how = How.ID, using = "customer.ssn")
    WebElement ssnTextBox;

    @FindBy(how = How.CSS, using = "input[id='customer.username']")
    WebElement userTextBox;

    @FindBy(how = How.XPATH, using = "//input[@name='customer.password']")
    WebElement passwordTextBox;

    @FindBy(how = How.XPATH, using = "//input[@id='repeatedPassword']")
    WebElement confirmPasswordTextBox;

    @FindBy(how = How.CSS, using = "input[value='Register']")
    WebElement registerButton;

    public void clickRegisterLink() {
        registerLink.click();
    }

    public void setFirstNameTextBox(String firstName) {
        firstNameTextBox.sendKeys(firstName);
    }

    public void setLastNameTextBox(String lastName) {
        lastNameTextBox.sendKeys(lastName);
    }

    public void setAddressTextBox(String address) {
        addressTextBox.sendKeys(address);
    }

    public void setCityTextBox(String city) {
        cityTextBox.sendKeys(city);
    }

    public void setStateTextBox(String state) {
        stateTextBox.sendKeys(state);
    }

    public void setZipCodeTextBox(String zipCode) {
        zipCodeTextBox.sendKeys(zipCode);
    }

    public void setPhoneTextBox(String phone) {
        phoneTextBox.sendKeys(phone);
    }

    public void setSsnTextBox(String ssn) {
        ssnTextBox.sendKeys(ssn);
    }

    public void setUserTextBox(String user) {
        userTextBox.sendKeys(user);
    }

    public void setPasswordTextBox(String password) {
        passwordTextBox.sendKeys(password);
    }

    public void setConfirmPasswordTextBox(String confirmPassword) {
        confirmPasswordTextBox.sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }
}
