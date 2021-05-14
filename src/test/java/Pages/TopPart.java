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
    private By blogButton;
    private By searchInput;
    private By signInButton;
    private By registerButton;
    private By cartButton;
    private By emailInput;
    private By passwordInput;
    private By repeatPasswordInput;
    private By registerAccButton;
    private By loginButton;
    private By termsAgreeCheckB;
    private By receiveEmailCheckB;
    private By regViaFacebookButton;
    private By anArtistRadioB;
    private By anInvestorRadioB;
    private By applyButton;


    public TopPart(WebDriver driver)  {
        this.driver=driver;
        this.artstedLogo = By.cssSelector("div.header_navigation > a > img");
        this.discoverButton = By.cssSelector("div.header_navigation > ul > li:nth-child(1) > a");
        this.artworksButton = By.cssSelector("div.header_navigation > ul > li:nth-child(2) > a");
        this.artistsButton = By.cssSelector("div.header_navigation > ul > li:nth-child(3) > a");
        this.premiumButton = By.cssSelector("div.header_navigation > ul > li:nth-child(4) > a");
        this.blogButton = By.cssSelector("div.header_navigation > ul > li:nth-child(5) > a");
        this.searchInput = By.cssSelector("input[type=text]");
        this.signInButton = By.cssSelector("div.header_sign_in_container > span:nth-child(1)");
        this.registerButton = By.cssSelector(" div.header_sign_in > div.header_sign_in_container > span:nth-child(3)");
        this.cartButton = By.cssSelector("div.cart_wrapper > img");
        this.emailInput = By.cssSelector("div.wrapper_inputs_auth > div:nth-child(1) > label > input");
        this.passwordInput = By.cssSelector("div.wrapper_inputs_auth > div:nth-child(2) > label > input");
        this.repeatPasswordInput = By.cssSelector("div:nth-child(3) > label > input");
        this.registerAccButton = By.cssSelector(" div.wrapper_btn > button");
        this.loginButton = By.cssSelector("div.wrapper_btn > button");
        this.regViaFacebookButton = By.cssSelector("div.fb_sign_wrapper > span > button");
        this.termsAgreeCheckB = By.cssSelector("div:nth-child(1) > label > span");
        this.receiveEmailCheckB = By.cssSelector(" div:nth-child(2) > label > span");
        this.anArtistRadioB = By.cssSelector("div:nth-child(1) > div > label > span > div");
        this.anInvestorRadioB = By.cssSelector("div:nth-child(2) > div > label > span > div");
        this.applyButton = By.cssSelector("div.auth_popup_wrapper > div > div > form > button");
    }

    public WebElement findArtstedLogo(){return  driver.findElement(artstedLogo);}
    public WebElement findDiscoverButton(){return  driver.findElement(discoverButton);}
    public WebElement findArtworksButton(){return  driver.findElement(artworksButton);}
    public WebElement findArtistsButton(){return  driver.findElement(artistsButton);}
    public WebElement findPremiumButton(){return  driver.findElement(premiumButton);}
    public WebElement findBlogButton() {return driver.findElement(blogButton);}
    public WebElement findSearchInput(){return  driver.findElement(searchInput);}
    public WebElement findSingInButton(){return  driver.findElement(signInButton);}
    public WebElement findRegisterButton(){return  driver.findElement(registerButton);}
    public WebElement findCartButton() {return driver.findElement(cartButton);}
    public WebElement findEmailInput(){return  driver.findElement(emailInput);}
    public WebElement findPasswordInput(){return  driver.findElement(passwordInput);}
    public WebElement findRepeatPasswordInput(){return  driver.findElement(repeatPasswordInput);}
    public WebElement findLoginButton() {return driver.findElement(loginButton);}
    public WebElement findRegisterAccButton(){return  driver.findElement(registerAccButton);}
    public WebElement findTermsAgreeCheckB(){return  driver.findElement(termsAgreeCheckB);}
    public WebElement findReceiveEmailCheckB(){return  driver.findElement(receiveEmailCheckB);}
    public WebElement findRegViaFacebookButton(){return  driver.findElement(regViaFacebookButton);}
    public WebElement findAnArtistRadioB(){return  driver.findElement(anArtistRadioB);}
    public WebElement findAnInvestorRadioB(){return  driver.findElement(anInvestorRadioB);}
    public WebElement findApplyButton() {return driver.findElement(applyButton);}

   public void signUser(String email,String password)
   {
       findSingInButton().click();
       findEmailInput().sendKeys(email);
       findPasswordInput().sendKeys(password);
       findLoginButton().click();
   }

    public void registerUser(String email,String password,String reppas)
    {
        findRegisterButton().click();
        findEmailInput().sendKeys(email);
        findPasswordInput().sendKeys(password);
        findRepeatPasswordInput().sendKeys(reppas);
        findTermsAgreeCheckB().click();
        findReceiveEmailCheckB().click();
        findRegisterAccButton().click();
        findAnArtistRadioB().click();
        findApplyButton().click();
    }
   public void clickArtworks()
   {
       findArtworksButton().click();
   }
   public void clickCart(){findCartButton().click();}
   public void clickBlog() {findBlogButton().click();}

}



