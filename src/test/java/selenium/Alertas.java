package selenium;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;


public class Alertas {
    public static void main(String[] args) {
        //Ubicacacion de wed driver
        System.setProperty("webdriver.chrome.driver","src/test/java/resource/chromedriver.exe");

        //Instacian del controlodar del web driver
        ChromeDriver driver = new ChromeDriver();

        //Maximizar navegador
        driver.manage().window().maximize();

        //Abrir navegador forma corta
        driver.get("https://www.selenium.dev/documentation/webdriver/browser/alerts/");

        //Click en el testlink para mostrar la alerta
        driver.findElement(By.linkText("See a sample prompt")).click();

        //Esperar a que se muestre la alerta y guardarla en una variable
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        //Almacenar el texto de alerta en una variable
        String text = alert.getText();
        System.out.println(text);

        //Escribe tu mensaje
        alert.sendKeys("Selenium");

        //Presione el botón Aceptar
        alert.accept();

        //Presione el botón cancelar
        //alert.dismiss();

        //Cerrar navegador
        driver.quit();
    }
}
