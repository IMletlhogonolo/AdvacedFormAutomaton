package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.ReadData;
import Utils.TakesScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class base {
    BrowserFactory browserFactory= new BrowserFactory();

    final WebDriver driver = browserFactory.launchBrowser("chrome","https://ndosisimplifiedautomation.vercel.app/");

    public HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    public TakesScreenshots takesScreenshots = new TakesScreenshots();
    public LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    public LearnPage learnPage = PageFactory.initElements(driver, LearnPage.class);
    public WebAutomationAdvancePage webAutomationAdvancePage = PageFactory.initElements(driver, WebAutomationAdvancePage.class);
    public InventoryFormPage inventoryFormPage = PageFactory.initElements(driver, InventoryFormPage.class);
    public VerifyOrderPage pressNext = PageFactory.initElements(driver, VerifyOrderPage.class);
    public ExtrasPage extrasPage = PageFactory.initElements(driver, ExtrasPage.class);
    public ViewInvoice viewInvoice = PageFactory.initElements(driver, ViewInvoice.class);


    ReadData readData;

    {
        try {
            readData = new ReadData();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
