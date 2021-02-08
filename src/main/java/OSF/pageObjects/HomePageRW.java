package OSF.pageObjects;

import OSF.waits.WaitForElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageRW {

    public WebDriver driver;

    public HomePageRW(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Wnioski')]")
    WebElement wnioski;

    @FindBy(xpath = "//span[contains(text(),'Nowy wniosek')]")
    WebElement nowyWiosek;


    public WebElement getHomePageWnioski() {
        WaitForElement.waitUntillElementIsVisible(wnioski);
        return wnioski;
    }

    public WebElement getHomePageNowyWniosek() {
        WaitForElement.waitUntillElementIsVisible(nowyWiosek);
        return nowyWiosek;
    }
}

