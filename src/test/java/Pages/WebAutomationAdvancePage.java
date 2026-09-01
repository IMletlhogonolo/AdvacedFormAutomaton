package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebAutomationAdvancePage {

    WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='Web Automation Advance']")
    WebElement webAutomationAdvanceTab;

    public WebAutomationAdvancePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickWebAutomationAdvance() {
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(webAutomationAdvanceTab));
        webAutomationAdvanceTab.click();
    }

}
