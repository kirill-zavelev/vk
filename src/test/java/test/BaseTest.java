package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.HomePage;
import page.LoginPage;

public class BaseTest {

    protected static final String LOGGED_IN_USER_NAME = "Кирилл";
    protected static final String BASE_URL = "https://instagram.com/";

    protected LoginPage loginPage;
    protected HomePage homePage;

    protected WebDriver driver;

    @BeforeMethod
    public void setUpBrowser() {
        driver = new ChromeDriver();

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        driver.get(BASE_URL);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownBrowser() {
        driver.close();
    }
}
