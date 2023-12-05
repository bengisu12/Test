package StepDefinition;
import Pages.LoginPage;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class SauceSteps {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("User at home page")
    public void userAtHomePage() {
        loginPage.userAtHomePage();
    }

    @When("Click login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("Check {string} message about username")
    public void checkMessageAboutUsername(String username) {
        loginPage.checkMessage(username);
    }

    @When("write {string} for username field")
    public void writeForUsernameField(String UserName) {
        loginPage.writeUsernameforUsernamefield(UserName);
    }

    @Then("{string} message about password")
    public void messageAboutPassword(String error) {
        loginPage.checkMessage(error);

    }

    @When("write {string} for password field")
    public void writeForPasswordField(String password) {
        loginPage.writePasswordForPasswordField(password);
    }

    @Then("Check {string} message about matching")
    public void checkMessageAboutMatching(String str) {
        loginPage.matchingusernameandpassword(str);
    }

    @When("write correct {string} for username field")
    public void writeCorrectForUsernameField(String Cusername) {
        loginPage.writecorrectusername(Cusername);
    }

    @When("write false{string} for password field")
    public void writeFalseForPasswordField(String Fpassword) {
        loginPage.writefalsepassword(Fpassword);
    }

    @When("write false {string} for username field")
    public void writeFalseForUsernameField(String Fusername) {
        loginPage.writefalseusername(Fusername);
    }

    @When("write correct {string} for password field")
    public void writeCorrectForPasswordField(String Cpassword) {
        loginPage.writecorrectpassword(Cpassword);
    }
}



