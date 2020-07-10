package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class AbstractPage {

    private static final int TIME_OUT = 10;

    protected final WebDriver driver;
    protected final WebDriverWait wait;

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, TIME_OUT);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(TIME_OUT, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    protected WebElement waitForElementToBeClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected WebElement waitForElementToBeInputed(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));

    }

    protected void sendKeys(WebElement inputField, String text) {
        if (inputField.isDisplayed()) {
            inputField.clear();
            inputField.sendKeys(text);
        }
    }
}
