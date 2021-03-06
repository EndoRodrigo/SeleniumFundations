package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    protected WebDriver driver;

    // <h1>Hello userName</h1>
    private final By messageBy = By.xpath("//*[@id=\"flash-messages\"]");

    public HomePage(WebDriver driver){
        this.driver = driver;
        if (!driver.getTitle().equals("The Internet")) {
            throw new IllegalStateException("This is not Home Page of logged in user," +
                    " current page is: " + driver.getCurrentUrl());
        }
    }

    /**
     * Get message (h1 tag)
     *
     * @return String message text
     */
    public String getMessageText() {
        return driver.findElement(messageBy).getText();
    }

    public HomePage manageProfile() {
        // Page encapsulation to manage profile functionality
        return new HomePage(driver);
    }
  /* More methods offering the services represented by Home Page
  of Logged User. These methods in turn might return more Page Objects
  for example click on Compose mail button could return ComposeMail class object */
}
