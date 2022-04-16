package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class selectores {
    public static void main(String[] args) {
        //Ubicacacion de wed driver
        System.setProperty("webdriver.chrome.driver","src/test/java/resource/chromedriver.exe");

        //Instacian del controlodar del web driver
        ChromeDriver driver = new ChromeDriver();

        //Maximizar navegador
        driver.manage().window().maximize();

        //Abrir navegador forma corta
        driver.get("https://the-internet.herokuapp.com/dropdown");

        //Localiza el elemto de la lista
        WebElement selectElement = driver.findElement(By.id("dropdown"));

        //controlador para selecionar una opcion
        Select selectObject = new Select(selectElement);

        // Seleccione una <opción> basada en el índice interno del elemento <select>
        //selectObject.selectByIndex(1);

        // Seleccione una <opción> basada en su atributo de valor
        //selectObject.selectByValue("2");

        // Selecciona una <opción> basada en su texto
        selectObject.selectByVisibleText("Option 2");

        // Devolver una Lista<WebElement> de opciones que han sido seleccionadas
        //List<WebElement> allSelectedOptions = selectObject.getAllSelectedOptions();


        // Devuelve un WebElement que hace referencia a la primera opción de selección encontrada al recorrer el DOM
        WebElement firstSelectedOption = selectObject.getFirstSelectedOption();
        System.out.println(firstSelectedOption.getText());

        /*for (WebElement e : firstSelectedOption) {
            System.out.println(e.getText());
        }*/

    }
}
