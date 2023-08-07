package Steps;

import U.GWD;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pops {


    @Given("Deneme to google")
    public void denemeToGoogle() {
        GWD.getDriver().get("https://github.com/");
        WebElement e = null;
        e.click();
    }
}
