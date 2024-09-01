package com.saurabhSeleniumAuto.tests;

import com.saurabhSeleniumAuto.pages.pageFactory.loginPage_PF;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static org.testng.TestNGAntTask.Mode.junit;

public class TestvwoLogin_PF {
    @Test
    public void testLoginNegative() throws FileNotFoundException {
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://app.vwo.com");
        loginPage_PF loginPagePF = new loginPage_PF(driver);
        String errormsgText = loginPagePF.loginTovwoInvalidCred();
        Assert.assertEquals(errormsgText,"Your email, password, IP address or location did not match");

        driver.quit();

    }

}
