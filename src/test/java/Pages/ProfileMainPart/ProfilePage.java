package Pages.ProfileMainPart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
    protected WebDriver driver;
    private By paymentButton;
    private By payoutButton;
    private By countryInput;
    private By stateInput;
    private By cityInput;
    private By streetInput;
    private By zipInput;
    private By phoneInput;
    private By saveButton;
    private By editButton;
    private By cvButton;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
        this.paymentButton = By.cssSelector("div.stripe_btn > div:nth-child(1) > button");
        this.payoutButton = By.cssSelector("div.stripe_btn > div:nth-child(2) > button");
        this.countryInput = By.cssSelector("div.custom_dropdown_wrapper_search > label > input");
        this.stateInput = By.cssSelector("div.stripe_btn > div:nth-child(1) > button");
        this.cityInput = By.cssSelector("div.stripe_btn > div:nth-child(1) > button");
        this.streetInput = By.cssSelector("div.stripe_btn > div:nth-child(1) > button");
        this.zipInput = By.cssSelector("div.stripe_btn > div:nth-child(1) > button");
        this.phoneInput = By.cssSelector("div.stripe_btn > div:nth-child(1) > button");
        this.saveButton = By.cssSelector("div.stripe_btn > div:nth-child(1) > button");
        this.editButton = By.cssSelector("div.stripe_btn > div:nth-child(1) > button");
        this.cvButton = By.cssSelector("div.stripe_btn > div:nth-child(1) > button");



}
