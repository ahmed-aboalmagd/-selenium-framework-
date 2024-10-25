package tests;
import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductPage;
import base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class e_CartTest extends BaseTest {


    @Test
    public void viewProduct1() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        Thread.sleep(1000);
        productPage.openPag2();
        Thread.sleep(1000);
        productPage.addPrudact2();

    }
    @Test
    public void viewProduct() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        Thread.sleep(1000);
        productPage = homePage.selectProduct();
        Thread.sleep(1000);
        productPage.AddProduct();
        Thread.sleep(1000);
        String added = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.println(added);
        Assert.assertEquals(added, "Product added");


    }

   @Test
    public void DeleteProduct() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
      //  homePage.load();
        Thread.sleep(1000);
        productPage = homePage.selectProduct();
        Thread.sleep(1000);
        productPage.AddProduct();
        Thread.sleep(1000);
        String added = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        homePage.openCart();
        CartPage cartPage=new CartPage(driver);
        cartPage.Delete();


    }
    @Test
    public void sellProduct() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        Thread.sleep(1000);
        productPage = homePage.selectProduct();
        Thread.sleep(1000);
        productPage.AddProduct();
        Thread.sleep(1000);
        String added = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        homePage.openCart();
        CartPage cartPage=new CartPage(driver);
        cartPage.laceOrder();
        cartPage.openPlaceOrder("ahmed","Egypt","Qena","123","may","2024");

    }


}
