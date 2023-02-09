package by.itstep.aqa.tests.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileBlock extends BaseBlock{

    public ProfileBlock(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[@class='mm-pad-right']//a[contains(@href,'author')]")
    public WebElement profileName;
}
