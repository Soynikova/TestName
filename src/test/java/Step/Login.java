package Step;

import Page.LoginPage;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Пусть;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    WebDriver driver=null;

    LoginPage loginPage;

//    public Login(WebDriver driver) {
//        loginPage = new LoginPage(driver);
//    }
    @И("^Браузер$")
    public void браузер() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tech\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://passport.yandex.ru/");
    }
    @И("^Логин$")
    public void логин(String name, String password){
       loginPage.setUserName(name);
       loginPage.setPassword(password);
       loginPage.clickLogin();

    }




}
