package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopPart {
    protected WebDriver driver;
    private By artstedLogo;
    private By discoverButton;
    private By artworksButton;
    private By artistsButton;
    private By premiumButton;
    private By signInButton;
    private By registerButton;

    private By emailInput;
    private By passwordInput;
    private By loginbutton;

    public TopPart(WebDriver driver)  {
        this.driver=driver;
        this.buttonArtsted = By.cssSelector("#header > div.header_navigation > a > img");
        this.buttonDiscover = By.cssSelector("#header > div.header_navigation > ul > li.header_navigation_hover_button > button");
        this.buttonArtworks = By.cssSelector("#header > div.header_navigation > ul > li:nth-child(2) > a");
        this.buttonArtists = By.cssSelector("#header > div.header_navigation > ul > li:nth-child(3) > a");
        this.buttonPremium = By.cssSelector("#header > div.header_navigation > ul > li:nth-child(4) > a");
        this.buttonSignIn = By.cssSelector("div.header_sign_in_container > span:nth-child(1)");
        this.buttonRegister = By.cssSelector("#header > div.header_login_section > div.header_sign_in > div.header_sign_in_container > span:nth-child(3)");
        this.loginInputEmail = By.cssSelector("#root > div > div.auth_popup_wrapper > div > div > form > div.wrapper_inputs_auth > div.input_component.true > label > input");
        this.loginInputPassword = By.cssSelector("#root > div > div.auth_popup_wrapper > div > div > form > div.wrapper_inputs_auth > div.input_component.input_component_unset_margin > label > input");
        this.loginInputRepeadPassword = By.cssSelector("#root > div > div.auth_popup_wrapper > div > div > form > div.wrapper_inputs_auth > div:nth-child(3) > label > input");
        this.buttonSign = By.cssSelector("#root > div > div.auth_popup_wrapper > div > div > form > div.wrapper_btn > button");
        this.checkButton1 = By.cssSelector("#root > div > div.auth_popup_wrapper > div > div > form > div.agree_terms > div:nth-child(1) > label > span");
        this.buttonRegisterAcc = By.cssSelector("#root > div > div.auth_popup_wrapper > div > div > form > div.wrapper_btn > button");
        this.buttonIAmArtist = By.cssSelector("#root > div > div.auth_popup_wrapper > div > div > form > div.wrapper_radio_btn > div:nth-child(1) > div > label > p");
        this.buttonApply = By.cssSelector("#root > div > div.auth_popup_wrapper > div > div > form > button");
        this.inputName = By.cssSelector("#root > div > div.registration_wrapper > div.registration_wrapper_body > div > div.registration_main_info_container > div:nth-child(1) > div > label > input");
        this.inputSurename = By.cssSelector("#root > div > div.registration_wrapper > div.registration_wrapper_body > div > div.registration_main_info_container > div:nth-child(2) > div > label > input");
        this.inputCountry = By.cssSelector("#root > div > div.registration_wrapper > div.registration_wrapper_body > div > div.registration_main_info_container > div:nth-child(3) > div > div > div > div.custom_dropdown_wrapper_search > label > input");
        this.inputLinkedIn = By.cssSelector("#root > div > div.registration_wrapper > div.registration_wrapper_body > div > div.registration_main_info_container_social > div > div:nth-child(1) > label > input");
        this.inputFacebook = By.cssSelector("#root > div > div.registration_wrapper > div.registration_wrapper_body > div > div.registration_main_info_container_social > div > div:nth-child(3) > label > input");
        this.inputInstagram = By.cssSelector("#root > div > div.registration_wrapper > div.registration_wrapper_body > div > div.registration_main_info_container_social > div > div:nth-child(4) > label > input");
        this.inputBehance = By.cssSelector("#root > div > div.registration_wrapper > div.registration_wrapper_body > div > div.registration_main_info_container_social > div > div:nth-child(2) > label > input");
        this.inputAboutYou = By.cssSelector("#root > div > div.registration_wrapper > div.registration_wrapper_body > div > div.registration_main_info_about > div.input_component > textarea");
        this.buttonNext = By.cssSelector("#root > div > div.registration_wrapper > div.wrapper_navigation_btn > button");
        this.buttonNext2 = By.cssSelector("#root > div > div.registration_wrapper > div.wrapper_navigation_btn > button:nth-child(2)");
        this.buttonCategory = By.cssSelector("#root > div > div.registration_wrapper > div.registration_wrapper_body > div > form > div.registration_categories_select > div > div > div > div.custom_dropdown_wrapper_search > label > img");
        this.buttonCatDigital = By.cssSelector("#root > div > div.registration_wrapper > div.registration_wrapper_body > div > form > div.registration_categories_select > div > div > div > div.custom_dropdown_option.overflow_scrollbar.active_custom_dropdown > span:nth-child(1)");
        this.buttonAnArtwork = By.cssSelector("#root > div > div > div.artworks_list.wrapper_every_section > div > div:nth-child(1) > div > a > img");
        this.buttonAddToCart = By.cssSelector("#root > div > div.public_artwork_wrapper > div.public_artwork_container > div.public_artwork_item_content > div.public_artwork_item_content_body > button");
        this.buttonCart = By.cssSelector("#header > div.header_login_section_user_active.header_login_section > div.cart_wrapper > img");
        this.buttonCheckout = By.cssSelector("#root > div > form > div.user_cart_wrapper_content > div > div.user_cart_price_checkout > button");

    }

    public WebElement findButtonArtsted(){return  driver.findElement(artstedLogo);}
    public WebElement findButtonDiscover(){return  driver.findElement(discoverButton);}
    public WebElement findButtonArtworks(){return  driver.findElement(artworksButton);}
    public WebElement findButtonArtists(){return  driver.findElement(artistsButton);}
    public WebElement findButtonPremium(){return  driver.findElement(premiumButton);}
    public WebElement findSingInButton(){return  driver.findElement(signInButton);}
    public WebElement findButtonRegister(){return  driver.findElement(registerButton);}
    public WebElement findEmailInput(){return  driver.findElement(emailInput);}
    public WebElement findPasswordInput(){return  driver.findElement(passwordInput);}
    public WebElement findLoginButton(){return  driver.findElement(loginbutton);}

   public void signUser(String email,String password)
   {
       findSingInButton().click();
       findEmailInput().sendKeys(email);
       findPasswordInput().sendKeys(password);
       findLoginButton().click();
   }


}



