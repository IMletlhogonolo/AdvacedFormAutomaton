package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyOrderPage {

    WebDriver driver;

    @FindBy(xpath = "//button[normalize-space()='Next']")
    WebElement nextButton;

    public VerifyOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickNext() {
        nextButton.click();
    }
}