package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewInvoice {

    WebDriver driver;

    @FindBy(id = "view-history-btn")
    WebElement viewInvoiceButton;

    @FindBy(xpath = "//button[starts-with(@id, 'view-invoice-')]")
    WebElement viewInvoiceDetailButton;

    public ViewInvoice(WebDriver driver) {
        this.driver = driver;
    }

    public void clickViewInvoice() {
        viewInvoiceButton.click();
    }

    public void clickViewInvoiceDetail() {
        viewInvoiceDetailButton.click();
    }
}