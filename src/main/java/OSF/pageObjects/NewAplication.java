package OSF.pageObjects;

import OSF.waits.WaitForElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAplication {

    public WebDriver driver;

    public NewAplication(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Pobierz komunikat']")
    WebElement downloadMessage;

    @FindBy(xpath = "//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")
    WebElement selectStatementGNGk5;

    @FindBy(xpath = "//button[@id='tworzenieWnioskuDialogForm:utworzId']//span[@class='ui-button-text ui-c']")
    WebElement createApplication;


    public WebElement getDownloadMessage() {
        WaitForElement.waitUntillElementIsVisible(downloadMessage);
        return downloadMessage;
    }

    public WebElement getSelectStatement() {
        WaitForElement.waitUntillElementIsVisible(selectStatementGNGk5);
        return selectStatementGNGk5;
    }

    public WebElement getCreateApplication() {
        WaitForElement.waitUntillElementIsVisible(createApplication);
        return createApplication;
    }
}

