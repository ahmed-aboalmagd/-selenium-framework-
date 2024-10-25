package Pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "sign-username")
    private WebElement emailInput;

    @FindBy(id = "sign-password")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
    private WebElement submit;




    public void signup(String email,String password)  {
        sendtext(emailInput,email);
        sendtext(passwordInput,password);
        clickButton(submit);



    }
}
