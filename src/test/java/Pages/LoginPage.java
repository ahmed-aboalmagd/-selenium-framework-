package Pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[id=\"loginusername\"]")
    private WebElement emailInput;


    @FindBy(css = "[id=\"loginpassword\"]")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
    private WebElement submit;




    public void login(String email, String password){
        sendtext(emailInput,email);
        sendtext(passwordInput,password);
        clickButton(submit);
    }
}
