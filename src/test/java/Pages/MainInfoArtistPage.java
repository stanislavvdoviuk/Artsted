package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainInfoArtistPage {
    protected WebDriver driver;
    private By nameInput;
    private By surenameInput;
    private By countryInput;
    private By instagramInput;
    private By facebookInput;
    private By behenceInput;
    private By linkedinInput;
    private By aboutYouTextarea;
    private By uploadCVButton;
    private By nextButton;
    private By uploadPhotoButton;
    private By uploadVideoButton;
    private By nexttoButton;
    private By categoryDropdown;
    private By confirmButton;
    private By drawingItem;

    public MainInfoArtistPage(WebDriver driver) {
        this.driver = driver;
        this.nameInput = By.cssSelector("div.registration_main_info_container > div:nth-child(1) > div > label > input");
        this.surenameInput = By.cssSelector("div.registration_main_info_container > div:nth-child(2) > div > label > input");
        this.countryInput = By.cssSelector("div.custom_dropdown_wrapper_search > label > input");
        this.instagramInput = By.cssSelector("div.registration_main_info_container_social > div > div:nth-child(1) > label > input");
        this.facebookInput = By.cssSelector("div:nth-child(3) > label > input");
        this.behenceInput = By.cssSelector("div.registration_main_info_container_social > div > div:nth-child(2) > label > input");
        this.linkedinInput = By.cssSelector(" div:nth-child(4) > label > input");
        this.aboutYouTextarea = By.cssSelector("textarea");
        this.uploadCVButton = By.cssSelector(" div.upload_cv_wrapper > button");
        this.nextButton = By.cssSelector(" div.wrapper_navigation_btn > button");
        this.nexttoButton = By.cssSelector("div.wrapper_navigation_btn > button:nth-child(2)");
        this.categoryDropdown = By.cssSelector("div.custom_dropdown_wrapper_search > label");
        this.confirmButton = By.cssSelector("button:nth-child(2)");
        this.drawingItem = By.cssSelector("div.custom_dropdown_option.overflow_scrollbar.active_custom_dropdown > span:nth-child(2)");
    }
    public WebElement findNameInput() { return driver.findElement(nameInput); }
    public WebElement findSurenameInput() { return driver.findElement(surenameInput); }
    public WebElement findCountryInput() { return driver.findElement(countryInput); }
    public WebElement findInstagramInput() { return driver.findElement(instagramInput); }
    public WebElement findFacebookInput() { return driver.findElement(facebookInput); }
    public WebElement findBehenceInput() { return driver.findElement(behenceInput); }
    public WebElement findAboutYouTextarea() { return driver.findElement(aboutYouTextarea); }
    public WebElement findLinkedinInput() { return driver.findElement(linkedinInput); }
    public WebElement finduploadCVButton() { return driver.findElement(uploadCVButton); }
    public WebElement findNextButton() { return driver.findElement(nextButton); }
    public WebElement findNexttoButton() { return driver.findElement(nexttoButton); }
    public WebElement findCategoryDropdown() { return driver.findElement(categoryDropdown); }
    public WebElement findDrawingItem() { return driver.findElement(drawingItem); }
    public WebElement findConfirmButton() { return driver.findElement(confirmButton); }


    public void fillinMainInfo(String name,String surename,String country, String inst, String fb, String be, String ln, String aboutyou){
        findNameInput().sendKeys(name);
        findSurenameInput().sendKeys(surename);
        findCountryInput().sendKeys(country);
        findInstagramInput().sendKeys(inst);
        findFacebookInput().sendKeys(fb);
        findBehenceInput().sendKeys(be);
        findLinkedinInput().sendKeys(ln);
        findAboutYouTextarea().sendKeys(aboutyou);
        findNextButton().click();
        findNexttoButton().click();
        findCategoryDropdown().click();
        findDrawingItem().click();
        findConfirmButton().click();
    }
}