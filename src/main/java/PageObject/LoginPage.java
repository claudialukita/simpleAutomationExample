package PageObject;

import Config.Elements;
import Utility.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends BasePage {
    By inputUsername                    = By.xpath(Elements.inputUsername);
    By inputPassword                    = By.xpath(Elements.inputPassword);
    By buttonLogin                      = By.xpath(Elements.buttonLogin);
    By buttonProfile                    = By.xpath(Elements.buttonProfile);
    By labelSaveYourLoginInfo           = By.xpath(Elements.labelSaveYourLoginInfo);
    By buttonLogout                     = By.xpath(Elements.buttonLogout);
    By labelLoggingOut                  = By.xpath(Elements.labelLoggingOut);

    public void goToPage(){
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/".replace("\"", ""));
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonLogin));
    }

    public void initiateTheBrowser() throws Exception{
        BasePage basePage = new BasePage();
        driver = basePage.openBrowser();
    }

    public void inputUsername() {
        driver.findElement(inputUsername).sendKeys("dummy280997");
    }

    public void inputPassword() {
        driver.findElement(inputPassword).sendKeys("dumdum2828");
    }

    public void clickLogin() {
        driver.findElement(buttonLogin).click();
    }

    public void SaveYourLoginInfoLabelDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(labelSaveYourLoginInfo));
        driver.findElement(labelSaveYourLoginInfo).isDisplayed();
    }

    public void inputUsername(String uname) {
        driver.findElement(inputUsername).sendKeys(uname);
    }

    public void inputPassword(String pwd) {
        driver.findElement(inputPassword).sendKeys(pwd);
    }

    public void clickProfile() {
        driver.findElement(buttonProfile).click();
    }

    public void clickLogOut() {
        driver.findElement(buttonLogout).click();
    }

    public void LoggingOutLabelDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(labelLoggingOut));
        driver.findElement(labelLoggingOut).isDisplayed();
    }

    public void backToLoginPage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonLogin));
        driver.findElement(buttonLogin).isDisplayed();
    }
}
