package Step;

import Page.GoogleLoginPage;
import org.openqa.selenium.WebDriver;

public class GoogleLogin {
    GoogleLoginPage googleLoginPage;

    public GoogleLogin(WebDriver driver) {
        googleLoginPage=new GoogleLoginPage();
    }
    public void logIn(String name, String password){
        googleLoginPage.setValueUserName(name);
        googleLoginPage.clickLogin();
        googleLoginPage.setValuePassword(password);
        googleLoginPage.clickNext();
    }



}
