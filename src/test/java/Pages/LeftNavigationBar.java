package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeftNavigationBar {
    protected WebDriver driver;
    private By profileButton;
    private By settingsButton;
    private By portfolioButton;
    private By mySalesButton;
    private By supportButton;
    private By statisticsButton;
    private By inboxButton;

    public LeftNavigationBar(WebDriver driver) {
        this.driver = driver;
        this.profileButton = By.cssSelector("a:nth-child(1)");
        this.settingsButton = By.cssSelector("a:nth-child(2)");
        this.portfolioButton = By.cssSelector(" a:nth-child(3)");
        this.mySalesButton = By.cssSelector("a:nth-child(4)");
        this.supportButton = By.cssSelector("a:nth-child(5)");
        this.statisticsButton = By.cssSelector("a:nth-child(6)");
        this.inboxButton = By.cssSelector("a:nth-child(7)");
    }

    public WebElement findProfileButton() { return driver.findElement(profileButton); }
    public WebElement findSettingsButton() { return driver.findElement(settingsButton); }
    public WebElement findPortfolioButton() { return driver.findElement(portfolioButton); }
    public WebElement findmySalesButton() { return driver.findElement(mySalesButton); }
    public WebElement findSupportButton() { return driver.findElement(supportButton); }
    public WebElement findStatisticsButton() { return driver.findElement(statisticsButton); }
    public WebElement findInboxButton() { return driver.findElement(inboxButton); }

    public void clickButtonProfile() { findProfileButton().click(); }

    public void clickButtonSettings() { findSettingsButton().click(); }

    public void clickButtonStatistics() { findStatisticsButton().click(); }

    public void clickButtonPortfolio() { findPortfolioButton().click(); }
}
