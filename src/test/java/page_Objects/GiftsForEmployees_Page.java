package page_Objects;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GiftsForEmployees_Page extends BasePage {
    public GiftsForEmployees_Page(AndroidDriver driver) {
        super(driver);
    }

    //Elements
    private By joinNowButton=By.id("//button[text()='הצטרפו עכשיו!']");
    private By employeesAmountField=By.id("input[name=\"employeesAmount\"]");

    //methods
    @Step("Click - \"join now\" - button")
    public GiftsForEmployees_Page clickJoinNowButton(){
        click(joinNowButton);
        return this;
    }

    @Step
    public boolean isEmployeesAmountFieldISDisplayed(){
        return isElementDisplayed(employeesAmountField);
    }




}
