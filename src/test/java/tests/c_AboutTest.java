package tests;

import Pages.Aboutpage;
import Pages.HomePage;
import base.BaseTest;
import org.testng.annotations.Test;

public class c_AboutTest extends BaseTest {

    @Test
    public void shouldBeAbleToOpenAndClose() throws InterruptedException {
        // driver.findElement(By.id("login2")).click();
        HomePage homePage = new HomePage(driver);
        Aboutpage aboutpage =homePage.openAbout();
        aboutpage.About();
    }

}
 /*Thread.sleep(2000);
String z=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.println(z);*/