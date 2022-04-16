package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Teclado {
    public static void main(String[] args) {

        //Ubicacacion de wed driver
        System.setProperty("webdriver.chrome.driver","src/test/java/resource/chromedriver.exe");

        //Instacian del controlodar del web driver
        ChromeDriver driver = new ChromeDriver();

        //Maximizar navegador
        driver.manage().window().maximize();

        try {
            // Navegar a la url
            driver.get("https://google.com");

            // Crea un objeto de la clase Action
            Actions action = new Actions(driver);

            // Encuentra el elemento del cuadro de búsqueda de Google
            WebElement search = driver.findElement(By.name("q"));

            // Enviar valor por clase de acción al cuadro de búsqueda
            action.sendKeys(search, "Selenium").perform();

            // Realizar acción de teclado por clase de acción
            action.sendKeys(Keys.ENTER).perform();

        } finally {
            driver.quit();
        }
    }
}
