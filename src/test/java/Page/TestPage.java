package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;
@Test
public class TestPage {
    @FindBy(id="identifierId")
    public  WebElement userName;

    @FindBy(xpath = "//div[@id='identifierNext']")
    public WebElement loginButton;

    @FindBy (xpath="//div[@id='password']/descendant::input[@name='password']")
    public WebElement password;

    @FindBy (id="passwordNext")
    public WebElement next;

    @FindBy (xpath = "//a[@class='gb_b gb_gc']")
    public WebElement play;





    public TestPage(WebDriver driver) {
        HtmlElementLoader.populatePageObject(this, driver);
    }
    public void setValueUserName(String strUserName){
        userName.sendKeys(strUserName);
    }
    public void setValuePassword(String strPassword){
        password.sendKeys(strPassword);
    }
    public void clickLogin(){
        loginButton.click();
    }
    public void clickNext(){
        next.click();
    }
    public void clickPlay(){
        play.click();
    }

}



