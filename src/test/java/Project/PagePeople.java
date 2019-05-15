package Project;

import org.openqa.selenium.WebDriver;

public class PagePeople extends BasePage implements Page {
    PagePeople(WebDriver driver) {
        super(driver);
    }

    public String writePage() {
       return "Страница с людьми";
    }
}
