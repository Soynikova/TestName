package Step;

import Page.CalendarPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
public class CalendarTest {
    WebDriver driver;
    GoogleCalendar googleCalendar;
    GoogleLogin googleLogin;

    public CalendarTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tech\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        googleCalendar = new GoogleCalendar(driver);
        googleLogin = new GoogleLogin(driver);
    }

    public void browser() throws Throwable {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://accounts.google.com/ServiceLogin/identifier?hl=ru&passive=true&continue=https%3A%2F%2Fwww.google.ru%2F&flowName=GlifWebSignIn&flowEntry=AddSession");

    }

    @Test
    public void Calendar() throws Throwable {
        browser();
        googleLogin.logIn("89040881145","Fbe4NB6a");
        googleCalendar.goToCalendar();
        googleCalendar.getSpecialDay();

    }

}







