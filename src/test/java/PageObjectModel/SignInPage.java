package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    protected WebDriver driver;

    //Localizadores
    // <input name="user_name" type="text" value="">
    private final By usernameBy = By.name("username");
    // <input name="password" type="password" value="">
    private final By passwordBy = By.name("password");
    // <input name="sign_in" type="submit" value="SignIn">
    private final By signinBy = By.xpath("//*[@id=\"login\"]/button");

    public SignInPage(WebDriver driver){
        this.driver = driver;
    }

    public HomePage loginValidUser(String userName, String password) {
        driver.findElement(usernameBy).sendKeys(userName);
        driver.findElement(passwordBy).sendKeys(password);
        driver.findElement(signinBy).click();
        return new HomePage(driver);
    }
}
