package Pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
  /*  public HomePage load(){
        driver.get("https://www.demoblaze.com/index.html");
        return this;
    }*/

    @FindBy(xpath ="//*[@id=\"navbarExample\"]/ul/li[2]/a")
    private WebElement contactLink;

    @FindBy(xpath ="//*[@id=\"navbarExample\"]/ul/li[3]/a")
    private WebElement AboutLink;

    @FindBy(id = "signin2")
    private WebElement signupLink;

    @FindBy(id = "login2")
    private WebElement loginLink;

    @FindBy(xpath ="//*[@id=\"navbarExample\"]/ul/li[4]/a")
    private WebElement CartLink;
    /// add prudact to card
    @FindBy(xpath = "(//div/div[@class='card h-100'])[1]")
    private WebElement prudact;

    public ProductPage selectProduct()
    {
        clickButton(prudact);
       return new ProductPage(driver);
    }



    public  Aboutpage openAbout(){
        AboutLink.click();
        return new Aboutpage(driver);
    }
    public ContactPage openContact(){
        contactLink.click();
        return new ContactPage(driver);
    }
    public SignUpPage openSignup(){
        signupLink.click();
        return new SignUpPage(driver);
    }
    public LoginPage openLogin(){
        loginLink.click();
        return new LoginPage(driver);
    }
    public  CartPage openCart(){
        clickButton(CartLink);
        return new CartPage(driver);
    }

}