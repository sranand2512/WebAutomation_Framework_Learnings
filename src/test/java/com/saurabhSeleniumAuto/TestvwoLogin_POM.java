package com.saurabhSeleniumAuto;

import com.saurabhSeleniumAuto.pageObjectModel_Pages.loginPage_POM;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestvwoLogin_POM {
    @Test
    public void testLoginNegative(){
        WebDriver driver = new EdgeDriver();
        loginPage_POM loginPagePom = new loginPage_POM(driver);
        String errormsgText = loginPagePom.loginTovwoInvalidCred("abc@ght.com","test123");
        Assert.assertEquals(errormsgText,"Your email, password, IP address or location did not match");

        driver.quit();

    }
}
