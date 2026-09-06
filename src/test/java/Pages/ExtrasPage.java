package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExtrasPage {

    WebDriver driver;

    @FindBy(id = "shipping-standard")
    WebElement shippingStandardRadio;

    @FindBy(id = "shipping-express")
    WebElement shippingExpressRadio;

    @FindBy(id = "warranty-none")
    WebElement warrantyNoneRadio;

    @FindBy(id = "warranty-1yr")
    WebElement warranty1yrRadio;

    @FindBy(id = "warranty-2yr")
    WebElement warranty2yrRadio;

    @FindBy(id = "discount-code")
    WebElement discountCodeInput;

    @FindBy(id = "apply-discount-btn")
    WebElement applyDiscountButton;

    public ExtrasPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectShippingMethod(String shippingMethod) {
        if (shippingMethod.equalsIgnoreCase("express")) {
            shippingExpressRadio.click();
        } else {
            shippingStandardRadio.click();
        }
    }

    public void selectWarranty(String warranty) {
        switch (warranty.toLowerCase()) {
            case "1yr":
                warranty1yrRadio.click();
                break;
            case "2yr":
                warranty2yrRadio.click();
                break;
            default:
                warrantyNoneRadio.click();
        }
    }

    public void enterDiscountCode(String code) {
        discountCodeInput.clear();
        discountCodeInput.sendKeys(code);
    }

    public void clickApplyDiscount() {
        applyDiscountButton.click();
    }
}