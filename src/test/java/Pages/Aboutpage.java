package Pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Aboutpage extends BasePage {

    public Aboutpage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"videoModal\"]/div/div/div[3]/button")
    private WebElement Close;

    public void About(){
        Close.click();
    }

}
