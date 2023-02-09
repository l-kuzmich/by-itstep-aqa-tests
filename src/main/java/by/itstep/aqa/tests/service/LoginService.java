package by.itstep.aqa.tests.service;

import by.itstep.aqa.tests.page.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginService extends BaseService{

    private LoginPage loginPage = new LoginPage(driver);

    public LoginService(WebDriver driver) {
        super(driver);
    }

    public LoginPage getLoginPage(){
        return loginPage;
    }
}
