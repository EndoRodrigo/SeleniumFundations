package EstrategiaDiseño;

import org.junit.Before;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooTest {
    private EditIssue editIssue;

    @Before
    public void prepareComponents() {
        WebDriver driver = new ChromeDriver();

        ProjectPage project = new ProjectPage(driver, "selenium");
        SecuredPage securedPage = new SecuredPage(driver, project, "example", "top secret");
        editIssue = new EditIssue(driver);
    }

    @Test
    public void demonstrateNestedLoadableComponents() {
        editIssue.get();

        editIssue.setSummary("Summary");
        editIssue.enterDescription("This is an example");
    }
}
