package Page;

import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

@lombok.Getter
public class LoginPage {

    @FindBy(name = "login")
    private WebElement userName;

    @FindBy(name="passwd")
    private  WebElement password;

    @FindBy(className="passport-Button-Text")
    private TextInput login;

    public LoginPage(WebDriver driver) {
        HtmlElementLoader.populatePageObject(this, driver);
    }
    public void setValueUserName(String strUserName){
        userName.sendKeys(strUserName);
    }
    //Set password in password textbox
    public void setValuePassword(String strPassword){
        password.sendKeys(strPassword);
    }
    //Click on login button
    public void clickLogin(){
        login.click();
    }

}
