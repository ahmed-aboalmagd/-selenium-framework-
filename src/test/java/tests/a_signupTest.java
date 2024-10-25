package tests;

import Pages.HomePage;
import Pages.SignUpPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;



public class a_signupTest extends BaseTest {


    @Test
    public void shouldBeAbleToSignupWithEmailAndPassword() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = homePage.openSignup();
        Random random=new Random();
       int i=random.nextInt();
      
        signUpPage.signup("ahmedmagd"+i+"@gmail.com","ahmed");

        Thread.sleep(1000);
        String errorMassage=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertEquals(errorMassage ,"Sign up successful." );
    }

    @Test
    public void shouldBeAbleToSignupWithNewEmailAndPassword() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = homePage.openSignup();
        signUpPage.signup("ahmedmagd2791121","ahmed");
        Thread.sleep(2000);
        String errorMassage=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertEquals(errorMassage ,"This user already exist." );
    }

    @Test
    public void testEmptyUsername() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = homePage.openSignup();
        signUpPage.signup("","ahmed");
        Thread.sleep(2000);
        String errorMassage=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertEquals(errorMassage ,"Please fill out Username and Password." );
    }

    @Test
    public void testEmptyPassword() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = homePage.openSignup();
        signUpPage.signup("ahmedmagd2719121","");
        Thread.sleep(1000);
        String errorMassage=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertEquals(errorMassage ,"Please fill out Username and Password." );
    }

}
