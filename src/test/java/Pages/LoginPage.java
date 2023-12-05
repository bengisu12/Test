package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper=new ElementHelper(driver);}

    By loginButton = By.id("login-button");
    By errormessage = By.cssSelector("h3[data-test='error']");
    By usernamebox = By.id("user-name");
    By passwordbox = By.id("password");
    By matcherror = By.xpath("//h3[@data-test='error']");


    public void userAtHomePage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void clickLogin() {
        elementHelper.click(loginButton);

    }

    public void checkMessage(String username) {
        elementHelper.checkVisible(errormessage,"");
    }

    public void writeUsernameforUsernamefield(String userName) {
        elementHelper.click(usernamebox);
        elementHelper.sendKey(usernamebox,"abcdef");

    }

    public void writePasswordForPasswordField(String password) {
        elementHelper.click(passwordbox);
        elementHelper.sendKey(passwordbox,"123456");
    }

    public void writecorrectusername(String cusername) {
        elementHelper.click(usernamebox);
        elementHelper.sendKey(usernamebox,"standard_user");
    }

    public void writefalsepassword(String fpassword) {
        elementHelper.click(passwordbox);
        elementHelper.sendKey(passwordbox,"123456");
        elementHelper.click(loginButton);
    }

    public void matchingusernameandpassword(String str) {
        elementHelper.checkVisible(matcherror,"Epic sadface: Username and password do not match any user in this service");

    }

    public void writefalseusername(String fusername) {
        elementHelper.click(usernamebox);
        elementHelper.sendKey(usernamebox,"benben");
    }

    public void writecorrectpassword(String cpassword) {
        elementHelper.click(passwordbox);
        elementHelper.sendKey(passwordbox,"secret_sauce");

    }
}
