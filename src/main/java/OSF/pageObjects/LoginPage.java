package OSF.pageObjects;

import OSF.waits.WaitForElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='loginId']")
    WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    WebElement password;

    @FindBy(xpath = "//*[@id='buttonZapisz']")
    WebElement login;

    @FindBy(xpath = "//a[contains(text(),'Pobierz login i hasło')]")
    WebElement loginAndPassword;


    public WebElement getUsername() {
        WaitForElement.waitUntillElementIsVisible(username);
        return username;
    }

    public WebElement getPassword() {
        WaitForElement.waitUntillElementIsVisible(password);
        return password;
    }

    public WebElement getLogin() {
        WaitForElement.waitUntillElementIsVisible(login);
        return login;
    }

    public WebElement getLoginAndPassword() {
        WaitForElement.waitUntillElementIsVisible(loginAndPassword);
        return loginAndPassword;
    } //Asercja


}

