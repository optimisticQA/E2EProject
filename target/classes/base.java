package OSF.resources;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {

    public static WebDriver driver;
    public Properties prop;

    public WebDriver initializeDriver() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\alubkowski\\IdeaProjects\\E2EProject\\src\\main\\java\\OSF\\resources\\data.properties");

        prop.load(fis);
        String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\alubkowski\\IdeaProjects\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\alubkowski\\IdeaProjects\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public void getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
        FileUtils.copyFile(source, new File(destinationFile));
    }

    @DataProvider(name = "getAllData")
    public Object[][] getAllData() {
        Object[][] data = new Object[1][8];
        data[0][0] = "automattest4"; //Username
        data[0][1] = "Test1234"; //Password
        data[0][2] = "Politechnika Warszawska"; //Wnioskodawca
        data[0][3] = "OPI Test BP"; //Nazwa banku
        data[0][4] = "78249000052816432318720678"; //Numer konta
        data[0][5] = "/epuap/test"; //Adres ePUAP
        data[0][6] = "8883323940"; //Numer NIP
        data[0][7] = "10448760077193"; //Numer Regon
        return data;
    }
}
