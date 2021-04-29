package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PublicArtworkPage {
    protected WebDriver driver;
    private By addtoCartButton;
    private By like;
    private By share;
    private By shipping;
    private By returns;
    private By paymant;
    private By warranty;

    public PublicArtworkPage(WebDriver driver) {
        this.driver = driver;
        this.addtoCartButton = By.cssSelector("div.public_artwork_item_content_body > button");
        this.like = By.cssSelector("div.public_artwork_user_social > div.public_artwork_user_social_follow > svg");
        this.share = By.cssSelector("div.public_artwork_user_social_container > div.public_artwork_user_social_follow > svg");
        this.shipping = By.cssSelector("div:nth-child(1) > span.public_artwork_item_content_body_tabs_container_active");
        this.returns = By.cssSelector("div.public_artwork_item_content_body_tabs_container > div:nth-child(1) > span:nth-child(2)");
        this.paymant = By.cssSelector("div.public_artwork_item_content_body_tabs_container > div:nth-child(1) > span:nth-child(3)");
        this.warranty = By.cssSelector("div.public_artwork_item_content_body_tabs_container > div:nth-child(1) > span:nth-child(4)");
    }
    public WebElement findAddtoCartButton() {return driver.findElement(addtoCartButton);}

    public void clickAddtoCart(){findAddtoCartButton().click();}
}
