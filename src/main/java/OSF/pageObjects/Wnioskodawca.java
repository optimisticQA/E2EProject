package OSF.pageObjects;

import OSF.waits.WaitForElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wnioskodawca {

    public WebDriver driver;

    public Wnioskodawca(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    private @FindBy(xpath = "//a[contains(text(),'Wnioskodawca')]")
    WebElement goToWnioskodawca;

    private @FindBy(xpath = "//span[contains(text(),'Wybierz z bazy OPI')]")
    WebElement fromDatabase;

    private @FindBy(xpath = "//input[@role='textbox']")
    WebElement enterApplicant;

    private @FindBy(xpath = "//span[contains(text(),'Wyszukaj')]")
    WebElement search;

    private @FindBy(xpath = "//strong[contains(text(),' ')]/following-sibling::div[1]/div[1]/button")
    WebElement choose;

    private @FindBy(xpath = "//button[@id='wnioskodawcaForm:daneWnioskodawcyId_edit_button']")
    WebElement editWnioskodawca;

    private @FindBy(xpath = "//input[@id='wnioskodawcaForm:nazwaBankuEdit']")
    WebElement bankName;

    private @FindBy(xpath = "//input[@id='wnioskodawcaForm:numerKontaEdit']")
    WebElement accountNumber;

    private @FindBy(xpath = "//input[@id='wnioskodawcaForm:epuapEdit']")
    WebElement ePUAP;

    private @FindBy(xpath = "//input[@id='wnioskodawcaForm:nipEdit']")
    WebElement NIP;

    private @FindBy(xpath = "//input[@id='wnioskodawcaForm:regonEdit']")
    WebElement REGON;

    private @FindBy(xpath = "//button[@id='wnioskodawcaForm:daneWnioskodawcyId_edit_dialog_save_button']")
    WebElement saveWnioskodawca;

    private @FindBy(xpath = "//h2[contains(text(),'Oświadczenia')]/following-sibling::div[1]/button")
    WebElement editStatement;

    private @FindBy(xpath = "//div[@id='wnioskodawcaForm:editTblOswiadczeniaId:0:oswInformacjeWeWnioskuEditId']")
    WebElement statement1;

    private @FindBy(xpath = "//div[@id='wnioskodawcaForm:editTblOswiadczeniaId:1:oswInformacjeWeWnioskuEditId']")
    WebElement statement2;

    private @FindBy(xpath = "//div[@id='wnioskodawcaForm:editTblOswiadczeniaId:3:oswInformacjeWeWnioskuEditId']")
    WebElement statement3;

    private @FindBy(xpath = "//div[@id='wnioskodawcaForm:editTblOswiadczeniaId:4:oswInformacjeWeWnioskuEditId']")
    WebElement statement4;

    private @FindBy(xpath = "//h2[contains(text(),'Oświadczenia')]/following-sibling::div[2]/div/div[3]/span/button[1]")
    WebElement saveStatement;

    public WebElement getGoToWnioskodawca() {
        WaitForElement.waitUntillElementIsVisible(goToWnioskodawca);
        return goToWnioskodawca;
    }

    public WebElement getFromDatabase() {
        WaitForElement.waitUntillElementIsVisible(fromDatabase);
        return fromDatabase;
    }

    public WebElement getEnterApplicant() {
        WaitForElement.waitUntillElementIsVisible(enterApplicant);
        return enterApplicant;
    }

    public WebElement getSearch() {
        WaitForElement.waitUntillElementIsVisible(search);
        return search;
    }

    public WebElement getChoose() {
        WaitForElement.waitUntillElementIsVisible(choose);
        return choose;
    }

    public WebElement getEditWnioskodawca() {
        WaitForElement.waitUntillElementIsVisible(editWnioskodawca);
        return editWnioskodawca;
    }

    public WebElement getBankName() {
        WaitForElement.waitUntillElementIsVisible(bankName);
        return bankName;
    }

    public WebElement getAccountNumber() {
        WaitForElement.waitUntillElementIsVisible(accountNumber);
        return accountNumber;
    }

    public WebElement getePUAP() {
        WaitForElement.waitUntillElementIsVisible(ePUAP);
        return ePUAP;
    }

    public WebElement getNIP() {
        WaitForElement.waitUntillElementIsVisible(NIP);
        return NIP;
    }

    public WebElement getREGON() {
        WaitForElement.waitUntillElementIsVisible(REGON);
        return REGON;
    }

    public WebElement getEditStatement() {
        WaitForElement.waitUntillElementIsVisible(editStatement);
        return editStatement;
    }

    public WebElement getStatement1() {
        WaitForElement.waitUntillElementIsVisible(statement1);
        return statement1;
    }

    public WebElement getStatement2() {
        WaitForElement.waitUntillElementIsVisible(statement2);
        return statement2;
    }

    public WebElement getStatement3() {
        WaitForElement.waitUntillElementIsVisible(statement3);
        return statement3;
    }

    public WebElement getStatement4() {
        WaitForElement.waitUntillElementIsVisible(statement4);
        return statement4;
    }

    public WebElement getSaveWnioskodawca() {
        WaitForElement.waitUntillElementIsVisible(saveWnioskodawca);
        return saveWnioskodawca;
    }

    public WebElement getSaveStatement() {
        WaitForElement.waitUntillElementIsVisible(saveStatement);
        return saveStatement;
    }
}

