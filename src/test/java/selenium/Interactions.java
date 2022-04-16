package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interactions {
    public static void main(String[] args) {

        //Ubicacacion de wed driver
        System.setProperty("webdriver.chrome.driver","src/test/java/resource/chromedriver.exe");

        //Instacian del controlodar del web driver
        ChromeDriver driver = new ChromeDriver();

        //Maximizar navegador
        driver.manage().window().maximize();

        try {
            // Abrir el naevgador
            driver.get("https://google.com");

            // Localizar el input de busquesa, ingresar un dato y hacer click
            //driver.findElement(By.name("q")).sendKeys("q" + Keys.ENTER);

            // Localizar el elemnto de input de busqueda
            WebElement searchInput = driver.findElement(By.name("q"));

            //Ingresar datos al imput
            searchInput.sendKeys("selenium");

            // Limpiar campos de texto
            searchInput.clear();

        }finally {
            driver.quit();
        }
    }
}
