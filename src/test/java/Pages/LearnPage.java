package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LearnPage {

    WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='Learn']")
    WebElement learnTab;

    @FindBy(xpath = "//span[normalize-space()='Learning Materials']")
    WebElement learningMaterialsOption;

    public LearnPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLearnTab() {
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(learnTab));
        learnTab.click();
    }

    public void clickLearningMaterials() {
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(learningMaterialsOption));
        learningMaterialsOption.click();
    }
}