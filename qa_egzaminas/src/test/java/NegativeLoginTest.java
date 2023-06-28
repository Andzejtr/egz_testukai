import org.junit.jupiter.api.Test;

public class NegativeLoginTest extends BaseTest{

    @Test
    void PageTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterLoginName("Vardas5");
        loginPage.enterLoginPassword("Laikinas1");
        loginPage.clickLoginButton();
        loginPage.checkIfUserLoggedIn();

    }
}
