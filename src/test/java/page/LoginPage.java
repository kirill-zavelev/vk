package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static final String USERNAME = "+375291791115";
    public static final String PASSWORD = "31199620Kirill";

    @FindBy(xpath = "//input[@name='email']")
    private WebElement loginField;

    @FindBy(xpath = "//input[@name='pass']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='index_login_button' and text()='Войти']")
    private WebElement loginBtn;

    public LoginPage setLogin() {
        sendKeys(loginField, USERNAME);

        return this;
    }

    public LoginPage setPassword() {
        sendKeys(passwordField, PASSWORD);

        return this;
    }

    public HomePage clickLogin() {
        waitForElementToBeClickable(loginBtn)
                .click();

        return new HomePage(driver);
    }
}
