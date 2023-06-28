import org.junit.jupiter.api.Test;

public class PositiveRegisterTest extends BaseTest{

    @Test
    void PageTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.createNewAcc();
        loginPage.enterName("Vardas51");
        loginPage.enterPassword("Laikinas");
        loginPage.enterPasswordConfirm("Laikinas");
        loginPage.clickSubmitButton();
        loginPage.checkIfAccCreated();
    }
}
