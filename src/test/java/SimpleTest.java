import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SimpleTest {

//    public void chromepath () {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tech\\Desktop\\chromedriver_win32\\chromedriver.exe");
//    }
//    public static WebDriver driver = new ChromeDriver();

//    @AfterClass
//    public void close() {
//        driver.quit();
//    }

   @Test
    public void test() throws Exception{
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tech\\Desktop\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://passport.yandex.ru/");
       WebElement  login = driver.findElement(By.name("login"));
       login.sendKeys("ekaterina.soinickova@yandex.ru");
       WebElement pass =driver.findElement(By.name("passwd"));
       pass.sendKeys("Soinikova1994");
       WebElement button = driver.findElement(By.className("passport-Button-Text"));
       button.click();
       driver.get("https://mail.yandex.ru/");
       Thread.sleep(8000);
       WebElement element = driver.findElement(By.xpath("//*[@href='#compose']"));
       element.click();
      Thread.sleep(8000);
      WebElement to = driver.findElement(By.xpath("//div[@name='to']"));
      //to.click();
      to.sendKeys("5684375");


    }}
