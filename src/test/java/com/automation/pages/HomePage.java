package com.automation.pages;


import com.automation.Utilities.BrowserUtils;
import com.automation.Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage{

    @FindBy(xpath = "//input[@id='d801ee8a-c8a9-47e8-bef5-7da7120b8a0eauto']")
    private WebElement car;

    @FindBy (xpath = "//input[@class='form-control with-icon zipcode-text-input']")
    private WebElement zipcode;



   public void clickCar(){
       BrowserUtils.wait(2);
       car.click();
 }

   public void inputzipcode(String zip){
       BrowserUtils.wait(2);
       zipcode.sendKeys(zip,Keys.ENTER);
       BrowserUtils.wait(2);
   }

}
