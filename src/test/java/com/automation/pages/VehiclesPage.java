package com.automation.pages;

import com.automation.Utilities.BrowserUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclesPage {

    ////div[@id='dropdown-vehicle-year-0']
    ////div[@id='dropdown-vehicle-make-0']
    ////div[@id='dropdown-vehicle-model-0']
    //div[@id='dropdown-vehicle-submodel-0']


    @FindBy(xpath = "//div[contains(text(),'Pleasure')]")
    private WebElement useforpleasure;

    @FindBy(xpath = "//input[@name='miles-0']")
    private WebElement mileage;

    @FindBy(xpath = "//div[contains(text(),'per month')]")
    private WebElement permonth;

    @FindBy(xpath = "//div[contains(text(),'Lease')]")
    private WebElement chooseforLease;

    public void clickchooseLease() {
        BrowserUtils.wait(3);
        chooseforLease.click();
        BrowserUtils.wait(2);
    }

    public void clickpermonth() {
        BrowserUtils.wait(3);
        permonth.click();
        BrowserUtils.wait(2);
    }

    public void inputmiles(String miles) {
        BrowserUtils.wait(2);
        mileage.sendKeys(miles);
        BrowserUtils.wait(2);
    }

    public void clickButPleasure() {
        BrowserUtils.wait(3);
        useforpleasure.click();
        BrowserUtils.wait(2);

    }


    @FindBy(xpath = "//div[contains(text(),'2021')]")
    private WebElement selectVehiclesYear;

    @FindBy(xpath = "//div[contains(text(),'Acura')]")
    private WebElement selectVehiclesMake;

    @FindBy(xpath = "//div[contains(text(),'RDX')]")
    private WebElement selectvehiclemodel;

    @FindBy(xpath = "//div[contains(text(),'4dr SUV')]")
    private WebElement selectvehiclesubmodel;

    public void inputvehiclesubmodel() {
        BrowserUtils.wait(2);
        selectvehiclesubmodel.click();
    }

    public void inputvehiclemodel() {
        BrowserUtils.wait(2);
        selectvehiclemodel.click();
    }

    public void inputVehiclesYear() {
        BrowserUtils.wait(2);
        selectVehiclesYear.click();
    }

    public void inputVehiclesMake() {
        BrowserUtils.wait(2);
        selectVehiclesMake.click();
    }


}
