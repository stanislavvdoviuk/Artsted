package test;

import Pages.MainInfoArtistPage;
import Pages.TopPart;
import org.testng.annotations.Test;

public class RegisterTest extends LocalTestRunner{
    @Test
    public void testLauch() throws InterruptedException {
        launch();
        TopPart topPart = new TopPart(getDriver());
        MainInfoArtistPage mainInfoArtistPage = new MainInfoArtistPage(getDriver());

        topPart.registerUser("16vswrxz@10mail.tk", "123456", "123456");
        Thread.sleep(3000);

        mainInfoArtistPage.fillinMainInfo("Name", "Surename", "Ukraine", "https://www.instagram.com/", "https://www.facebook.com/", "https://www.behance.net/", "https://www.linkedin.com/", "I am an Artist");
        Thread.sleep(5000);
    }
}
