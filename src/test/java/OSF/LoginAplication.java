package OSF;

import OSF.pageObjects.HomePageRW;
import OSF.pageObjects.LoginPage;
import OSF.pageObjects.LoginPageRole;
import OSF.resources.base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginAplication extends base {

    private static Logger log = LogManager.getLogger(base.class.getName());

    @BeforeTest()
    public void initialize() throws IOException {
        driver = initializeDriver();
        log.info("Driver is initialized");
    }

    @Test(dataProvider = "getData")
    public void loginPage(String Username, String Password) throws IOException {
        driver.get(prop.getProperty("url"));
        log.info("Navigated to Login page");
        LoginPage l = new LoginPage(driver);
        Assert.assertEquals(l.getLoginAndPassword().getText(), "Pobierz login i hasło");
        log.info("Successfully validated Text message");
        l.getUsername().sendKeys(Username);
        l.getPassword().sendKeys(Password);
        l.getLogin().click();
        log.info("Successfully login");

        LoginPageRole lr = new LoginPageRole(driver);
        lr.getRolaRW().click();
        lr.getContinue().click();
        log.info("Successfully role selected");

        HomePageRW hrw = new HomePageRW(driver);
        Assert.assertTrue(hrw.getHomePageNowyWniosek().isDisplayed());
        log.info("Navigated to Home page");
    }

    @AfterTest
    public void teardown() {
        driver.close();
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[1][2];
        data[0][0] = "automattest4"; //Username
        data[0][1] = "Test123456"; //Password
        return data;
    }
}
