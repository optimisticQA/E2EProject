package OSF;

import OSF.pageObjects.HomePageRW;
import OSF.pageObjects.LoginPage;
import OSF.pageObjects.LoginPageRole;
import OSF.resources.base;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginAplication extends base {

    @BeforeTest()
    public void initialize() throws IOException {
        driver = initializeDriver();

    }

    @Test(dataProvider = "getData")
    public void loginPage(String Username, String Password) throws IOException {
        driver.get(prop.getProperty("url"));
        LoginPage l = new LoginPage(driver);
        Assert.assertEquals(l.getLoginAndPassword().getText(), "Pobierz login i hasło");
        l.getUsername().sendKeys(Username);
        l.getPassword().sendKeys(Password);
        l.getLogin().click();

        LoginPageRole lr = new LoginPageRole(driver);
        lr.getRolaRW().click();
        lr.getContinue().click();

        HomePageRW hrw = new HomePageRW(driver);
        Assert.assertTrue(hrw.getHomePageNowyWniosek().isDisplayed());
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
