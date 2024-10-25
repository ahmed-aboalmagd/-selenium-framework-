package Pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"videoModal\"]/div/div/div[3]/button")
    private WebElement Close;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/tr/td[4]/a")
    private WebElement delete;

    @FindBy(css ="[data-target=\"#orderModal\"]" )
    private WebElement placeOrder;

    @FindBy(id ="name" )
    private WebElement name;

    @FindBy(id ="country" )
    private WebElement country;

    @FindBy(id ="city" )
    private WebElement city;

    @FindBy(id ="card" )
    private WebElement card;

    @FindBy(id ="month" )
    private WebElement month;

    @FindBy(id ="year" )
    private WebElement year;

    @FindBy (css = "[onclick=\"purchaseOrder()\"]")
    private WebElement Purchase;


    @FindBy (xpath ="/html/body/div[10]/div[7]/div/button")
    private WebElement OK;


    public void About(){clickButton(Close);}

    public void Delete(){clickButton(delete);}

    public void laceOrder(){clickButton(placeOrder);}

    public void openPlaceOrder(String Name, String Country,String City,String Card,String Month,String Year){
        sendtext(name,Name);
        sendtext(country,Country);
        sendtext(city,City);
        sendtext(card,Card);
        sendtext(month,Month);
        sendtext(year,Year);
        clickButton(Purchase);
        clickButton(OK);
    }

}
