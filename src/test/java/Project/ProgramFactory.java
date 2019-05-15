package Project;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProgramFactory {

    private WebDriver driver;

    public ProgramFactory(WebDriver driver) {
        this.driver = driver;
    }

     public PageFactory createPageByFound(String entry){
        if (entry.equalsIgnoreCase("Люди")){
            return new PagePeopleFactory(driver);
        } else if (entry.equalsIgnoreCase("Группы")){
            return new PageGroupsFactory(driver);
        } else if (entry.equalsIgnoreCase("Музыка")){
            return new PageMusicFactory(driver);
        } else {
            //throw new RuntimeException(entry + " is unknown entry");
            Assert.fail(entry + " is unknown entry");
        }
        return null;
    }
}
