package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ArtworksPage {
    protected WebDriver driver;
    private By artworksList;
    private By artworkBlock;
    private By soldFlag;

    public ArtworksPage(WebDriver driver) {
        this.driver = driver;
        this.artworksList = By.cssSelector(".artworks_list .art_price_body_card");
        this.soldFlag = By.cssSelector("div.art_price_body_card_info_sold");
        this.artworkBlock = By.cssSelector("");
    }

    //    public void clickOnFreeArtwork() throws InterruptedException {
//        for(int i=0;i<=allArtworks.size();i++)
//        {
//
//                allArtworks.get(i).click();
//
//        }

}



