package test;

import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static utils.Utilities.generateRandomString;
import static utils.Utilities.readFromThisFile;

public class Tests01_RegistrationAndLogin_Mobile extends BaseTest{
    String randomString1=generateRandomString();



    @Test
    public void test01() throws InterruptedException, ParserConfigurationException, IOException, SAXException {
        registrationPage_Step1_InsertEmail.closeMobilePopup();
        homePage.navigateToRegistrationPage();
        registrationPage_Step1_InsertEmail.select_Register_By_Email();
        openChromeAndSwitchToWebView();
     //   backToBuyMeAPP();
    //    registrationPage_Step1_InsertEmail.sendKeys_Email_Field(randomString1);
        //   returnToChromeWithoutNewSession();
    }

//    @Test
//    public void test02(){
//    }
}
