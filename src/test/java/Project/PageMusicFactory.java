package Project;

import org.openqa.selenium.WebDriver;

public class PageMusicFactory extends BasePage implements PageFactory {
    PageMusicFactory(WebDriver driver) {
        super(driver);
    }

    public Page createPage() {
        return new PageMusic(driver);
    }
}
