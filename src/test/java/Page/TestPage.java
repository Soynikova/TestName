package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

import java.util.List;

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
    @FindBy (xpath="//a[@id='gb24']")
    public WebElement cal;
    @FindBy (xpath="//div[@id='drawerMiniMonthNavigator']")
    public List<WebElement> navigator;

    @FindBy (xpath="//span[@jsname='B1A7Xe']")
    public WebElement temp;






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
    public void clickCal(){cal.click();
    }
    public void calendarClick() {
        List<WebElement> allDates = navigator;

        if(temp.getText() != "tetete") {
            
            WebElement temp2;
        }

        for (WebElement ele : allDates) {

            String date = ele.getText();

            if (date.equalsIgnoreCase("28")) {
                ele.click();
                break;
            }

        }

    }

    }



