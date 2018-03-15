package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class GoogleLoginPage {

    @FindBy(id = "identifierId")
    public WebElement userName;

    @FindBy(xpath = "//div[@id='identifierNext']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@id='password']/descendant::input[@name='password']")
    public WebElement password;

    @FindBy(id = "passwordNext")
    public Button next;

    public GoogleLoginPage(WebDriver driver) {

        HtmlElementLoader.populatePageObject(this, driver);
    }

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
