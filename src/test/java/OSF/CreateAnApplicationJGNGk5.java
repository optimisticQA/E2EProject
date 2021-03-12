package OSF;

import OSF.resources.base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;


public class CreateAnApplicationJGNGk5 extends base {

    public WebDriver driver;
    private static Logger log = LogManager.getLogger(base.class.getName());

    @BeforeTest()
    public void initialize() throws IOException {
        driver = initializeDriver();
        log.info("Driver is initialized");
        driver.get(prop.getProperty("url"));
    }

    @Test(dataProvider = "getAllData")
    public void CreateJGNGk5(String Username, String Password) throws IOException {
        LoginAplication loginAplication = new LoginAplication();
        loginAplication.loginPage(Username, Password);
       // CreateAnApplication createAnApplication = new CreateAnApplication();
        //createAnApplication.createAplication();
    }

    @AfterTest
    public void teardown() {
        driver.close();
    }

}
