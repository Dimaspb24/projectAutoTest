package Project;

import org.openqa.selenium.WebDriver;

public class PageGroupsFactory extends BasePage implements PageFactory {
    PageGroupsFactory(WebDriver driver) {
        super(driver);
    }

    public Page createPage() {
        return new PageGroups(driver);
    }
}
