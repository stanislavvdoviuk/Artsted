package test;

import Pages.ArtworksPage;
import Pages.TopPart;
import org.testng.annotations.Test;

public class ShoppingTest extends LocalTestRunner {
    @Test(description = "Check shopping")
    public void checkShopping() throws InterruptedException {
        launch();
        TopPart topPart=new TopPart(getDriver());
        topPart.signUser("investorkrystal47@yahoo.com", "123");
        topPart.clickArtworks();
        ArtworksPage art=new ArtworksPage(getDriver());
        art.clickOnFreeArtwork();
        Thread.sleep(10000);
    }
}
