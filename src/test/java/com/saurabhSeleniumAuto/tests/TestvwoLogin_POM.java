package com.saurabhSeleniumAuto.tests;

import com.saurabhSeleniumAuto.pages.pageObjectModel.loginPage_POM;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestvwoLogin_POM {
    @Test
    public void testLoginNegative(){
        WebDriver driver = new ChromeDriver();
        loginPage_POM loginPagePom = new loginPage_POM(driver);
        String errormsgText = loginPagePom.loginTovwoInvalidCred("abc@ght.com","test123");
        Assert.assertEquals(errormsgText,"Your email, password, IP address or location did not match");

        driver.quit();

    }
    @Test
    public void testLoginNegative2(){
        WebDriver driver = new ChromeDriver();
        loginPage_POM loginPagePom = new loginPage_POM(driver);
        String errormsgText = loginPagePom.loginTovwoInvalidCred("aassdsdc@ght.com","123");
        Assert.assertEquals(errormsgText,"Your email, password, IP address or location did not match");

        driver.quit();

    }

}
