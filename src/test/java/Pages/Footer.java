package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer {
    protected WebDriver driver;
    private By advisoryLink;
    private By buyerFaqLink;
    private By testimonialsLink;
    private By curatorLink;
    private By whySellLink;
    private By handbookLink;
    private By howItworkLink;
    private By pressLink;
    private By careersLink;
    private By contactLink;
    private By blogLink;
    private By termsLink;
    private By privacyLink;
    private By copirightLink;
    private By affiliateLink;

    public Footer(WebDriver driver) {
        this.driver = driver;
        this.advisoryLink = By.cssSelector("div:nth-child(1) > div > div:nth-child(1) > a");
        this.buyerFaqLink = By.cssSelector("div > div:nth-child(1) > div > div:nth-child(2) > a");
        this.testimonialsLink = By.cssSelector("div:nth-child(1) > div > div:nth-child(3) > a");
        this.curatorLink = By.cssSelector("div:nth-child(1) > div > div:nth-child(4) > a");
        this.whySellLink = By.cssSelector("div:nth-child(2) > div > div:nth-child(1) > a");
        this.handbookLink = By.cssSelector("div:nth-child(2) > div > div:nth-child(2) > a");
        this.howItworkLink = By.cssSelector("div:nth-child(2) > div > div:nth-child(3) > a");
        this.pressLink = By.cssSelector("div:nth-child(3) > div > div:nth-child(1) > a");
        this.careersLink = By.cssSelector("div:nth-child(3) > div > div:nth-child(2) > a");
        this.contactLink = By.cssSelector("div:nth-child(3) > div > div:nth-child(3) > a");
        this.blogLink = By.cssSelector("div:nth-child(3) > div > div:nth-child(4) > a");
        this.termsLink = By.cssSelector("div:nth-child(4) > div > div:nth-child(1) > a");
        this.privacyLink = By.cssSelector("div:nth-child(4) > div > div:nth-child(2) > a");
        this.copirightLink = By.cssSelector("div:nth-child(4) > div > div:nth-child(3) > a");
        this.affiliateLink = By.cssSelector("div:nth-child(4) > div > div:nth-child(4) > a");
    }
    public WebElement findAdvisoryLink() { return driver.findElement(advisoryLink); }
    public WebElement findBuyerFaqLink() { return driver.findElement(buyerFaqLink); }
    public WebElement findTestimonialsLink() { return driver.findElement(testimonialsLink); }
    public WebElement findCuratorLink() { return driver.findElement(curatorLink); }
    public WebElement findWhySellLink() { return driver.findElement(whySellLink); }
    public WebElement findHandbookLink() { return driver.findElement(handbookLink); }
    public WebElement findHowItworkLink() { return driver.findElement(howItworkLink); }
    public WebElement findPressLink() { return driver.findElement(pressLink); }
    public WebElement findCareersLink() { return driver.findElement(careersLink); }
    public WebElement findContactLink() { return driver.findElement(contactLink); }
    public WebElement findBlogLink() { return driver.findElement(blogLink); }
    public WebElement findTermsLink() { return driver.findElement(termsLink); }
    public WebElement findPrivacyLink() { return driver.findElement(privacyLink); }
    public WebElement findCopirightLink() { return driver.findElement(copirightLink); }
    public WebElement findAffiliateLink() { return driver.findElement(affiliateLink); }

    public void footerInfo() throws InterruptedException{
        findAdvisoryLink().click(); Thread.sleep(2000);
        findBuyerFaqLink().click(); Thread.sleep(2000);
        findTestimonialsLink().click(); Thread.sleep(2000);
        findCuratorLink().click(); Thread.sleep(2000);
        findWhySellLink().click(); Thread.sleep(2000);
        findHandbookLink().click(); Thread.sleep(2000);
        findHowItworkLink().click(); Thread.sleep(2000);
        findPressLink().click(); Thread.sleep(2000);
        findCareersLink().click(); Thread.sleep(2000);
        findContactLink().click(); Thread.sleep(2000);
        findBlogLink().click(); Thread.sleep(2000);
        findTermsLink().click(); Thread.sleep(2000);
        findPrivacyLink().click(); Thread.sleep(2000);
        findCopirightLink().click(); Thread.sleep(2000);
        findAffiliateLink().click(); Thread.sleep(2000);
    }
}
