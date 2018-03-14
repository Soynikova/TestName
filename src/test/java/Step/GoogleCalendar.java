package Step;

import Page.CalendarPage;
import org.openqa.selenium.WebDriver;

public class GoogleCalendar {
    CalendarPage calendarPage;

    public GoogleCalendar(WebDriver driver) {
        calendarPage = new CalendarPage(driver);
    }

    public void goToCalendar(){
        calendarPage.clickPlay();
        calendarPage.clickCal();

    }
    public void getSpecialDay(){
        calendarPage.getSpecialMounth();
        calendarPage.clickday();

    }


}
