import org.junit.jupiter.api.Test;

public class PositiveLoginTest extends BaseTest{

    @Test
    void PageTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterLoginName("Vardas5");
        loginPage.enterLoginPassword("Laikinas");
        loginPage.clickLoginButton();
        loginPage.checkIfUserLoggedIn();

    }
}
