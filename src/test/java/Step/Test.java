package Step;

import Page.LoginPage;
import Page.TestPage;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Пусть;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@org.testng.annotations.Test
public class Test {
    WebDriver driver;

    TestPage testPage;

    public Test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tech\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        testPage = new TestPage(driver);
    }


    public void browser() throws Throwable {

        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/ServiceLogin/identifier?hl=ru&passive=true&continue=https%3A%2F%2Fwww.google.ru%2F&flowName=GlifWebSignIn&flowEntry=AddSession");
    }

    public void log(){
        testPage.setValueUserName("89040881145");
        testPage.clickLogin();
        testPage.setValuePassword("Fbe4NB6a");
        testPage.clickNext();
        testPage.clickPlay();


    }






}
