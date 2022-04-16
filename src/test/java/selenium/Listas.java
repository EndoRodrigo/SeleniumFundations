package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Listas {
    public static void main(String[] args) {
        //Ubicacacion de wed driver
        System.setProperty("webdriver.chrome.driver","src/test/java/resource/chromedriver.exe");

        //Instacian del controlodar del web driver
        WebDriver driver = new ChromeDriver();
        try {
            //Abrir el navegador
            driver.get("https://testsheepnz.github.io/BasicCalculator.html");

            // Localizar el elemnto de la lista
            WebElement element = driver.findElement(By.id("selectOperationDropdown"));
            element.sendKeys("Concatenate");

            /* Obtener todos los elementos disponibles con el nombre de etiqueta
            List<WebElement> elements = element.findElements(By.tagName("option"));
            for (WebElement e : elements) {
                System.out.println(e.getText());
            }*/
        } finally {
            driver.quit();
        }
    }
}
