package by.itstep.aqa.tests.login_page_tests;

import by.itstep.aqa.tests.base.BaseUITestsClass;
import by.itstep.aqa.tests.service.LoginService;
import by.itstep.aqa.tests.service.ProfileService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import java.time.Duration;


public class LoginPageTest extends BaseUITestsClass {

    private LoginService loginService = new LoginService(driver);
    private ProfileService profileService = new ProfileService(driver);

    @BeforeEach
    public void openLoginPage(){
        driver.navigate().to("https://transphoto.org/login.php");
    }

    @Test
    public void verifyLoginFieldVisibility(){
        loginService = new LoginService(driver);

        Assertions.assertEquals(true, loginService.getLoginPage().getLoginBlock().loginField.isDisplayed());
    }

    @Test
    public void verifyPasswordFieldVisibility(){
        loginService = new LoginService(driver);

        Assertions.assertTrue(loginService.getLoginPage().getLoginBlock().passwordField.isDisplayed());
    }

    @Test
    public void verifyLoginButtonVisibility(){
        loginService = new LoginService(driver);

        Assertions.assertTrue(loginService.getLoginPage().getLoginBlock().loginButton.isDisplayed());
    }

    @Test
    public void verifyLoginInvalidParameters() {
        //given
        String initialWrongLoginString = "qwerty";
        String initialPassword = "12345";
        String expectedErrorMessage = "Неверно указаны логин и/или пароль";
        loginService = new LoginService(driver);
        loginService.getLoginPage().getLoginBlock().loginField.sendKeys(initialWrongLoginString);
        loginService.getLoginPage().getLoginBlock().passwordField.sendKeys(initialPassword);

        //when
        loginService.getLoginPage().getLoginBlock().loginButton.click();

        //then
        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        String actualErrorMessageText = loginService.getLoginPage().getLoginBlock().errorPasswordLabel.getText();
        Assertions.assertEquals(expectedErrorMessage, actualErrorMessageText);
    }

    //asdfgh
    //12345
    @Test
    public void verifyLoginValidParameters() {
        //given
        String initialLoginString = "asdfgh";
        String initialPassword = "12345";
        loginService = new LoginService(driver);
        profileService = new ProfileService(driver);
        loginService.getLoginPage().getLoginBlock().loginField.sendKeys(initialLoginString);
        loginService.getLoginPage().getLoginBlock().passwordField.sendKeys(initialPassword);

        //when
        loginService.getLoginPage().getLoginBlock().loginButton.click();

        //then
        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400000));
        Assertions.assertTrue(profileService.getProfilePage().getProfileBlock().profileName.isDisplayed());
    }

    @Test
    public void verifyCheckboxClickable(){
        loginService = new LoginService(driver);

        loginService.getLoginPage().getLoginBlock().rememberCheckbox.click();

        Assertions.assertTrue(loginService.getLoginPage().getLoginBlock().rememberCheckbox.isSelected());
    }

    @Test
    public void verifyRegisterButton(){
        String expectedURL = "https://transphoto.org/register.php";
        loginService = new LoginService(driver);

        loginService.getLoginPage().getLoginBlock().registerButton.click();

        Assertions.assertEquals(expectedURL, driver.getCurrentUrl());
    }

    @Test
    public void verifyForgotPasswordButton(){
        String expectedURL = "https://transphoto.org/forgot.php";
        loginService = new LoginService(driver);

        loginService.getLoginPage().getLoginBlock().forgetPasswordLink.click();

        Assertions.assertEquals(expectedURL, driver.getCurrentUrl());
    }

}
