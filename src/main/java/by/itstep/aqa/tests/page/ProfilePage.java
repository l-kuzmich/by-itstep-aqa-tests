package by.itstep.aqa.tests.page;

import by.itstep.aqa.tests.block.ProfileBlock;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends BasePage{

    private ProfileBlock profileBlock = new ProfileBlock(driver);

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public ProfileBlock getProfileBlock(){
        return profileBlock;
    }
}
