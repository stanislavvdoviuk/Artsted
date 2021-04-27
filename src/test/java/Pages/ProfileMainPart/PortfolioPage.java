package Pages.ProfileMainPart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class PortfolioPage {


    protected WebDriver driver;
    private By lastUploadsButton;
    private By mostViewedButton;
    private By soldButton;
    private By uploadWorkButton;
    private By uploadImagesButton;
    private By titleInput;
    private By yearInput;
    private By descriptionTextarea;
    private By categoriesDropdown;
    private By styleDropdown;
    private By materialsDropdown;
   // private By openedMaterialsDropdown;
    private By materialCostInput;
    private By heightInput;
    private By depthInput;
    private By widthInput;
    private By priceInput;
    private By packagingTypeRadioB;
    private By exhibitionsPartTextarea;
    private By publicationsTextarea;
    private By agreeTermsCheckB;

    public PortfolioPage(WebDriver driver) {
        this.driver = driver;
        this.lastUploadsButton = By.cssSelector("");
        this.mostViewedButton = By.cssSelector("");
        this.soldButton = By.cssSelector("");
        this.uploadWorkButton = By.cssSelector("div:nth-child(3) > button");
        this.uploadImagesButton = By.cssSelector("div.wrapper_upload_photo > div");
        this.titleInput = By.cssSelector("div.wrapper_upload_work__title_of_art > div:nth-child(1) > label > input");
        this.yearInput = By.cssSelector("div.wrapper_upload_work__title_of_art > div:nth-child(2) > label > input");
        this.descriptionTextarea = By.cssSelector(" div.wrapper_upload_work__description_of_art > div > textarea");
        this.categoriesDropdown = By.cssSelector("div:nth-child(1) > div.registration_categories_select > div > div > div > div.custom_dropdown_wrapper_search > label > input");
        this.styleDropdown = By.cssSelector("div:nth-child(2) > div.registration_categories_select > div > div > div > div.custom_dropdown_wrapper_search > label > input");
        this.materialsDropdown = By.cssSelector("div.wrapper_upload_work__material_wrapper > div:nth-child(1) > div.registration_categories_select > div > div > div > div.custom_dropdown_wrapper_search > label > input");
     //   this.openedMaterialsDropdown = By.cssSelector("div.custom_dropdown_option.overflow_scrollbar > span");
        this.materialCostInput = By.cssSelector("div.final_price_wrapper > div > label > input");
        this.heightInput = By.cssSelector("div.wrapper_upload_work__ranges__height > div > label > input");
        this.depthInput = By.cssSelector("div.wrapper_upload_work__ranges__width > div > label > input");
        this.widthInput = By.cssSelector("div.wrapper_upload_work__ranges__depth > div > label > input");
        this.priceInput = By.cssSelector("div.wrapper_upload_work__ranges__height > div > label > input");
        this.packagingTypeRadioB = By.cssSelector("div:nth-child(2) > div > label > span > div");
        this.exhibitionsPartTextarea = By.cssSelector("div.wrapper_upload_work__exhibition_participation > div.input_component > textarea");
        this.publicationsTextarea = By.cssSelector("div.wrapper_upload_work__publications > div.input_component > textarea");
        this.agreeTermsCheckB = By.cssSelector("div.wrapper_upload_work__agree_terms_wrapper > div > label > span");
    }

    public WebElement findlastUploadsButton() { return driver.findElement(lastUploadsButton); }
    public WebElement findMostViewedButton() { return driver.findElement(mostViewedButton); }
    public WebElement findSoldButton() { return driver.findElement(soldButton); }
    public WebElement findUploadWorkButton() { return driver.findElement(uploadWorkButton); }
    public WebElement findUploadImagesButton() { return driver.findElement(uploadImagesButton); }
    public WebElement findTitleInput() { return driver.findElement(titleInput); }
    public WebElement findYearInput() { return driver.findElement(yearInput); }
    public WebElement findDescriptionTextarea() { return driver.findElement(descriptionTextarea); }
    public WebElement findCategoriesDropdown() { return driver.findElement(categoriesDropdown); }
    public WebElement findStyleDropdown() { return driver.findElement(styleDropdown); }
    public WebElement findMaterialsDropdown() { return driver.findElement(materialsDropdown); }
    public WebElement findMaterialCostInput() { return driver.findElement(materialCostInput); }
    public WebElement findHeightInput() { return driver.findElement(heightInput); }
    public WebElement findDepthInput() { return driver.findElement(depthInput); }
    public WebElement findWidthInput() { return driver.findElement(widthInput); }
    public WebElement findPriceInput() { return driver.findElement(priceInput); }
    public WebElement findPackagingTypeRadioB() { return driver.findElement(packagingTypeRadioB); }
    public WebElement findExhibitionsPartTextarea() { return driver.findElement(exhibitionsPartTextarea); }
    public WebElement findPublicationsTextarea() { return driver.findElement(publicationsTextarea); }
    public WebElement findAgreeTermsCheckB() { return driver.findElement(agreeTermsCheckB); }




    public void clickButtonUploadWork() { findUploadWorkButton().click(); }

    public void uploadArtwork(String title,String year,String description, String matcos, String height, String depth, String width, String price, String exh, String part) {
        //findUploadImagesButton().sendKeys();
        findTitleInput().sendKeys(title);
        findYearInput().sendKeys(year);
        findDescriptionTextarea().sendKeys(description);
        findMaterialsDropdown().click();
        List<WebElement> openDropDownMateriald =  driver.findElements(By.cssSelector("div.custom_dropdown_option.overflow_scrollbar > span"));
        openDropDownMateriald.get(2).click();
        findMaterialCostInput().sendKeys(matcos);
        findHeightInput().sendKeys(height);
        findDepthInput().sendKeys(depth);
        findWidthInput().sendKeys(width);
        findPriceInput().sendKeys(price);
        findPackagingTypeRadioB().click();
        findExhibitionsPartTextarea().sendKeys(exh);
        findPublicationsTextarea().sendKeys(part);
        findAgreeTermsCheckB().click();

    }

}


