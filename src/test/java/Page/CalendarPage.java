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
public class CalendarPage {

    @FindBy(xpath = "//div[@id='gb']/descendant::a[@class='gb_b gb_hc']")
    private WebElement play;
    @FindBy(xpath = "//a[@id='gb24']")
    private WebElement cal;
    @FindBy(xpath = "//div[@id='drawerMiniMonthNavigator']")
    private List<WebElement> navigator;

    @FindBy(xpath = "//span[@jsname='B1A7Xe']")
    private WebElement temp;

    @FindBy(xpath = "//span[@jsname='B1A7Xe']")
    private WebElement mounth;

    @FindBy(xpath = "//html//div[@id='drawerMiniMonthNavigator']//div[2]/content[1]/span[1]")
    private WebElement nextTo;
    @FindBy(xpath = "//div[@id='drawerMiniMonthNavigator']/descendant::span[@data-date='20180509']")
    private WebElement day;

    public CalendarPage(WebDriver driver) {
        HtmlElementLoader.populatePageObject(this, driver);
    }

    public void clickPlay() {
        play.click();
    }

    public void clickCal() {
        cal.click();
    }
    public void getSpecialMounth() {
        while (!mounth.getText().equals("Май 2018") ) {
            nextTo.click();
        }
    }
    public  void clickday(){
        day.click();
    }


}


