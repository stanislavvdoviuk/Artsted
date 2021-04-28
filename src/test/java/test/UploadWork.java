package test;

import Pages.ProfileMainPart.PortfolioPage;
import Pages.TopPart;
import org.testng.annotations.Test;
import Pages.LeftNavigationBar;

public class UploadWork extends LocalTestRunner {
    @Test
    public void testLauch() throws InterruptedException {
        launch();
            LeftNavigationBar leftNavigationBar = new LeftNavigationBar(getDriver());
            PortfolioPage portfolioPage = new PortfolioPage(getDriver());
            TopPart topPart=new TopPart(getDriver());

        topPart.signUser("ggbkciww@laste.ml", "12345678");
        Thread.sleep(1000);

        leftNavigationBar.clickButtonPortfolio();
        Thread.sleep(1000);

        portfolioPage.clickButtonUploadWork();
        Thread.sleep(1000);

        portfolioPage.uploadArtwork("sea", "2000", "description", "333", "30", "34", "55", "1", "999", "-", "-");
        Thread.sleep(5000);

        //portfolioPage.uploadDropDowns();
        }
    }
