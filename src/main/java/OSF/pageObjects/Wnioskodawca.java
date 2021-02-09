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

    @FindBy(xpath = "//a[contains(text(),'Wnioskodawca')]")
    WebElement goToWnioskodawca;

    @FindBy(xpath = "//span[contains(text(),'Wybierz z bazy OPI')]")
    WebElement fromDatabase;

    @FindBy(xpath = "//input[@role='textbox']")
    WebElement enterApplicant;

    @FindBy(xpath = "//span[contains(text(),'Wyszukaj')]")
    WebElement search;

    @FindBy(xpath = "//strong[contains(text(),' ')]/following-sibling::div[1]/div[1]/button")
    WebElement choose;

    @FindBy(xpath = "//button[@id='wnioskodawcaForm:daneWnioskodawcyId_edit_button']")
    WebElement editWnioskodawca;

    @FindBy(xpath = "//input[@id='wnioskodawcaForm:nazwaBankuEdit']")
    WebElement bankName;

    @FindBy(xpath = "//input[@id='wnioskodawcaForm:numerKontaEdit']")
    WebElement accountNumber;

    @FindBy(xpath = "//input[@id='wnioskodawcaForm:epuapEdit']")
    WebElement ePUAP;

    @FindBy(xpath = "//input[@id='wnioskodawcaForm:nipEdit']")
    WebElement NIP;

    @FindBy(xpath = "//input[@id='wnioskodawcaForm:regonEdit']")
    WebElement REGON;

    @FindBy(xpath = "//button[@id='wnioskodawcaForm:daneWnioskodawcyId_edit_dialog_save_button']")
    WebElement saveWnioskodawca;

    @FindBy(xpath = "//h2[contains(text(),'Oświadczenia')]/following-sibling::div[1]/button")
    WebElement editStatement;

    @FindBy(xpath = "//div[@id='wnioskodawcaForm:editTblOswiadczeniaId:0:oswInformacjeWeWnioskuEditId']")
    WebElement statement1;

    @FindBy(xpath = "//div[@id='wnioskodawcaForm:editTblOswiadczeniaId:1:oswInformacjeWeWnioskuEditId']")
    WebElement statement2;

    @FindBy(xpath = "//div[@id='wnioskodawcaForm:editTblOswiadczeniaId:3:oswInformacjeWeWnioskuEditId']")
    WebElement statement3;

    @FindBy(xpath = "//div[@id='wnioskodawcaForm:editTblOswiadczeniaId:4:oswInformacjeWeWnioskuEditId']")
    WebElement statement4;

    @FindBy(xpath = "//h2[contains(text(),'Oświadczenia')]/following-sibling::div[2]/div/div[3]/span/button[1]")
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

