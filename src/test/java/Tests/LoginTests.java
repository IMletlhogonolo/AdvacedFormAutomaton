package Tests;

import Utils.ReadData;
import org.testng.annotations.Test;

public class LoginTests extends base {


    @Test
    public void clickLoginButton() throws InterruptedException {
        takesScreenshots.takesSnapShot(driver, "landing page");
        homePage.clickLoginButton();
    }

    @Test(priority = 1)
    public void enterUsernameTests() {
        loginPage.enterUsername(ReadData.username);
    }

    @Test(priority = 2)
    public void enterPassword() {
        loginPage.enterPassword(ReadData.password);
        takesScreenshots.takesSnapShot(driver, "login page");
    }

    @Test(priority = 3)
    public void clickLoginSubmitButton() throws InterruptedException {
        loginPage.clickLoginSubmitButton();
        Thread.sleep(2000);
        takesScreenshots.takesSnapShot(driver, "dashboard page");
    }

    @Test(priority = 4)
    public void verifyLoginSuccessTest() {
        landingPage.verifyLoginSuccess();
        takesScreenshots.takesSnapShot(driver, "Landing page");
    }

    @Test(priority = 5)
    public void clickLearnTabTest() {
        learnPage.clickLearnTab();
        takesScreenshots.takesSnapShot(driver, "learn page");
    }

    @Test(priority = 6)
    public void clickLearningMaterialsTest() {
        learnPage.clickLearningMaterials();
        takesScreenshots.takesSnapShot(driver, "learning materials page");
    }

    @Test(priority = 7)
    public void ClickingWebAutomationAdvanceTest() {
        webAutomationAdvancePage.clickWebAutomationAdvance();
        takesScreenshots.takesSnapShot(driver, "web automation advance page");
    }

    @Test(priority = 8)
    public void SelectingDeviceOptionsTest() {
        inventoryFormPage.selectDeviceType(ReadData.deviceType);
        inventoryFormPage.selectBrand(ReadData.brand);
        inventoryFormPage.selectStorage(ReadData.storage);
        inventoryFormPage.selectColour(ReadData.colour);
        inventoryFormPage.enterQuantity(ReadData.quantity);
        inventoryFormPage.enterAddress(ReadData.address);
        takesScreenshots.takesSnapShot(driver, "inventory form page");

    }

        @Test(priority = 9)
        public void ConfirmOrderTest() throws InterruptedException {
            pressNext.clickNext();
            takesScreenshots.takesSnapShot(driver, "next page");
        }

    @Test(priority = 10)
    public void extrasPageTest() {
        extrasPage.selectShippingMethod(ReadData.shippingMethod);
        extrasPage.selectWarranty(ReadData.warranty);

        if (ReadData.applyDiscount.equalsIgnoreCase("yes")) {
            extrasPage.enterDiscountCode(ReadData.discountCode);
            extrasPage.clickApplyDiscount();
        }

        takesScreenshots.takesSnapShot(driver, "extras page completed");
    }


}


