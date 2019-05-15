package Project;

import org.openqa.selenium.WebDriver;

public class PagePeopleFactory extends BasePage implements PageFactory {
    PagePeopleFactory(WebDriver driver) {
        super(driver);
    }

    public Page createPage() {
        return new PagePeople(driver);
    }
}
