package com.automation.pages;

import com.automation.Utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class startPage extends AbstractPage {

    @FindBy(xpath = "//div[contains(text(),'Yes')]")
    private WebElement checkBoxYes;

    @FindBy(xpath = "//div[contains(text(),'I rent')]")
    private WebElement rentChckBox;

    @FindBy(xpath = "//div[contains(text(),'I’m buying a car soon')]")
    private WebElement payChechBox;

    @FindBy(xpath = "//input[@id='garaging_address']")
    private WebElement inputAddress;

    @FindBy(xpath = "//input[@id='unit']")
    private WebElement inputUnit;

    @FindBy(xpath = "//input[@id='first_name-0']")
    private WebElement inputFirstN;

    @FindBy(xpath = "//input[@id='last_name-0']")
    private WebElement inputLastN;

    @FindBy(xpath = "//input[@id='date_of_birth-0']")
    private WebElement inputDateB;

    public void inputDateofBrith(String dateofBirth) {
        BrowserUtils.wait(2);
        inputDateB.sendKeys(dateofBirth);
    }

    public void inputLastName(String lastname) {
        BrowserUtils.wait(2);
        inputLastN.sendKeys(lastname);
    }

    public void inputFirstName(String frisname) {
        BrowserUtils.wait(2);
        inputFirstN.sendKeys(frisname);
    }

    public void inputunitNum(String unit) {
        BrowserUtils.wait(2);
        inputUnit.sendKeys(unit);
    }

    public void inputAddress(String address) {
        BrowserUtils.wait(2);
        inputAddress.sendKeys(address);
    }

    public void clickCheckBox() {
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxYes));
        checkBoxYes.click();
    }

    public void clickRentCheckBox() {
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.elementToBeClickable(rentChckBox));
        rentChckBox.click();
    }

    public void clickPayingCheckbox() {
        BrowserUtils.wait(2);
        //wait.until(ExpectedConditions.invisibilityOf(payChechBox));
        payChechBox.click();
    }


}
