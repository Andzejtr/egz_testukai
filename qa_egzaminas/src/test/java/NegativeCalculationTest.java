import org.junit.jupiter.api.Test;

public class NegativeCalculationTest extends BaseTest {

    @Test
    void PageTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterLoginName("Vardas5");
        loginPage.enterLoginPassword("Laikinas");
        loginPage.clickLoginButton();
        loginPage.checkIfUserLoggedIn();
        loginPage.enterFirstNum(5);
        loginPage.setEmptyField();
        loginPage.clickCalculateButton();
        loginPage.checkIfErrorIsPresent();
    }
}