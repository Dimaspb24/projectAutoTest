package tests;

import Project.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FactoryTest{

    private String baseUrl;
    private WebDriver driver;
    private static final By field = By.xpath(".//span[@class='main-menu_a __active']");//не использовать здесь
    private String string;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://ok.ru/";
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void testCase() throws Exception {
        driver.get(baseUrl + "/dk?st.cmd=anonymMain&st.layer.cmd=PopLayerClose");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputToTheUserMainPage("technopolisbot", "technopolis16");

        driver.findElement(By.id("field_query")).sendKeys("Макс Корж");
        driver.findElement(By.id("lsBtn")).click();


        string = driver.findElement(field).getText();
        System.out.println(string);

        ProgramFactory pf = new ProgramFactory(driver);
        PageFactory pageFactory = pf.createPageByFound(string);

        Page page = pageFactory.createPage();
        System.out.println(page.writePage());

        Assert.assertEquals("Страница с музыкой", page.writePage());
    }
}
