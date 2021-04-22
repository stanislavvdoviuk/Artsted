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



