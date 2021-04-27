package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfileMainPage {
    protected WebDriver driver;
    private By playVideoButton;

    public ProfileMainPage(WebDriver driver) {
        this.driver = driver;
        this.playVideoButton = By.cssSelector("div.profile_information_user_video > div");
    }

    public WebElement findPlayVideoButton(){return  driver.findElement(playVideoButton);}

    public void playVideo() { findPlayVideoButton().click(); }
}