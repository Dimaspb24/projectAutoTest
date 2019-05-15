package Project;

import org.openqa.selenium.WebDriver;

public class PageGroups extends BasePage implements Page {
    PageGroups(WebDriver driver) {
        super(driver);
    }

    public String writePage() {
        return "Страница с группами";
    }
}
