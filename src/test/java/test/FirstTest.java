package test;


import Pages.TopPart;
import org.testng.annotations.Test;

public class FirstTest extends LocalTestRunner {
    @Test
    public void testLauch() throws InterruptedException {
       launch();
       TopPart topPart=new TopPart(getDriver());
       //topPart.clickButtonArtsted();
       //Thread.sleep(2000);
       //topPart.clickButtonDiscover();
       //Thread.sleep(2000);
       //topPart.clickButtonArtworks();
       //Thread.sleep(2000);
       //topPart.clickButtonArtists();
       //Thread.sleep(2000);
       //topPart.clickButtonPremium();
       //Thread.sleep(2000);
       //topPart.clickButtonRegister();
       //Thread.sleep(500);
       //topPart.putLogin("investorreevesnathan@yahoo.com");
       //Thread.sleep(500);
       //topPart.putPassword("123");
       //Thread.sleep(500);
       //topPart.putRepeadPassword("123456");
       //Thread.sleep(500);
        //topPart.clickCheckButton1();
        //Thread.sleep(500);
        //topPart.clickButtonRegisterAcc();
        //Thread.sleep(500);
        //topPart.clickButtonIAmArtist();
        //Thread.sleep(500);
        //topPart.clickButtonApply();
        //Thread.sleep(2000);
       //topPart.clickButton();
       //Thread.sleep(500);
       //topPart.putLogin("zuktvcyld@emltmp.com");
       //Thread.sleep(500);
       //topPart.putPassword("123456");
       //Thread.sleep(500);
       //topPart.clickButtonSign();
       //Thread.sleep(2000);
        //topPart.putName("Artist");
        //topPart.putSurename("Artist");
        //topPart.putCountry("Ukraine");
        //putLinkedin("https://www.linkedin.com/");
        //topPart.putFacebook("https://uk-ua.facebook.com/");
        //topPart.putInstagram("https://www.instagram.com/");
        //topPart.putBehance("https://www.behance.net/");
        //topPart.putAboutYou("A am an Artist");
        //Thread.sleep(500);
        //topPart.clickButtonNext();
        //Thread.sleep(500);
        //topPart.clickButtonNext2();
        //Thread.sleep(500);
        //topPart.clickButtonCategory();
        //Thread.sleep(500);
        //topPart.clickButtonCatDigital();
        //Thread.sleep(3000);
        topPart.clickButton();
        topPart.putLogin("investorreevesnathan@yahoo.com");
        topPart.putPassword("123");
        topPart.clickButtonSign();
        topPart.clickButtonArtworks();
        topPart.clickButtonAnArtwork();
        topPart.clickButtonAddToCart();
        topPart.clickButtonCart();
        topPart.clickButtonCheckout();
        Thread.sleep(500);

    }
}
