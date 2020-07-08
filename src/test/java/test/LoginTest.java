package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        String actualUserName =
                loginPage
                    .setLogin()
                    .setPassword()
                    .clickLogin()
                    .getActualUserName();

        Assert.assertEquals(actualUserName, LOGGED_IN_USER_NAME, "Username is not valid");
    }
}
