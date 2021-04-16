package test;
package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LocalTestRunner {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        String baseWebUrl = "https://www.linkedin.com/";
        String expectedWebsiteTitle = "World’s Largest Professional Network | LinkedIn";
        String actualWebsiteTitle = "";

        driver.get(baseWebUrl);

        actualWebsiteTitle = driver.getTitle();

        if (actualWebsiteTitle.contentEquals(expectedWebsiteTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }

        driver.close();

        System.exit(0);

    }
}
