package in.co.quickvikalp.testCases;

import com.epam.healenium.SelfHealingDriver;
import in.co.quickvikalp.actions.LoginActions;
import in.co.quickvikalp.utils.AppConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase {

    LoginActions loginActions = new LoginActions();
    Logger logger = LoggerFactory.getLogger(TestCase.class);
    private WebDriver delegate;
    private SelfHealingDriver driver;

    @BeforeTest
    public void initiateBrowser() {
        logger.info("Chrome browser initiated");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        delegate = new ChromeDriver(options);
        driver = SelfHealingDriver.create(delegate);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void tutorial() {
        driver.manage().window().maximize();
        logger.info("Chrome browser maximized");
        driver.get(AppConstants.URI);
        logger.info("URI opened {}", AppConstants.URI);
        loginActions.enterUsername(driver, AppConstants.USERNAME);
        loginActions.enterPassword(driver, AppConstants.PASSWORD);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loginActions.clickLoginButton(driver);
        logger.info("Login initiated, now waiting for 5 seconds");
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
        logger.info("Chrome browser closed");
    }

}
