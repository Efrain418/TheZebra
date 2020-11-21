package com.automation.Test;

import com.automation.Utilities.BrowserUtils;
import com.automation.Utilities.Driver;
import com.automation.pages.HomePage;
import com.automation.pages.VehiclesPage;
import com.automation.pages.startPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Get_Quote extends AbstractTestBase {
    HomePage homePage = new HomePage();
    startPage startPage = new startPage();
    VehiclesPage vehiclesPage = new VehiclesPage();

    @Test
    public void StarGetQuotePage() {
        homePage.inputzipcode("98101");
        startPage.clickCheckBox();
        startPage.clickRentCheckBox();
        startPage.clickPayingCheckbox();
        startPage.clickSaveAndCountinue();
        startPage.inputAddress("1218 Third Avenue");
        startPage.inputunitNum("109");
        startPage.inputFirstName("Anderson");
        startPage.inputLastName("Alex");
        startPage.inputDateofBrith("08/16/1988");
        String titileOfPage = "Start | Compare car insurance rates | The Zebra";
        Assert.assertEquals(homePage.getTitle(), titileOfPage);
        startPage.clickSaveAndCountinue();
        BrowserUtils.wait(5);
        WebElement years = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'2021')]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'2021')]")));
        BrowserUtils.wait(1);
        years.click();
        BrowserUtils.wait(1);
        WebElement make = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Acura')]"));
        BrowserUtils.wait(1);
        make.click();
        BrowserUtils.wait(1);
        WebElement MODEL = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'RDX')]"));
        BrowserUtils.wait(1);
        MODEL.click();
        BrowserUtils.wait(2);
        WebElement submodel = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'4dr SUV')]"));
        BrowserUtils.wait(2);
        submodel.click();
        startPage.clickSaveAndCountinue();
        BrowserUtils.wait(1);
        WebElement leaseBut = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Lease')]"));
        BrowserUtils.wait(1);
        leaseBut.click();
//div[contains(text(),'Pleasure')]
        BrowserUtils.wait(1);
        WebElement pleasureBut = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Pleasure')]"));
        BrowserUtils.wait(1);
        pleasureBut.click();
        BrowserUtils.wait(1);
        WebElement inputmiles = Driver.getDriver().findElement(By.xpath("//input[@name='miles-0']"));
        BrowserUtils.wait(1);
        inputmiles.sendKeys("400");
        BrowserUtils.wait(1);
        startPage.clickSaveAndCountinue();

        WebElement cherckBox = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Male')]"));
        BrowserUtils.wait(1);
        cherckBox.click();

        BrowserUtils.wait(1);
        WebElement checkBoxSingle = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Single')]"));
        BrowserUtils.wait(1);
        checkBoxSingle.click();

        WebElement checkBoxCreditScore = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Excellent (720+)')]"));
        BrowserUtils.wait(1);
        checkBoxCreditScore.click();
        BrowserUtils.wait(1);

        WebElement checkBoxDgree = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Master’s degree')]"));
        BrowserUtils.wait(1);
        checkBoxDgree.click();
        BrowserUtils.wait(1);

        WebElement checkBoxExprince = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'More than 3 years')]"));
        BrowserUtils.wait(1);
        checkBoxExprince.click();
        BrowserUtils.wait(2);

        ////div[@class='custom-dropdown__indicator']
        WebElement insurenceCompnay1 = Driver.getDriver().findElement(By.xpath("//div[@class='custom-dropdown__indicator']"));
        insurenceCompnay1.click();
        BrowserUtils.wait(2);
        WebElement insurenceCompnay = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'21st Century')]"));
        //wait.until(ExpectedConditions.invisibilityOf(insurenceCompnay));
        BrowserUtils.wait(2);
        insurenceCompnay.click();
        BrowserUtils.wait(2);

        WebElement amontofMoneny = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'$25k / $50k')]"));
        BrowserUtils.wait(2);
        amontofMoneny.click();
        BrowserUtils.wait(2);

        // //div[@id='__next']//div[10]/div//div[2]/label[1]

        ////div[contains(text(),'$25k / $50k')]
        //div[@name='violations-disabled-disabled']//div[2]//div[2]//div[2]
        WebElement chooseNo = Driver.getDriver().findElement(By.xpath(".//div[@class='col-lg col-md-12']//following::label[31]"));
        wait.until(ExpectedConditions.elementToBeClickable(chooseNo));
        chooseNo.click();

        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@id='email-0']"));
        BrowserUtils.wait(2);
        inputEmail.sendKeys("alexhHola@gmal.com");
        BrowserUtils.wait(2);

//        WebElement chooseNo2= Driver.getDriver().findElement(By.xpath("//input[@id='is_interested_in_account-false-undefined']"));
//        BrowserUtils.wait(2);
//        chooseNo2.click();
//        BrowserUtils.wait(2);

        WebElement employedinfo = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Employed full time')]"));
        BrowserUtils.wait(2);
        employedinfo.click();
        BrowserUtils.wait(2);


////div[contains(text(),'Employed full time')]
        //input[@id='email-0']
///html[1]/body[1]/div[1]/div[2]/main[1]/div[1]/div[2]/form[1]/div[7]/div[1]/div[2]/div[1]/div[2]/label[1]/div[1]
//        WebElement currentcoveragecheckBox= Driver.getDriver().findElement(By.xpath("//div[contains(text(),'$25k / $50k')]"));
//        currentcoveragecheckBox.click();
//        BrowserUtils.wait(2);

//        WebElement currentcoveragecheckBox= Driver.getDriver().findElement(By.xpath("//div[contains(text(),'$25k / $50k')]"));
//        currentcoveragecheckBox.click();
//        BrowserUtils.wait(2);

        //div[contains(text(),'$25k / $50k')]
//        WebElement insurenceCompnay= Driver.getDriver().findElement(By.xpath("//div[contains(text(),'21st Century')]"));
//        BrowserUtils.wait(3);
//        insurenceCompnay.click();
//        BrowserUtils.wait(2);

//        WebElement leaseBut= Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Lease')]"));
//        BrowserUtils.wait(2);
//        leaseBut.click();
////div[contains(text(),'Pleasure')]
//        BrowserUtils.wait(2);
//        WebElement pleasureBut= Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Pleasure')]"));
//        BrowserUtils.wait(2);
//        pleasureBut.click();
//        BrowserUtils.wait(2);
//        WebElement inputmiles= Driver.getDriver().findElement(By.xpath("//input[@name='miles-0']"));
//        BrowserUtils.wait(2);
//        inputmiles.sendKeys("40");
//        BrowserUtils.wait(2);
//        WebElement milesYearly= Driver.getDriver().findElement(By.xpath("//div[contains(text(),'per year')]"));
//        wait.until(ExpectedConditions.visibilityOf(milesYearly));
//        BrowserUtils.wait(2);
//        milesYearly.click();
//        BrowserUtils.wait(2);

//        vehiclesPage.clickchooseLease();
//        BrowserUtils.wait(2);
//        vehiclesPage.clickButPleasure();
//        BrowserUtils.wait(2);
//        vehiclesPage.inputmiles("1200");
//        BrowserUtils.wait(2);
        //this comes from locator pages just create methods and call method.
//        vehiclesPage.inputVehiclesYear();
//        BrowserUtils.wait(2);
//        vehiclesPage.inputVehiclesMake();
//        BrowserUtils.wait(2);
//        vehiclesPage.inputvehiclemodel();
//        BrowserUtils.wait(2);
//        vehiclesPage.inputvehiclesubmodel();
    }


}
