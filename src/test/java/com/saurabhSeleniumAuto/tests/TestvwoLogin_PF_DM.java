package com.saurabhSeleniumAuto.tests;

import com.saurabhSeleniumAuto.base.CommonToAllTest;
import com.saurabhSeleniumAuto.pages.pageFactory.loginPage_PF;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.saurabhSeleniumAuto.driver.DriverManager.driver;

public class TestvwoLogin_PF_DM extends CommonToAllTest {

    private static final Logger logger = LogManager.getLogger(TestvwoLogin_PF_DM.class);
    @Test
    public void testLoginNegative() throws FileNotFoundException {
        logger.info("Starting Test");
        loginPage_PF loginPagePF = new loginPage_PF(driver);
        logger.info("Opening url");
        loginPagePF.openVWOLoginURL("url");
        logger.info("Loggin with invalid cred");
        String errormsgText = loginPagePF.loginTovwoInvalidCred();
        logger.info("Validating");
        Assert.assertEquals(errormsgText,"Your email, password, IP address or location did not match");

        driver.quit();

    }

}
