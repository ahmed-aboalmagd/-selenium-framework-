package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    protected static void clickButton(WebElement button){
        button.click();
    }

    protected static void sendtext(WebElement text,String value){
      text.sendKeys(value);
    }

}
