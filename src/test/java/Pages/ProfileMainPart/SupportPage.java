package Pages.ProfileMainPart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SupportPage {
    protected WebDriver driver;
    private By needHelpDropdown;
    private By descriptionTextarea;
    private By applyButton;
    private By salesItem;

    public SupportPage(WebDriver driver) {
        this.driver = driver;
        this.needHelpDropdown = By.cssSelector("div.wrapper_question > div > div > div > div:nth-child(1) > div");
        this.descriptionTextarea = By.cssSelector("textarea");
        this.applyButton = By.cssSelector("div.wrapper_support_form > button");
        this.salesItem = By.cssSelector("div.custom_dropdown_option.overflow_scrollbar.active_custom_dropdown > span:nth-child(3)");
    }
    //public WebElement findNeedHelpDropdown() { return driver.findElement(lastUploadsButton); }
    //public WebElement findMostViewedButton() { return driver.findElement(mostViewedButton); }
    //public WebElement findSoldButton() { return driver.findElement(soldButton); }
    //public WebElement findUploadWorkButton() { return driver.findElement(uploadWorkButton); }
}
