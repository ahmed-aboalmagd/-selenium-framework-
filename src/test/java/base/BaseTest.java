package base;

import factory.DriverFactory;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static java.sql.DriverManager.getDriver;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod

    public void setup() {
        driver = new DriverFactory().initializeDriver();
        driver.get("https://www.demoblaze.com/index.html");
    }

    @AfterMethod

    public void quit(ITestResult result) {
        String testCaseName = result.getMethod().getMethodName();
        File destinationFile = new File("target" + File.separator + "ScreenShots" + File.separator + testCaseName + ".png");

        takeScreenShot(destinationFile);

        driver.quit();
    }

    public void takeScreenShot(File destinationFile) {

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(file, destinationFile);
            InputStream is = new FileInputStream(destinationFile);
            Allure.addAttachment("ScreenShot", is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}