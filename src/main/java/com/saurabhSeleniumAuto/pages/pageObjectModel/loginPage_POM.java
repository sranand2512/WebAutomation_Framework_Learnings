package com.saurabhSeleniumAuto.pages.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage_POM {
    // It will contain
    // page locators

    WebDriver driver;
    public loginPage_POM(WebDriver driver){
        this.driver = driver;

    }
        private By username = By.id("login-username");
        private By password = By.id("login-password");
        private By signbtn = By.id("js-login-btn");
        private By errormsg = By.id("js-notification-box");



    // page actions

    public String loginTovwoInvalidCred(String user, String pwd){
        driver.navigate().to("https://app.vwo.com");
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signbtn).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_msg = driver.findElement(errormsg);
        String errormsgText = error_msg.getText();
        System.out.println(error_msg.getText());
        System.out.println(errormsgText);

        return errormsgText;

    }
}
