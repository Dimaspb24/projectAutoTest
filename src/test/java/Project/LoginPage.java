package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By loginField = By.xpath(".//input[@id='field_email']");
    private By passwordField = By.xpath(".//input[@id='field_password']");
    private By enterButton = By.xpath(".//form//input[@type='submit']");
    private By errorText = By.xpath(".//*[@class ='form_i form_i__error']/*[@class ='input-e login_error']");


    public UserMainPage clickEnterButton(){
        driver.findElement(enterButton).click();
        return new UserMainPage(driver);
    }

    public LoginPage typeUserLogin(String userLogin){
        driver.findElement(loginField).clear();
        driver.findElement(loginField).sendKeys(userLogin);
        return this;
    }

    public LoginPage typeUserPassword(String userPassword){
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(userPassword);
        return this;
    }

    public UserMainPage inputToTheUserMainPage(String userLogin,String userPassword){
        this.typeUserLogin(userLogin);
        this.typeUserPassword(userPassword);
        this.clickEnterButton();
        return new UserMainPage(driver);
    }

    public LoginPage incorrectInputToTheUserMainPage(String userLogin, String userPassword){
        this.typeUserLogin(userLogin);
        this.typeUserPassword(userPassword);
        this.clickEnterButton();
        return new LoginPage(driver);
    }

    // есть возможность реализовать для 3х случаев (выводит 3 разных строки)
    /*
    Введите логин
    Введите пароль
    Неправильно указан логин и/или пароль
     */
    public String printErrorText(){
        return driver.findElement(errorText).getText();
    }
}