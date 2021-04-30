package test;

import Pages.Footer;
import Pages.TopPart;
import org.testng.annotations.Test;

public class FooterTest extends LocalTestRunner {
    @Test
    public void testFooter() throws InterruptedException {
        launch();
        TopPart topPart=new TopPart(getDriver());
        topPart.signUser("ggbkciww@laste.ml", "123456");
        Thread.sleep(5000);

        Footer footer = new Footer(getDriver());
        footer.footerInfo();
    }
}
