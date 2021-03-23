package OSF.pageObjects;

import OSF.waits.WaitForElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageRole {

    public WebDriver driver;

    public LoginPageRole(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private @FindBy(css = "*[for*='rw']")
    WebElement rolarw;

    private @FindBy(xpath = "//a[@id='buttonContinue']")
    WebElement clickcontinue;

    public WebElement getRolaRW() {
        WaitForElement.waitUntillElementIsVisible(rolarw);
        rolarw.click();
        return rolarw;
    }

    public HomePageRW getContinue() {
        WaitForElement.waitUntillElementIsVisible(clickcontinue);
        clickcontinue.click();
        HomePageRW hrw = new HomePageRW(driver);
        return hrw;
    }


}

