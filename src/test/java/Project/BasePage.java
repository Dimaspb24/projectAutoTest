package Project;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {
    WebDriver driver;
    String baseUrl;

    BasePage(WebDriver driver) {
        this.driver = driver;
        baseUrl = "https://ok.ru";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

}
