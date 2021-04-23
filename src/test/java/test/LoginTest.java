package test;

import Pages.TopPart;
import org.testng.annotations.Test;

public class LoginTest extends LocalTestRunner{
    @Test(description = "Artist Login Test")
    public void checkArtistLogin() throws InterruptedException {
    launch();
    TopPart topPart=new TopPart(getDriver());
       topPart.signUser("ggbkciww@laste.ml", "12345678");
       Thread.sleep(10000);
}
    @Test(description = "Investor Login Test")
    public void checkInvestorLogin() throws InterruptedException {
        launch();
        TopPart topPart=new TopPart(getDriver());
        topPart.signUser("investorkrystal47@yahoo.com", "123");
        Thread.sleep(10000);
    }

}
