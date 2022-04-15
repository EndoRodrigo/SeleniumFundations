package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navegacion {
    public static void main(String[] args) {
        //Ubicacacion de wed driver
        System.setProperty("webdriver.chrome.driver","src/test/java/resource/chromedriver.exe");

        //Instacian del controlodar del web driver
        ChromeDriver driver = new ChromeDriver();

        //Maximizar navegador
        driver.manage().window().maximize();

        //Abrir navegador forma corta
        //driver.get("https://selenium.dev");

        //Abrir navegador forma larga
        driver.navigate().to("https://selenium.dev");

        //Cerrar navegador
        driver.quit();
    }
}
