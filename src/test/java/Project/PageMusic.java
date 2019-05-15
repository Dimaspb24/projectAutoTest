package Project;

import org.openqa.selenium.WebDriver;

public class PageMusic extends BasePage implements Page {
    PageMusic(WebDriver driver) {
        super(driver);
    }

    public String writePage() {
        return "Страница с музыкой";
    }
}
