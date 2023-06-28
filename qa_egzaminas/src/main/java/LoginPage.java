import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends  AbstractObjectPage{

    @FindBy(xpath = "/html/body/div/form/div/h4/a")
    private WebElement clickCreateNewAccButton;

    @FindBy(id = "username")
    private WebElement nameInputField;

    @FindBy(id = "password")
    private WebElement passwordInputField;

    @FindBy(id = "passwordConfirm")
    private WebElement passwordConfirmInputField;

    @FindBy(xpath = "//*[@id=\"userForm\"]/button")
    private WebElement submitButton;

    @FindBy(xpath = "/html/body/nav/div/div/a")
    private WebElement skaiciuotuvasIsVisible;

    @FindBy(id = "passwordConfirm.errors")
    private WebElement alertMessage;

    @FindBy(xpath = "/html/body/div/form/div/input[1]")
    private WebElement loginNameField;

    @FindBy(xpath = "/html/body/div/form/div/input[2]")
    private WebElement loginPasswordField;

    @FindBy(xpath = "/html/body/div/form/div/button")
    private WebElement loginButton;

    @FindBy(id = "sk1")
    private WebElement firstNum;

    @FindBy(id = "sk2")
    private WebElement secondNum;

    @FindBy(xpath = "//*[@id=\"number\"]/input[3]")
    private WebElement calculateButton;

    @FindBy(xpath = "/html/body/h4")
    private WebElement result;

    @FindBy(id = "sk2.errors")
    private WebElement error;

    @FindBy(id = "sk2")
    private WebElement emptyField;

    public LoginPage(WebDriver driver) { super(driver); }

    public void createNewAcc() {
        clickCreateNewAccButton.click();
    }

    public void enterName(String name) {
        nameInputField.sendKeys(name);
    }

    public void enterPassword(String password) {
        passwordInputField.sendKeys(password);
    }

    public void enterPasswordConfirm(String password) {
        passwordConfirmInputField.sendKeys(password);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void checkIfAccCreated() {
        if (skaiciuotuvasIsVisible.isDisplayed()) {
            System.out.println("User acc is created");
        } else {
            System.out.println("User acc is not created");
        }

    }

    public void checkIfAccIsNotCreated() {
        if (alertMessage.isDisplayed()) {
            System.out.println("User is not created as expected, test PASSED");
        } else {
            System.out.println("Test failed, Alert message was expected!");
        }
    }

    public void enterLoginName(String name) {loginNameField.sendKeys(name);}

    public void enterLoginPassword(String password) {loginPasswordField.sendKeys(password);}

    public void clickLoginButton() {loginButton.click();}

    public void checkIfUserLoggedIn() {
        if (skaiciuotuvasIsVisible.isDisplayed()) {
            System.out.println("User logged in");
        } else {
            System.out.println("User NOT logged in");
        }
    }

    public void enterFirstNum(int num) {
       firstNum.clear();
       firstNum.sendKeys(Integer.toString(num));
    }

    public void enterSecondNum(int num) {
        secondNum.clear();
        secondNum.sendKeys(Integer.toString(num));
    }

    public void clickCalculateButton() {calculateButton.click();}

    public void checkResult() {
        if (result.equals(" 5 +  5 = 10 ")) {
            System.out.print("Calculacions are correct!");
        } else {
            System.out.println("Calculations are INCORRECT!");
        }
    }

    public void checkIfErrorIsPresent() {


        if(error.isDisplayed()) {
            System.out.println("Everything works as expected!");
        } else {
            System.out.println("Calculations works NOT AS EXPECTED");
        }
    }

    public void setEmptyField() {
        emptyField.clear();

        q
    }

}

