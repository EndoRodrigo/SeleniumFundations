package selenium;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Ckookis {
    public static void main(String[] args) {
        //Ubicacacion de wed driver
        System.setProperty("webdriver.chrome.driver","src/test/java/resource/chromedriver.exe");

        //Instacian del controlodar del web driver
        ChromeDriver driver = new ChromeDriver();

        //Maximizar navegador
        driver.manage().window().maximize();

        //Abrir navegador forma corta
        driver.get("http://www.example.com");

        // Agrega la cookie en el contexto del navegador actual
        driver.manage().addCookie(new Cookie("key","value"));

        // Consultar dotas las cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies);

    }
}
