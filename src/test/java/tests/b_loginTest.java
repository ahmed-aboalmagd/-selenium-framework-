package tests;

import Pages.HomePage;
import Pages.LoginPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class b_loginTest extends BaseTest {

    @Test
    public void shouldBeAbleToLoginWithEmailAndPassword() throws InterruptedException {
       // driver.findElement(By.id("login2")).click();
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage =homePage.openLogin();
        loginPage.login("ahmedmagd279@gmail.com", "ahmedmagd");
        //logout2
       /* Thread.sleep(2000);
        String errorMassage=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertEquals(errorMassage ,"Please fill out Username and Password." );*/
    }

    @Test
    public void testEmptyPassword() throws InterruptedException {
        // driver.findElement(By.id("login2")).click();
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage =homePage.openLogin();
        loginPage.login("ahmedmagd@gmail.com", "");
        //logout2
        Thread.sleep(2000);
        String errorMassage=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertEquals(errorMassage ,"Please fill out Username and Password." );
    }

    @Test
    public void testEmptyEmail() throws InterruptedException {
        // driver.findElement(By.id("login2")).click();
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage =homePage.openLogin();
        loginPage.login("", "ahmedmagd");
        //logout2
        Thread.sleep(1000);
        String errorMassage=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertEquals(errorMassage ,"Please fill out Username and Password." );
    }

    @Test
    public void testInvalidEmail() throws InterruptedException {
        // driver.findElement(By.id("login2")).click();
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage =homePage.openLogin();
        loginPage.login("ahmedmagd279@gmail.com", "ahmed");
        //logout2
        Thread.sleep(2000);
        String errorMassage=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertEquals(errorMassage ,"Wrong password." );
    }

    @Test
    public void testInvalidPassword() throws InterruptedException {
        // driver.findElement(By.id("login2")).click();
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage =homePage.openLogin();
        loginPage.login("ahmedmagd1145@gmail.com", "ahmedmagd");
        //logout2
        Thread.sleep(2000);
        String errorMassage=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertEquals(errorMassage ,"User does not exist." );
    }


}
