
package page_Objects;


import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegistrationPage_Step2_InsertCode extends BasePage {

    //constructor
    public RegistrationPage_Step2_InsertCode(AndroidDriver driver){
        super(driver);
    }

    //elements

    private By otpCode_Field_Location=By.id("edit_text");
    private By verifyEmail_OtpCode_Button=By.id("enterButton");///button appears in registration process
    private By verifySMS_OtpCode_Button=By.id("button[gtm=\"שלחו לי קוד אימות\"]");
    private By enter_Button_After_Get_Code=By.id("enterButton");  ///button appears in login process


    // =============== Actions =====================
    // =============================================


    @Step("Send keys '{otpCode}' on {otpCode_Field_Location}")
    public RegistrationPage_Step2_InsertCode send_OtpCode(String otpCode){
        sendKeys(otpCode_Field_Location,otpCode);
        return this;
    }

    @Step("Verify Otp code -click verify SMS ")
    public RegistrationPage_Step2_InsertCode verify_SMS_OtpCode(){
        click(verifySMS_OtpCode_Button);
        return this;
    }

    @Step("Click Enter ")
    public RegistrationPage_Step2_InsertCode clickEnter_AfterRegisterProcess(){
        click(verifyEmail_OtpCode_Button);
        return this;
    }

    @Step("Click Enter ")
    public RegistrationPage_Step2_InsertCode clickEnter_AfterLoginProcess(){
        click(enter_Button_After_Get_Code);
        return this;
    }














}
