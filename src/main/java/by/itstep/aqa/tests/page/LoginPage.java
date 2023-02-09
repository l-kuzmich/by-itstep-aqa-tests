package by.itstep.aqa.tests.page;

import by.itstep.aqa.tests.block.LoginBlock;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    private LoginBlock loginBlock = new LoginBlock(driver);

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginBlock getLoginBlock(){
        return loginBlock;
    }
}
