import org.openqa.selenium.WebDriver;

public class Login {

    LoginPage loginPage;

    public Login(WebDriver driver) {
        loginPage = new LoginPage(driver);
    }

    public void logIn(String name, String password){
       loginPage.setUserName("ruii");
       loginPage.setPassword("rf");
       loginPage.clickLogin();


    }




}
