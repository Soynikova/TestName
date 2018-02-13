import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestUtils {
@Test
    public void driver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tech\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }
 public void Login(){
    
 }


}
