package EstrategiaDiseño;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v93.audits.model.IssueId;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import static org.junit.Assert.assertTrue;

public class EditIssue extends LoadableComponent<EditIssue> {

    //Instancia del controlador weddriver
    private final WebDriver driver;

    // Por defecto, PageFactory localizará los elementos con el mismo nombre o id.
    // como el campo. Dado que el elemento de resumen tiene un atributo de nombre de "resumen"
    // no necesitamos anotaciones adicionales.
    private WebElement summary;

    // Lo mismo con el elemento de envío, que tiene el ID "enviar"
    private WebElement submit;

    // Pero preferiríamos un nombre diferente en nuestro código que "comentario", así que usamos el
    // Anotación FindBy para decirle a PageFactory cómo ubicar el elemento.
    @FindBy(name = "comment") private WebElement description;

    public EditIssue(WebDriver driver) {
        this.driver = driver;

        // Esta llamada establece los campos de WebElement.
        PageFactory.initElements(driver, this);
    }

    @Override
    protected void load() {
        driver.get("https://github.com/SeleniumHQ/selenium/issues/new");
    }

    @Override
    protected void isLoaded() throws Error {
        String url = driver.getCurrentUrl();
        assertTrue("Not on the issue entry page: " + url, url.endsWith("/new"));
    }

    public void setSummary(String issueSummary) {
        clearAndType(summary, issueSummary);
    }

    public void enterDescription(String issueDescription) {
        clearAndType(description, issueDescription);
    }

    public void submit() {
        submit.click();
    }

    private void clearAndType(WebElement field, String text) {
        field.clear();
        field.sendKeys(text);
    }
}
