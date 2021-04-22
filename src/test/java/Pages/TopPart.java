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
        this.artstedLogo = By.cssSelector("");
        this.discoverButton = By.cssSelector("");
        this.artworksButton = By.cssSelector("");
        this.artistsButton = By.cssSelector("");
        this.premiumButton = By.cssSelector("");
        this.signInButton = By.cssSelector("div.header_sign_in_container > span:nth-child(1)");
        this.registerButton = By.cssSelector(" div.header_sign_in > div.header_sign_in_container > span:nth-child(3)");
        this.emailInput = By.cssSelector("div.input_component.true > label > input");
        this.passwordInput = By.cssSelector("div.wrapper_inputs_auth > div.input_component.input_component_unset_margin");
        this.loginbutton = By.cssSelector("div.wrapper_btn > button");


    }

    public WebElement findArtstedLogo(){return  driver.findElement(artstedLogo);}
    public WebElement findDiscoverButton(){return  driver.findElement(discoverButton);}
    public WebElement findArtworksButton(){return  driver.findElement(artworksButton);}
    public WebElement findArtistsButton(){return  driver.findElement(artistsButton);}
    public WebElement findPremiumButton(){return  driver.findElement(premiumButton);}
    public WebElement findSingInButton(){return  driver.findElement(signInButton);}
    public WebElement findRegisterButton(){return  driver.findElement(registerButton);}
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



