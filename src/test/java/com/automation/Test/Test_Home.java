package com.automation.Test;

import com.automation.Utilities.BrowserUtils;
import com.automation.Utilities.ConfigurationReader;
import com.automation.Utilities.Driver;
import com.automation.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Test_Home extends AbstractTestBase {

    @Test(description = "Verify the home page and enter zipcode")
    public void homepage(){
        HomePage homePage = new HomePage();
        String titile= "The Zebra: Instantly Compare Insurance Quotes";
        Assert.assertEquals(homePage.getTitle(),titile);
        homePage.inputzipcode("98101");
    }



}
