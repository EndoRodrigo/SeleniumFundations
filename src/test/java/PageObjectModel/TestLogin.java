package PageObjectModel;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestLogin {
    protected WebDriver driver;

    @Before
    public void setUp() {
        //Ubicacacion de wed driver
        System.setProperty("webdriver.chrome.driver","src/test/java/resource/chromedriver.exe");

        //Instacian del controlodar del web driver
        driver = new ChromeDriver();

        //Maximizar navegador
        driver.manage().window().maximize();

        //Abrir navegador forma corta
        driver.get("https://the-internet.herokuapp.com/login");
    }


    @Test
    public void testLogin() {
        SignInPage signInPage = new SignInPage(driver);
        HomePage homePage = signInPage.loginValidUser("tomsmith ", "SuperSecretPassword");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(homePage.getMessageText());
        assertEquals(homePage.getMessageText(),"Your username is invalid!\n" +
                "×");
    }
}
