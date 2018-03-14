package Step;

import Page.LoginPage;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Пусть;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    WebDriver driver;

    LoginPage loginPage;



    @И("^Браузер$")
    public void браузер() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ekaterina\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);

        driver.manage().window().maximize();
        driver.get("https://passport.yandex.ru/");
    }
    @И("^Логин с юзером \"([^\"]*)\" и логином \"([^\"]*)\"$")
    public void логинСЮзеромИЛогином(String name, String password){
       loginPage.setUserName(name);
       loginPage.setPassword(password);
       loginPage.clickLogin();

    }




}
