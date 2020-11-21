package com.automation.Test;

import com.automation.Utilities.BrowserUtils;
import com.automation.Utilities.ConfigurationReader;
import com.automation.Utilities.Driver;
import com.automation.Utilities.ExcelUtil;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public abstract class AbstractTestBase {

    protected WebDriverWait wait;
    protected Actions actions;

    protected ExtentReports report;
    protected ExtentHtmlReporter htmlReporter;
    protected ExtentTest test;

    protected static int row = 1;
    protected ExcelUtil excelUtil;

    //@Optional - to make parameter optional
    //if you don't specify it, testng will require to specify this parameter for every test, in xml runner
    @BeforeTest
    @Parameters("reportName")
    public void setupTest( @Optional String reportName){
        System.out.println("Report Name:" +reportName);
        reportName = reportName == null ? "report.html" : reportName+".html";

        report = new ExtentReports();

        String reportPath = "";
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            reportPath = System.getProperty("user.dir") + "\\test-output\\"+reportName;
        } else {
            reportPath = System.getProperty("user.dir") + "/test-output/"+reportName;
        }

        htmlReporter = new ExtentHtmlReporter(reportPath);
        report.attachReporter(htmlReporter);
        htmlReporter.config().setReportName("The Zebra Test Automation Result");
    }

    @AfterTest
    public void afterTest(){
        report.flush();  //to release a report
    }

    @BeforeMethod
    public void setup() {
        String URL = ConfigurationReader.getProperty("qa3");
        Driver.getDriver().get(URL);
        Driver.getDriver().manage().window().maximize();
        wait = new WebDriverWait(Driver.getDriver(), 25);
        actions = new Actions(Driver.getDriver());
    }

    @AfterMethod
    public void teardow() {
      BrowserUtils.wait(1);
       Driver.closeDriver();
    }

}
