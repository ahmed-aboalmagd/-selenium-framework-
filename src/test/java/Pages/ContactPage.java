package Pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage {
    public ContactPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[id=\"recipient-email\"]")
    private WebElement contactEmailInput;


    @FindBy(css = "[id=\"recipient-name\"]")
    private WebElement contactNameInput;


    @FindBy(css = "[id=\"message-text\"]")
    private WebElement contactMassageInput;

    @FindBy(xpath = "//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")
    private WebElement sendMessage;


    public void contact(String email, String name, String message ){
       sendtext(contactEmailInput,email);
        sendtext(contactNameInput,name);
        sendtext(contactMassageInput,message);
        clickButton(sendMessage);
       // contactEmailInput.sendKeys(email);
       // contactNameInput.sendKeys(name);
       // contactMassageInput.sendKeys(message);
        //sendMessage.click();
    }

}
