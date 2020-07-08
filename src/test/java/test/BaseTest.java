package test;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.HomePage;
import page.LoginPage;

public class BaseTest {

    public static final String LOGGED_IN_USER_NAME = "Кирилл";
    public static final String BASE_URL = "https://vk.com/";

    protected LoginPage loginPage;
    protected HomePage homePage;

    private WebDriver driver;

    @BeforeMethod
    public void setUpBrowser() {
        driver = DriverSingleton.getDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        driver = new ChromeDriver();
        driver.get(BASE_URL);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownBrowser() {
        DriverSingleton.closeDriver();
    }
}
