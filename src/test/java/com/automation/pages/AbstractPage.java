package com.automation.pages;

import com.automation.Utilities.BrowserUtils;
import com.automation.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {

    @FindBy(xpath = "//a[@class='btn btn-primary btn-pill']")
    private WebElement saveAndCountinue;


    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 25);

    public AbstractPage() {
        PageFactory.initElements(driver, this);
    }

    public String getTitle(){
        return   Driver.getDriver().getTitle();
    }
    public void clickSaveAndCountinue(){
        BrowserUtils.wait(2);
        saveAndCountinue.click();
    }
    public void navigateTo(String tabName, String moduleName){
        String tabNameXpath = "//span[contains(text()," + tabName + ")]";
        String moduleXpath = "//a[contains(text()," + moduleName + "]";

        WebElement tabElment = driver.findElement(By.xpath(tabNameXpath));
        WebElement moduleElment = driver.findElement(By.xpath(moduleXpath));

        Actions actions= new Actions(driver);

        BrowserUtils.wait(4);

        actions.moveToElement(tabElment).
                pause(3000).
                click(moduleElment).
                build().perform();
        //increase this wait rime if still failing
        BrowserUtils.wait(7);
    }
}
