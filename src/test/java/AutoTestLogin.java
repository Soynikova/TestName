import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoTestLogin {
    WebDriver driver;
    AutoTest objLogin;

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tech\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.avito.ru/belgorod");

    }
@Test
    public void  test1() {
    objLogin = new AutoTest(driver);
    objLogin.login

    }






}
