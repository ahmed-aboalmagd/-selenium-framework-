package Pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

  //  @FindBy(xpath = "//div/div[@class='col-sm-12 col-md-6 col-lg-6']")
    @FindBy (css = "[onclick=\"addToCart(1)\"]")
    private WebElement AddToCard;

    @FindBy (id = "itemc")
    private WebElement labpage;

    @FindBy (id = "next2")
    private WebElement page2;

    @FindBy (xpath = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
    private WebElement prudact2;

    @FindBy (css = "//*[@id=\"tbodyid\"]/div[2]/div/a")
    private WebElement AddToCard2;


    public void AddProduct(){clickButton(AddToCard);
       // AddToCard.click();
    }

    public void openLabPage(){
        labpage.click();
    }


    public void openPag2(){
        page2.click();
    }

    public void addPrudact2(){
        prudact2.click();
    }




    //alert

    //click cart button

}
