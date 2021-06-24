package OSF;

import OSF.pageObjects.*;
import OSF.resources.base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;


public class CreateAnApplication extends base {

    public WebDriver driver;
    private static Logger log = LogManager.getLogger(base.class.getName());

    @BeforeTest()
    public void initialize() throws IOException {
        driver = initializeDriver();
        log.info("Driver is initialized");
    }
//TEST 2
    @Test(dataProvider = "getData")
    public void loginPage(String Username, String Password) throws IOException {
        driver.get(prop.getProperty("url"));
        log.info("Navigated to Login page");
        LoginPage l = new LoginPage(driver);
        Assert.assertEquals(l.getLoginAndPassword().getText(), "Pobierz login i hasło");
        log.info("Successfully validated Text message");
        l.getUsername().sendKeys(Username);
        l.getPassword().sendKeys(Password);

        LoginPageRole lr = l.getLogin();
        log.info("Successfully login");
        lr.getRolaRW();

        HomePageRW hrw = lr.getContinue();
        log.info("Successfully role selected");
        Assert.assertTrue(hrw.getHomePageNowyWniosek().isDisplayed());
        log.info("Successfully navigated to Home page");
    }

    @Test(dependsOnMethods = {"loginPage"})
    public void createAplication() throws IOException {
        HomePageRW hrw = new HomePageRW(driver);
        hrw.getHomePageNowyWniosek().click();
        log.info("Successfully navigated to the create application window");
    }

    @Test(dependsOnMethods = {"createAplication"})
    public void selectAgency() throws IOException {
        HomePageRWagency hag = new HomePageRWagency(driver);
        hag.getAgencyNameMNISW().click();
        hag.getContestGNGk5().click();
        log.info("Successfully agency selected");
    }

    @Test(dependsOnMethods = {"selectAgency"})
    public void newApplication() throws IOException {
        NewAplication na = new NewAplication(driver);
        na.getDownloadMessage().click();
        na.getSelectStatement().click();
        na.getCreateApplication().click();
        log.info("The application has been created successfully");
    }

    @Test(dependsOnMethods = {"newApplication"}, dataProvider = "getDataWnioskodawca")
    public void uzupelnijWnioskodawca(String Wnioskodawca, String NazwaBanku, String NumerKonta, String AdresePUAP, String NumerNIP, String NumerRegon) throws IOException {
        Wnioskodawca w = new Wnioskodawca(driver);
        w.getGoToWnioskodawca().click();
        w.getFromDatabase().click();
        w.getEnterApplicant().sendKeys(Wnioskodawca);
        w.getSearch().click();
        w.getChoose().click();
        w.getEditWnioskodawca().click();
        w.getBankName().sendKeys(NazwaBanku);
        w.getAccountNumber().sendKeys(NumerKonta);
        w.getePUAP().sendKeys(AdresePUAP);
        w.getNIP().sendKeys(NumerNIP);
        w.getREGON().clear();
        w.getREGON().sendKeys(NumerRegon);
        w.getSaveWnioskodawca().click();
        w.getEditStatement().click();
        for (int retry = 0; retry < 2; retry++) {
            try {
                w.getStatement1().click();
                w.getStatement2().click();
                w.getStatement3().click();
                w.getStatement4().click();
                w.getSaveStatement().click();
                log.info("The applicant section was successfully completed");
                break;
            } catch (StaleElementReferenceException ex) {
                System.out.println((ex.toString()));
            }
        }
    }

    @AfterTest
    public void teardown() {
        driver.close();
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[1][2];
        data[0][0] = "automattest4"; //Username
        data[0][1] = "Test1234"; //Password
        return data;
    }

    @DataProvider
    public Object[][] getDataWnioskodawca() {
        Object[][] data = new Object[1][6];
        data[0][0] = "Politechnika Warszawska"; //Wnioskodawca
        data[0][1] = "OPI Test BP"; //Nazwa banku
        data[0][2] = "78249000052816432318720678"; //Numer konta
        data[0][3] = "/epuap/test"; //Adres ePUAP
        data[0][4] = "8883323940"; //Numer NIP
        data[0][5] = "10448760077193"; //Numer Regon
        return data;
    }
}
