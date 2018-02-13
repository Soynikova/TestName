import jdk.internal.util.xml.impl.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import static ru.yandex.qatools.htmlelements.element.HtmlElement.*;


public class AutoTest {

    WebDriver driver;
    By userName = By.name("login");
    By password = By.name("passwd");
    By login = By.className("passport-Button-Text");

    @FindBy(name = "")
    public Input



    public AutoTest(WebDriver driver){
        this.driver = driver;
    }
    public void setUserName(String strUserName){
        driver.findElement(userName).sendKeys(strUserName);
    }

    //Set password in password textbox
    public void setPassword(String strPassword){
        driver.findElement(password).sendKeys(strPassword);
    }

    //Click on login button
    public void clickLogin(){
        driver.findElement(login).click();
    }

}
