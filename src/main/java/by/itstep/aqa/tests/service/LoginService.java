package by.itstep.aqa.tests.service;

import by.itstep.aqa.tests.page.LoginPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.WebDriver;

public class LoginService extends BaseService{

    private LoginPage loginPage = new LoginPage(driver);

    public LoginService(WebDriver driver) {
        super(driver);
    }

    public LoginPage getLoginPage(){
        Logger logger = LoggerFactory.getLogger(LoginService.class);
        logger.info("This is an INFO log message!");
        return loginPage;
    }
}
