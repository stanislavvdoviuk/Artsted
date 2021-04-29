package test;

import Pages.LeftNavigationBar;
import Pages.ProfileMainPart.SupportPage;
import Pages.TopPart;
import org.testng.annotations.Test;

public class Support extends LocalTestRunner {
    @Test
    public void testSupport() throws InterruptedException {
        launch();
        TopPart topPart = new TopPart(getDriver());
        LeftNavigationBar leftNavigationBar = new LeftNavigationBar(getDriver());
        SupportPage supportPage = new SupportPage(getDriver());

        topPart.signUser("ggbkciww@laste.ml", "123456");
        Thread.sleep(3000);
        leftNavigationBar.clickButtonSupport();
        Thread.sleep(3000);
        supportPage.supportRequest("I need help");
        Thread.sleep(3000);
    }
}