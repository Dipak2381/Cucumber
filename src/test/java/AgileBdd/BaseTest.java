package AgileBdd;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static AgileBdd.BasePage.driver;

/**
 * Created by DIPAK on 4/24/2017.
 */
public class BaseTest extends BasePage
{
    @BeforeMethod
    public void openBrowser()
    {
        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.nopcommerce.com/");
    }

    @AfterMethod
    public void closeBrowser()
    {
        driver.close();
    }

}
