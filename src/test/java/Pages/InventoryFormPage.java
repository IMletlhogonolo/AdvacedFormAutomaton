package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryFormPage {

    WebDriver driver;

    @FindBy(id = "deviceType")
    WebElement deviceTypeDropdown;

    @FindBy(id = "brand")
    WebElement brandDropdown;

    @FindBy(id = "color")
    WebElement colourDropdown;

    @FindBy(id = "quantity")
    WebElement quantityTextbox;

    @FindBy(id = "address")
    WebElement addressTextbox;



    public InventoryFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDeviceType(String deviceType) {

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(deviceTypeDropdown));

        Select select = new Select(deviceTypeDropdown);
        select.selectByVisibleText(deviceType);
    }

    public void selectBrand(String brand) {

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(brandDropdown));

        Select select = new Select(brandDropdown);
        select.selectByVisibleText(brand);
    }

    public void selectStorage(String storage) {

        driver.findElement(
                By.xpath("//label[@for='storage-" + storage + "']")
        ).click();
    }

    public void selectColour(String colour) {

        Select select = new Select(colourDropdown);
        select.selectByVisibleText(colour);
    }

    public void enterQuantity(int quantity) {

        quantityTextbox.clear();
        quantityTextbox.sendKeys(String.valueOf(quantity));
    }

    public void enterAddress(String address) {

        addressTextbox.clear();
        addressTextbox.sendKeys(address);
    }


}

