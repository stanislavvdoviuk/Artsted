package test;

import Pages.ArtworksPage;
import Pages.Cart;
import Pages.PublicArtworkPage;
import Pages.TopPart;
import org.testng.annotations.Test;

public class ShoppingTest extends LocalTestRunner {
    @Test(description = "Check shopping")
    public void checkShopping() throws InterruptedException {
        launch();
        TopPart topPart=new TopPart(getDriver());
        topPart.signUser("evoefoyeb@supere.ml", "123456");
        topPart.clickArtworks();
        ArtworksPage art=new ArtworksPage(getDriver());
        art.setUnsoldWork();
        PublicArtworkPage publicart = new PublicArtworkPage(getDriver());
        publicart.clickAddtoCart();
        Cart cart = new Cart(getDriver());
        cart.clickCheckout();
        //art.clickOnFreeArtwork();
        //Thread.sleep(10000);
    }
}
