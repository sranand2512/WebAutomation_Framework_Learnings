package com.saurabhSeleniumAuto.pages.pageFactory;

import com.saurabhSeleniumAuto.base.CommonToAllPage;
import com.saurabhSeleniumAuto.utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

public class loginPage_PF extends CommonToAllPage {
    // It will contain



    WebDriver driver;
    public loginPage_PF(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    // page locators
        @FindBy (id = "login-username")
        private WebElement username;

        @FindBy (id = "login-password")
        private WebElement password;

        @FindBy (id = "js-login-btn")
        private WebElement signinbtn;


        @FindBy (id = "js-notification-box")
        private WebElement errormsg;



    // page actions

    public String loginTovwoInvalidCred() throws FileNotFoundException {

        enterInput(username, PropertyReader.readKey("invalid_username"));
        enterInput(password, PropertyReader.readKey("invalid_pass"));
        clickElement(signinbtn);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        WebElement error_msg = driver.findElement(errormsg);
//        String errormsgText = error_msg.getText();
//        System.out.println(error_msg.getText());
//        System.out.println(errormsgText);

        return errormsg.getText();

    }
}
