package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {
    protected WebDriver driver;
    private By nameInput;
    private By surenameInput;
    private By countryInput;
    private By postcodeInput;
    private By cityInput;
    private By addressInput;
    private By phoneInput;
    private By checkoutButton;

    public Cart(WebDriver driver) {
        this.driver = driver;
        this.nameInput = By.cssSelector("#user_cart_delivery_data > div > div:nth-child(1) > label > input");
        this.surenameInput = By.cssSelector("div:nth-child(2) > label > input");
        this.countryInput = By.cssSelector("div:nth-child(3) > div > div > div.custom_dropdown_wrapper_search > label > input");
        this.postcodeInput = By.cssSelector("div:nth-child(4) > label > input");
        this.cityInput = By.cssSelector("div:nth-child(5) > label > input");
        this.addressInput = By.cssSelector("div:nth-child(6) > label > input");
        this.phoneInput = By.cssSelector("div:nth-child(7) > label > input");
        this.checkoutButton = By.cssSelector("div.user_cart_price_checkout > button");
    }
    public WebElement findNameInput() { return driver.findElement(nameInput); }
    public WebElement findSurenameInput() { return driver.findElement(surenameInput); }
    public WebElement findCountryInput() { return driver.findElement(countryInput); }
    public WebElement findPostcodeInput() { return driver.findElement(postcodeInput); }
    public WebElement findCityInput() { return driver.findElement(cityInput); }
    public WebElement findAddressInput() { return driver.findElement(addressInput); }
    public WebElement findCheckoutButton() { return driver.findElement(checkoutButton); }

    public void clickCheckout(){findCheckoutButton().click();}
}
