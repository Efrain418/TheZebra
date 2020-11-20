package com.automation.pages;

import com.automation.Utilities.BrowserUtils;
import com.automation.Utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Testclass {

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 25);

    @Test
    public void testhomepage(){
//        WebElement clickcar  = Driver.getDriver().findElement(By.xpath("//input[@id='d801ee8a-c8a9-47e8-bef5-7da7120b8a0eauto']"));
//        //clickcar.click();
//        WebElement elmentzipcode = Driver.getDriver().findElement(By.xpath("//input[@id='d801ee8a-c8a9-47e8-bef5-7da7120b8a0e']"));
//        elmentzipcode.sendKeys("98101", Keys.ENTER);
//
//        BrowserUtils.wait(2);
//        WebElement CarInsuranceYes = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Yes')]"));
//        BrowserUtils.wait(2);
//        CarInsuranceYes.click();
//        BrowserUtils.wait(2);
//        WebElement rentCar = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'I rent')]"));
//        BrowserUtils.wait(2);
//        rentCar.click();
//        BrowserUtils.wait(2);
//        WebElement paymentLevel =Driver.getDriver().findElement(By.xpath("//div[contains(text(),'I think I’m paying too much')]"));
//        paymentLevel.click();
//        WebElement saveAndCountinue = Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-primary btn-pill']"));
//        saveAndCountinue.click();
//
//        WebElement addrsess = Driver.getDriver().findElement(By.xpath("//input[@id='garaging_address']"));
//        BrowserUtils.wait(2);
//        addrsess.sendKeys("6563 yul");
//
//        WebElement unit = Driver.getDriver().findElement(By.xpath("//input[@id='unit']"));
//        BrowserUtils.wait(2);
//        unit.sendKeys("109");
//
//
//        WebElement fisrname = Driver.getDriver().findElement(By.xpath("//input[@id='first_name-0']"));
//        BrowserUtils.wait(2);
//        fisrname.sendKeys("alex");
//
//        WebElement lastname = Driver.getDriver().findElement(By.xpath("//input[@id='last_name-0']"));
//        BrowserUtils.wait(2);
//        lastname.sendKeys("Jhon");
//
//        WebElement DATEOF = Driver.getDriver().findElement(By.xpath("//input[@id='date_of_birth-0']"));
//        BrowserUtils.wait(2);
//        DATEOF.sendKeys("09/07/1990");
//
//        WebElement saveAndCountinue1 = Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-primary btn-pill']"));
//        saveAndCountinue1.click();


        //Actions actions= new Actions(driver);
//
//        BrowserUtils.wait(5);
//      //  Select select = new Select(Driver.getDriver().findElement(By.xpath("//div[@id='dropdown-vehicle-year-0']")))
//        //div[contains(text(),'2020')]
//        //(//div[@class='custom-dropdown__indicators css-1wy0on6'])[1]
//     WebElement clickv = driver.findElement(By.xpath("//div[contains(text(),'2020')]"));
//        BrowserUtils.wait(3);
//     clickv.sendKeys();
//        List<WebElement> value = driver.findElements(By.xpath("//div[contains(text(),'Select vehicle year')]"));
//
//        clickv.click();
//        clickv.sendKeys("2020");
     //  click.sendKeys("2020");
//        BrowserUtils.wait(5);
//        select.selectByVisibleText("2020");
//        select.selectByValue("2020");
//        WebElement VECLEyesr = Driver.getDriver().findElement(By.id("dropdown-vehicle-year-0"));
//        VECLEyesr.sendKeys("2020",Keys.ENTER);
       // VECLEyesr.click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'21')]")));
        BrowserUtils.wait(2);
//div[contains(text(),'RDX')]

      //  WebElement ele=  Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Select vehicle year')]"));
        WebElement years = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'2021')]"));
        BrowserUtils.wait(2);
        years.click();
        BrowserUtils.wait(3);
        WebElement make = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Acura')]"));
        BrowserUtils.wait(3);
        make.click();
        BrowserUtils.wait(3);
        WebElement MODEL = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'RDX')]"));
        BrowserUtils.wait(2);
        MODEL.click();
        BrowserUtils.wait(3);
        WebElement submodel = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'4dr SUV')]"));
        BrowserUtils.wait(2);
        submodel.click();
        BrowserUtils.wait(3);
             WebElement saveAndCountinue = Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-primary btn-pill']"));
        BrowserUtils.wait(3);
        saveAndCountinue.click();

        BrowserUtils.wait(3);
        WebElement leaseBut= Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Lease')]"));
        BrowserUtils.wait(2);
        leaseBut.click();
//div[contains(text(),'Pleasure')]
        BrowserUtils.wait(2);
        WebElement pleasureBut= Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Pleasure')]"));
        BrowserUtils.wait(2);
        pleasureBut.click();
        BrowserUtils.wait(2);
        WebElement inputmiles= Driver.getDriver().findElement(By.xpath("//input[@name='miles-0']"));
        BrowserUtils.wait(2);
        inputmiles.sendKeys("400");
        BrowserUtils.wait(4);
//        WebElement milesYearly= Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Select frequency')]"));
//        //wait.until(ExpectedConditions.visibilityOf(milesYearly));
//        BrowserUtils.wait(3);
//        milesYearly.click();
//        WebElement milesclick= Driver.getDriver().findElement(By.xpath("//div[contains(text(),'per year')]"));
//        wait.until(ExpectedConditions.visibilityOf(milesclick));
//        BrowserUtils.wait(2);
//        milesclick.click();
        BrowserUtils.wait(2);
        WebElement saveAndCountinue1 = Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-primary btn-pill']"));
        BrowserUtils.wait(3);
        saveAndCountinue1.click();
        BrowserUtils.wait(2);

        WebElement firestName = Driver.getDriver().findElement(By.xpath("//input[@id='first_name-0']"));
        BrowserUtils.wait(3);
        firestName.sendKeys("Alex");
        BrowserUtils.wait(3);
        WebElement lastname = Driver.getDriver().findElement(By.xpath("//input[@id='last_name-0']"));
        BrowserUtils.wait(3);
        lastname.sendKeys("Jhon");

        WebElement date_of_birth = Driver.getDriver().findElement(By.xpath("//input[@id='date_of_birth-0']"));
        BrowserUtils.wait(3);
        date_of_birth.sendKeys("09/29/1987");
        BrowserUtils.wait(3);

        WebElement address = Driver.getDriver().findElement(By.xpath("//input[@id='garaging_address']"));
        BrowserUtils.wait(3);
        address.sendKeys("876 marhol streest ");
        BrowserUtils.wait(3);

        WebElement unit= Driver.getDriver().findElement(By.xpath("//input[@id='unit']"));
        BrowserUtils.wait(3);
        unit.sendKeys("220");
        BrowserUtils.wait(3);
        WebElement saveAndCountinue2= Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-primary btn-pill']"));
        BrowserUtils.wait(3);
        saveAndCountinue2.click();
        BrowserUtils.wait(2);
        //input[@id='last_name-0']
        //input[@id='first_name-0']
//        WebElement vihcleModel = Driver.getDriver().findElement(By.xpath("//div[@id='dropdown-vehicle-make-0']"));
//        BrowserUtils.wait(2);
//        vihcleModel.sendKeys("Acura");

    }
    @BeforeMethod
    public void setup()  {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);
//      driver = new ChromeDriver(chromeOptions);
        Driver.getDriver().get("https://www.thezebra.com/insurance/car/manual/vehicles/select/");
        Driver.getDriver().manage().window().maximize();

    }

    @AfterMethod
    public void teardown(){
        // Driver.getDriver().quit();
    }

}
