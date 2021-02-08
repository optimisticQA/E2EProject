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

    @FindBy(css = "div.ui-widget:nth-child(12) div.fixed-page-width div.ui-panelgrid.ui-widget.main-layout div.ui-panelgrid-content.ui-widget-content.ui-grid.ui-grid-responsive div.ui-g div.ui-panelgrid-cell.main-layout-column-right.ui-g-12.ui-md-6:nth-child(2) div.zsun-section:nth-child(6) div.ui-dialog.ui-widget.ui-widget-content.ui-corner-all.ui-shadow.ui-hidden-container.ui-draggable.ui-resizable div.ui-dialog-content.ui-widget-content:nth-child(2) table.ui-panelgrid.ui-widget.ui-noborder tbody:nth-child(1) tr.ui-widget-content:nth-child(1) td.ui-panelgrid-cell div.ui-selectbooleancheckbox.ui-chkbox.ui-widget.padding > span.ui-chkbox-label")
    WebElement statement1;

    @FindBy(css = "div.ui-widget:nth-child(12) div.fixed-page-width div.ui-panelgrid.ui-widget.main-layout div.ui-panelgrid-content.ui-widget-content.ui-grid.ui-grid-responsive div.ui-g div.ui-panelgrid-cell.main-layout-column-right.ui-g-12.ui-md-6:nth-child(2) div.zsun-section:nth-child(6) div.ui-dialog.ui-widget.ui-widget-content.ui-corner-all.ui-shadow.ui-hidden-container.ui-draggable.ui-resizable div.ui-dialog-content.ui-widget-content:nth-child(2) table.ui-panelgrid.ui-widget.ui-noborder tbody:nth-child(1) tr.ui-widget-content:nth-child(3) td.ui-panelgrid-cell div.ui-selectbooleancheckbox.ui-chkbox.ui-widget.padding > span.ui-chkbox-label")
    WebElement statement2;

    @FindBy(css = "div.ui-widget:nth-child(12) div.fixed-page-width div.ui-panelgrid.ui-widget.main-layout div.ui-panelgrid-content.ui-widget-content.ui-grid.ui-grid-responsive div.ui-g div.ui-panelgrid-cell.main-layout-column-right.ui-g-12.ui-md-6:nth-child(2) div.zsun-section:nth-child(6) div.ui-dialog.ui-widget.ui-widget-content.ui-corner-all.ui-shadow.ui-hidden-container.ui-draggable.ui-resizable div.ui-dialog-content.ui-widget-content:nth-child(2) table.ui-panelgrid.ui-widget.ui-noborder tbody:nth-child(1) tr.ui-widget-content:nth-child(7) td.ui-panelgrid-cell div.ui-selectbooleancheckbox.ui-chkbox.ui-widget.padding > span.ui-chkbox-label")
    WebElement statement3;

    @FindBy(css = "div.ui-widget:nth-child(12) div.fixed-page-width div.ui-panelgrid.ui-widget.main-layout div.ui-panelgrid-content.ui-widget-content.ui-grid.ui-grid-responsive div.ui-g div.ui-panelgrid-cell.main-layout-column-right.ui-g-12.ui-md-6:nth-child(2) div.zsun-section:nth-child(6) div.ui-dialog.ui-widget.ui-widget-content.ui-corner-all.ui-shadow.ui-hidden-container.ui-draggable.ui-resizable div.ui-dialog-content.ui-widget-content:nth-child(2) table.ui-panelgrid.ui-widget.ui-noborder tbody:nth-child(1) tr.ui-widget-content:nth-child(9) td.ui-panelgrid-cell div.ui-selectbooleancheckbox.ui-chkbox.ui-widget.padding > span.ui-chkbox-label")
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

