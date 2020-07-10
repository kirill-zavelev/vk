package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[@class='rhpdm']")
    private WebElement loggedInUserName;

    @FindBy(xpath = "//a[@href='/kirill_zavelev/']")
    private WebElement userProfileBtn;

    public HomePage openUserProfile() {
        waitForElementToBeClickable(userProfileBtn).click();

        return this;
    }

    public String getActualUserName() {
        return loggedInUserName.getText();
    }
}
