package tests;

import Pages.ContactPage;
import Pages.HomePage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class d_contactTest extends BaseTest {
    @Test
    public void shouldBeAbleContantToWithEmailAndSendMessage() throws InterruptedException {
        // driver.findElement(By.id("login2")).click();
        HomePage homePage = new HomePage(driver);
        ContactPage contactpage =homePage.openContact();
        contactpage.contact("ahmedmagd279", "ahmed","good");
        Thread.sleep(2000);
        String contact=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.println(contact);
        Assert.assertEquals(contact ,"Thanks for the message!!" );
    }

    @Test
    public void emptyEmailAndSendMessage() throws InterruptedException {
        // driver.findElement(By.id("login2")).click();
        HomePage homePage = new HomePage(driver);
        ContactPage contactpage =homePage.openContact();
        contactpage.contact("", "","");
        Thread.sleep(2000);
        String contact=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.println(contact);
        Assert.assertEquals(contact ,"Thanks for the message!!" );
    }


}
