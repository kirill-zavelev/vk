package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/div[@class='top_profile_name' and text()='Кирилл']")
    private WebElement loggedInUserName;

    public String getActualUserName() {
        return loggedInUserName.getText();
    }
}
