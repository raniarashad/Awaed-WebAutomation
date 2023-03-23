package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "ctl00_CPHContainer_txtUserLogin")
    WebElement EmailInput;

    @FindBy(id = "ctl00_CPHContainer_txtPassword")
    WebElement PassInput;

    @FindBy(id = "ctl00_CPHContainer_btnLoginn")
    WebElement SubmitLoginBtn;

    @FindBy(id = "ctl00_CPHContainer_lblOutput")
    public WebElement validationMessage;

    public void invalidLogin(String Email, String Password)
    {
        SetElementText(EmailInput,Email);
        SetElementText(PassInput,Password);
        ClickButton(SubmitLoginBtn);
    }
}
