package test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;

public class LocalTestRunner {
    private String url = "http://google.com";
    private static WebDriver driver;
    protected WebDriver launch() throws InterruptedException {
        WebDriver driver = getDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        return driver;
    }
    protected WebDriver getDriver() throws InterruptedException {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            driver = new ChromeDriver(chromeOptions);
            launch();
            Thread.sleep(2000);
        }

        return driver;
    }
    @AfterClass(alwaysRun = true)
    public void afterClass() {
        driver.quit();
        driver = null;
    }
}
