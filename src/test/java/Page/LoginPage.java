package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;


public class LoginPage {

    @FindBy(name = "login")
//    public TextInput userName;
    public WebElement userName;

    @FindBy(name="passwd")
    public  WebElement password;

    @FindBy(className="passport-Button-Text")
    public TextInput login;

    public LoginPage(WebDriver driver) {
        HtmlElementLoader.populatePageObject(this, driver);
    }



    public void setUserName(String strUserName){
        userName.sendKeys(strUserName);
    }

    //Set password in password textbox
    public void setPassword(String strPassword){
        password.sendKeys(strPassword);
    }
    //Click on login button
    public void clickLogin(){
        login.click();
    }

}
