package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.net.MalformedURLException;
import java.util.HashMap;

public class BasePage {
    static String chromeDriverPath = System.getProperty("user.dir")+ File.separator+"src"+File.separator+"driver"+File.separator+"chromedriver.exe";
    public static WebDriver driver;
    public WebDriver openBrowser() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("prefs", chromePrefs);
//        if (testData.getIsHeadless().equalsIgnoreCase("yes")) {
//            chromeOptions.addArguments("--headless");
//        }
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--window-size=1366, 768");//1920,1080
        driver = new ChromeDriver(chromeOptions);
        System.out.println(driver);
        return driver;
    }


    }
