package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopPart {
    protected WebDriver driver;
    private By buttonArtsted;
    private By buttonDiscover;
    private By buttonArtworks;
    private By buttonArtists;
    private By buttonPremium;
    private By buttonSignIn;
    private By buttonRegister;
    private By loginInputEmail;
    private By loginInputPassword;
    private By loginInputRepeadPassword;
    private By buttonSign;
    private By checkButton1;
    private By buttonRegisterAcc;
    private By buttonIAmArtist;
    private By buttonApply;
    private By inputName;
    private By inputSurename;
    private By inputCountry;
    private By inputLinkedIn;
    private By inputFacebook;
    private By inputInstagram;
    private By inputBehance;
    private By inputAboutYou;
    private By buttonNext;
    private By buttonNext2;
    private By buttonCategory;
    private By buttonCatDigital;
    private By buttonAnArtwork;
    private By buttonAddToCart;
    private By buttonCart;
    private By buttonCheckout;


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

    public WebElement findButtonArtsted(){return  driver.findElement(buttonArtsted);}
    public WebElement findButtonDiscover(){return  driver.findElement(buttonDiscover);}
    public WebElement findButtonArtworks(){return  driver.findElement(buttonArtworks);}
    public WebElement findButtonArtists(){return  driver.findElement(buttonArtists);}
    public WebElement findButtonPremium(){return  driver.findElement(buttonPremium);}
    public WebElement findButton(){return  driver.findElement(buttonSignIn);}
    public WebElement findButtonRegister(){return  driver.findElement(buttonRegister);}
    public WebElement findInput(){return  driver.findElement(loginInputEmail);}
    public WebElement findInputP(){return  driver.findElement(loginInputPassword);}
    public WebElement findInputRP(){return  driver.findElement(loginInputRepeadPassword);}
    public WebElement findCheckButton1(){return  driver.findElement(checkButton1);}
    public WebElement findButtonRegisterAcc(){return  driver.findElement(buttonRegisterAcc);}
    public WebElement findButtonSign(){return  driver.findElement(buttonSign);}
    public WebElement findButtonIAmArtist(){return  driver.findElement(buttonIAmArtist);}
    public WebElement findButtonApply(){return  driver.findElement(buttonApply);}
    public WebElement findInputName(){return  driver.findElement(inputName);}
    public WebElement findInputSurename(){return  driver.findElement(inputSurename);}
    public WebElement findInputCountry(){return  driver.findElement(inputCountry);}
    public WebElement findInputLinkedin(){return  driver.findElement(inputLinkedIn);}
    public WebElement findInputFacebook(){return  driver.findElement(inputFacebook);}
    public WebElement findInputInstagram(){return  driver.findElement(inputInstagram);}
    public WebElement findInputBehance(){return  driver.findElement(inputBehance);}
    public WebElement findInputAboutYou(){return  driver.findElement(inputAboutYou);}
    public WebElement findButtonNext(){return  driver.findElement(buttonNext);}
    public WebElement findButtonNext2(){return  driver.findElement(buttonNext2);}
    public WebElement findButtonCategory(){return  driver.findElement(buttonCategory);}
    public WebElement findButtonCatDigital(){return  driver.findElement(buttonCatDigital);}
    public WebElement findButtonAnArtwork(){return  driver.findElement(buttonAnArtwork);}
    public WebElement findButtonAddToCart(){return  driver.findElement(buttonAddToCart);}
    public WebElement findButtonCart(){return  driver.findElement(buttonCart);}
    public WebElement findButtonCheckout(){return  driver.findElement(buttonCheckout);}


    public void clickButtonArtsted(){ findButtonArtsted().click();}
    public void clickButtonDiscover(){ findButtonDiscover().click();}
    public void clickButtonArtworks(){ findButtonArtworks().click();}
    public void clickButtonArtists(){ findButtonArtists().click();}
    public void clickButtonPremium(){ findButtonPremium().click();}
    public void clickButton(){ findButton().click();}
    public void clickButtonRegister(){ findButtonRegister().click();}

    public void putLogin(String text)
    {
        findInput().sendKeys(text);
    }
    public void putPassword(String text)
    {
        findInputP().sendKeys(text);
    }
    public void putRepeadPassword(String text)
    {
        findInputRP().sendKeys(text);
    }
    public void clickButtonSign(){ findButtonSign().click();}
    public void clickCheckButton1(){ findCheckButton1().click();}
    public void clickButtonRegisterAcc(){ findButtonRegisterAcc().click();}
    public void clickButtonIAmArtist(){ findButtonIAmArtist().click();}
    public void clickButtonApply(){ findButtonApply().click();}
    public void putName(String text)
    {
        findInputName().sendKeys(text);
    }
    public void putSurename(String text)
    {
        findInputSurename().sendKeys(text);
    }
    public void putCountry(String text)
    {
        findInputCountry().sendKeys(text);
    }
    public void putLinkedin(String text)
    {
        findInputLinkedin().sendKeys(text);
    }
    public void putFacebook(String text)
    {
        findInputFacebook().sendKeys(text);
    }
    public void putInstagram(String text)
    {
        findInputInstagram().sendKeys(text);
    }
    public void putBehance(String text)
    {
        findInputBehance().sendKeys(text);
    }
    public void putAboutYou(String text)
    {
        findInputAboutYou().sendKeys(text);
    }
    public void clickButtonNext(){ findButtonNext().click();}
    public void clickButtonNext2(){ findButtonNext2().click();}
    public void clickButtonCategory(){ findButtonCategory().click();}
    public void clickButtonCatDigital(){ findButtonCatDigital().click();}
    public void clickButtonAnArtwork(){ findButtonAnArtwork().click();}
    public void clickButtonAddToCart(){ findButtonAddToCart().click();}
    public void clickButtonCart(){ findButtonCart().click();}
    public void clickButtonCheckout(){ findButtonCheckout().click();}
}



