package Step;

import Step.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver=null;
    Login login;


    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ekaterina\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //login= new Login(driver);
        driver.manage().window().maximize();
        driver.get("https://passport.yandex.ru/");

    }

    @Test
      public void  loginTest(){
        setup();
        //login.logIn("jdhfdkjhf", "jfdjkg");
    }






}
