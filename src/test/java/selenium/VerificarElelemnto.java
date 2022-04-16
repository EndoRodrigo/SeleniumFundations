package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificarElelemnto {
    public static void main(String[] args) {
        //Ubicacacion de wed driver
        System.setProperty("webdriver.chrome.driver","src/test/java/resource/chromedriver.exe");

        //Instacian del controlodar del web driver
        ChromeDriver driver = new ChromeDriver();

        //Maximizar navegador
        driver.manage().window().maximize();

        //Abrir navegador forma corta
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        //Obtener el valor booleano si el elemento es visible
        //boolean isButtonVisible = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a")).isDisplayed();

        //Obtener el valor booleano si el elemento esta habilitado
        //boolean value = driver.findElement(By.name("btnK")).isEnabled();

        //Obtener el valor booleano si el elemento esta selecionado
        boolean value = driver.findElement(By.cssSelector("input[type='checkbox']:first-of-type")).isSelected();

        //Imprimier resultado en consola
        System.out.println(value);
    }
}
