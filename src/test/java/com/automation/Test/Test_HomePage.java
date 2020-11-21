package com.automation.Test;

import com.automation.Utilities.BrowserUtils;
import com.automation.Utilities.ConfigurationReader;
import com.automation.Utilities.Driver;
import com.automation.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class Test_HomePage extends AbstractTestBase {


    @Test(description = "Verify the home page and Title")
    public void homepageTitle() {
        HomePage homePage = new HomePage();
        String titile = "The Zebra: Instantly Compare Insurance Quotes";
        Assert.assertEquals(homePage.getTitle(), titile);
    }

    @Test(description = "Verify the home page and URL")
    public void verifyUrl() {
        String Accualurl = Driver.getDriver().getCurrentUrl();
        String ExpactedURL = ConfigurationReader.getProperty("qa3");
        Assert.assertEquals(Accualurl, ExpactedURL);
    }

    @Test(description = "Verify the home page and text")
    public void verifyVisibleText() {
        String expectedresult = "Compare insurance quotes instantly.";
        String actual = Driver.getDriver().findElement(By.tagName("H3")).getText();
        if (expectedresult.equals(actual)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }

    @Test(description = "print the Compare Menue and verify of them present or NoT")
    public void verifyCompare() {
        Actions actions = new Actions(Driver.getDriver());
        WebElement link = Driver.getDriver().findElement(By.xpath("//span[text()='Compare']"));
        actions.moveToElement(link).build().perform();
        Assert.assertTrue(link.isDisplayed());

        List<WebElement> link2 = Driver.getDriver().findElements(By.xpath("//div[2]/div[3]/div[1]/ul[1]"));
        BrowserUtils.wait(3);
        int leang = link2.size();
        BrowserUtils.wait(2);
        System.out.println(" uzun : "+leang);
        for (WebElement each : link2) {
            BrowserUtils.wait(3);
            String getText = each.getText();
            System.out.println(getText);

            Assert.assertTrue(getText.contains("Auto Insurance"));
            Assert.assertTrue(getText.contains("Home Insurance"));
            Assert.assertTrue(getText.contains("Renters Insurance"));
            Assert.assertTrue(getText.contains("Free Car Insurance Quotes"));
            Assert.assertTrue(getText.contains("Average Car Insurance Cost"));
            Assert.assertTrue(getText.contains("Car Insurance By Vehicle"));
            Assert.assertTrue(getText.contains("Insurance By State"));
            Assert.assertTrue(getText.contains("Best Insurance Companies"));
            Assert.assertTrue(getText.contains("Other Insurance"));

        }
    }
}
//        List<String> listfoMenue =new ArrayList<>();
//        listfoMenue.add("Auto Insurance");
//        listfoMenue.add("Home Insurance");
//        listfoMenue.add("Renters Insurance");
//        listfoMenue.add("Life Insurance");
//        listfoMenue.add("Free Car Insurance Quotes");
//        listfoMenue.add("Average Car Insurance Cost");
//        listfoMenue.add("Car Insurance By Vehicle");
//        listfoMenue.add("Insurance By State");
//        listfoMenue.add("Best Insurance Companies");
//        listfoMenue.add("Other Insurance");
//       String mylist =  listfoMenue.toString().replace(",","").replace("[","")
//         .replace("]","");
//        System.out.println(mylist);
