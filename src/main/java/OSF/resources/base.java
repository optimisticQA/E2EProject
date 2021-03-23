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
        //System.getProperty("user.dir")
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\OSF\\resources\\data.properties");

        prop.load(fis);
        //mvn test -Dbrowser=chrome
        //String browserName=System.getProperty("browser");
        String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\OSF\\resources\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\main\\java\\OSF\\resources\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
        FileUtils.copyFile(source, new File(destinationFile));
        return destinationFile;
    }

    @DataProvider(name = "getAllData")
    public Object[][] getAllData() {
        Object[][] data = new Object[1][2];
        data[0][0] = "automattest4"; //Username
        data[0][1] = "Test12345"; //Password
        return data;
    }
}
