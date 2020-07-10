package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static final String USERNAME = "+375291791115";
    public static final String PASSWORD = "31199620Kirill";

    @FindBy(xpath = "//input[@name='username']")
    private WebElement loginField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//*[text()='Log In']")
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
