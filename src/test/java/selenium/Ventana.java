package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class Ventana {
    public static void main(String[] args) {
        //Ubicacacion de wed driver
        System.setProperty("webdriver.chrome.driver","src/test/java/resource/chromedriver.exe");

        //Instacian del controlodar del web driver
        ChromeDriver driver = new ChromeDriver();

        //Maximizar navegador
        driver.manage().window().maximize();

        //Abrir navegador forma corta
        driver.get("https://www.google.com/?hl=es");

        //Almacenar el ID de la ventana original
        String paginaOriginal = driver.getWindowHandle();
        System.out.println(paginaOriginal);

        //Comprueba que no tengamos otras ventanas abiertas ya
        assert driver.getWindowHandles().size() == 1;

        //Haga clic en el enlace que se abre en una nueva ventana
        //driver.findElement(By.linkText("Test Plan And Build Creation In TestLink")).click();

        // Abre una nueva pestaña y cambia a una nueva pestaña
        driver.switchTo().newWindow(WindowType.TAB);

        //Abrir navegador forma corta
        driver.get("https://translate.google.com/?hl=es");

        driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[1]/span/span/div/textarea")).sendKeys("siblings");

        /*Wait for the new window or tab
        //Esperar a que se muestre la alerta y guardarla en una variable
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        wait.until(numberOfWindowsToBe(2));

        //Proceso no asimulado por completo buscar mas informacion
        for (String windowHandle : driver.getWindowHandles()) {
            if(!paginaOriginal.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }*/








    }
}
