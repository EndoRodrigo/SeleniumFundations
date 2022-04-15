package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Fundations {
    public static void main(String[] args) {

        //Ubicacacion de wed driver
        System.setProperty("webdriver.chrome.driver","src/test/java/resource/chromedriver.exe");

        //Instacian del controlodar del web driver
        ChromeDriver driver = new ChromeDriver();

        //Maximizar navegador
        driver.manage().window().maximize();

        //Abrir un navegador chrome
        driver.get("https://google.com");

        //obtener el titulo de la pagina
        System.out.println(driver.getTitle());

        //Tiempo de espera no se recomiensa usar este
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        //Localizador del input de google
        WebElement searchBox = driver.findElement(By.name("q"));

        //Localizador del boton de buscar de google
        WebElement searchButton = driver.findElement(By.name("btnK"));

        //Valor enviado el input de busqueda
        searchBox.sendKeys("Selenium");

        //Accionde click sobre el boton de busqueda
        searchButton.click();

        //Localizador del input de busqueda
        searchBox = driver.findElement(By.name("q"));

        //Obtener el valor del input de busqueda
        searchBox.getAttribute("value"); // => "Selenium"

        //Cerrar navegador
        driver.quit();
    }
}
