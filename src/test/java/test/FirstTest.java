package test;

import Pages.ProfileMainPart.PortfolioPage;
import Pages.ProfileMainPage;
import Pages.LeftNavigationBar;
import Pages.TopPart;
import org.testng.annotations.Test;

public class FirstTest extends LocalTestRunner {
    @Test
    public void testLauch() throws InterruptedException {
       launch();
       TopPart topPart=new TopPart(getDriver());
       LeftNavigationBar leftNavigationBar = new LeftNavigationBar(getDriver());
       ProfileMainPage profileMainPage = new ProfileMainPage(getDriver());
       PortfolioPage portfolioPage = new PortfolioPage(getDriver());

       //profileMainPage.playVideo();
       //Thread.sleep(2000);


    }
}
