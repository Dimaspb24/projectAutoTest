package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class UserMainPage extends BasePage {
    private By friendsField = By.xpath("//div[text()='Друзья']/ancestor::a[@data-l]");

    public UserMainPage(WebDriver driver) {
        super(driver);
    }

}
