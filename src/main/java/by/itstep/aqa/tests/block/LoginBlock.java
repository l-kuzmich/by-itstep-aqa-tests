package by.itstep.aqa.tests.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginBlock extends BaseBlock {

    public LoginBlock(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='username']")
    public WebElement loginField;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordField;

    @FindBy(xpath = "//*[@id='err_password']")
    public WebElement errorPasswordLabel;

    @FindBy(id = "remember")
    public WebElement rememberCheckbox;

    @FindBy(xpath = "//*[@id='loginbtn']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='mf-button']")
    public WebElement registerButton;

    @FindBy(xpath = "//*[@class='mf-label-narrow']")
    public WebElement forgetPasswordLink;
}
