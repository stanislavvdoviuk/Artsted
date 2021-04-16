package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopPart {
    protected WebDriver driver;
    private By button;


    public TopPart(WebDriver driver)  {
        this.driver=driver;
        this.button = By.cssSelector("div.header_sign_in_container > span:nth-child(1)");
    }

    public WebElement findButton(){return  driver.findElement(button);}

    public void clickButton(){ findButton().click();}


}


