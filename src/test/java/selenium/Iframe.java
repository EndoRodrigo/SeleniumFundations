package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
    public static void main(String[] args) {
        //Ubicacacion de wed driver
        System.setProperty("webdriver.chrome.driver","src/test/java/resource/chromedriver.exe");

        //Instacian del controlodar del web driver
        ChromeDriver driver = new ChromeDriver();

        //Maximizar navegador
        driver.manage().window().maximize();

        //Abrir navegador forma corta
        driver.get("https://developer.mozilla.org/es/docs/Web/HTML/Element/iframe");

        //Almacenar localizacion del elemento web iframe
        WebElement iframe = driver.findElement(By.xpath("//*[@id=\"sect2\"]/iframe"));

        //Cambia de venta al iframe
        driver.switchTo().frame(iframe);

        //Ingresar un direccion
        driver.findElement(By.xpath("//*[@id=\"map\"]/div[2]/div[1]/div/a[1]")).click();
    }
}
