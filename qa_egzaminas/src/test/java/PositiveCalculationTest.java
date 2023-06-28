import org.junit.jupiter.api.Test;

public class PositiveCalculationTest extends BaseTest{

    @Test
    void PageTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterLoginName("Vardas5");
        loginPage.enterLoginPassword("Laikinas");
        loginPage.clickLoginButton();
        loginPage.checkIfUserLoggedIn();
        loginPage.enterFirstNum(5);
        loginPage.enterSecondNum(5);
        loginPage.checkResult();

    }
}

