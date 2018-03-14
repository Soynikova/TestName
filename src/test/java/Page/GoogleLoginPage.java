package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleLoginPage {
    @FindBy(id = "identifierId")
    public WebElement userName;

    @FindBy(xpath = "//div[@id='identifierNext']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@id='password']/descendant::input[@name='password']")
    public WebElement password;

    @FindBy(id = "passwordNext")
    public WebElement next;

    public void setValueUserName(String strUserName) {
        userName.sendKeys(strUserName);
    }

    public void setValuePassword(String strPassword) {
        password.sendKeys(strPassword);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void clickNext() {
        next.click();
    }
}
