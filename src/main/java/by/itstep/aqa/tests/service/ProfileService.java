package by.itstep.aqa.tests.service;

import by.itstep.aqa.tests.page.ProfilePage;
import org.openqa.selenium.WebDriver;

public class ProfileService extends BaseService{

    private ProfilePage profilePage = new ProfilePage(driver);


    public ProfileService(WebDriver driver) {
        super(driver);
    }

    public ProfilePage getProfilePage(){
        return profilePage;
    }
}
