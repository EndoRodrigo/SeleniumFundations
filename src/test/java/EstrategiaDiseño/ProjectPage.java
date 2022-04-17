package EstrategiaDiseño;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class ProjectPage extends LoadableComponent<ProjectPage> {
    private final WebDriver driver;
    private final String projectName;

    public ProjectPage(WebDriver driver, String projectName) {
        this.driver = driver;
        this.projectName = projectName;
    }

    @Override
    protected void load() {
        driver.get("http://" + projectName + ".googlecode.com/");
    }

    @Override
    protected void isLoaded() throws Error {
        String url = driver.getCurrentUrl();

        assertTrue(url.contains(projectName));
    }
}
