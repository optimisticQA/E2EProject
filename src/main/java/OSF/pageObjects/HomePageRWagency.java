package OSF.pageObjects;

import OSF.waits.WaitForElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageRWagency {

    public WebDriver driver;

    public HomePageRWagency(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "i.mnisv-pl")
    WebElement agencyMNISW;

    @FindBy(xpath = "//a[contains(text(),'Wniosek do konkursu w ramach Narodowego Programu R')]")
    WebElement contestNPRHk11;

    @FindBy(xpath = "//a[@href='/app/zsun1/minist/jgng/wniosek/jgng-nowy-wniosek.xhtml']")
    WebElement contestGNGk5;

    public WebElement getAgencyNameMNISW() {
        WaitForElement.waitUntillElementIsVisible(agencyMNISW);
        return agencyMNISW;
    }

    public WebElement getContestNPRHk11() {
        WaitForElement.waitUntillElementIsVisible(contestNPRHk11);
        return contestNPRHk11;
    }

    public WebElement getContestGNGk5() {
        WaitForElement.waitUntillElementIsVisible(contestGNGk5);
        return contestGNGk5;
    }


}

