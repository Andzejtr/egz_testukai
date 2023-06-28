import org.junit.jupiter.api.Test;

public class NegativeRegisterTest extends BaseTest{
    @Test
    void PageTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.createNewAcc();
        loginPage.enterName("Vardas9");
        loginPage.enterPassword("Laikinas");
        loginPage.clickSubmitButton();
        loginPage.checkIfAccIsNotCreated();
    }
}
