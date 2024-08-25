package com.saurabhSeleniumAuto.tests;

import com.saurabhSeleniumAuto.base.CommonToAllTest;
import com.saurabhSeleniumAuto.pages.pageFactory.loginPage_PF;
import junit.framework.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static com.saurabhSeleniumAuto.driver.DriverManager.driver;

public class TestvwoLogin_PF_DM_QA extends CommonToAllTest {

    private static final Logger logger = LogManager.getLogger(TestvwoLogin_PF_DM_QA.class);
    @Test
    public void testLoginNegative() throws FileNotFoundException {
        logger.info("Starting Test in QA");
        loginPage_PF loginPagePF = new loginPage_PF(driver);
        logger.info("Opening  QA url");
        loginPagePF.openVWOLoginURL("qa_url");
        logger.info("Login with invalid cred");
        String errormsgText = loginPagePF.loginTovwoInvalidCred();
        logger.info("Validating");
        Assert.assertEquals(errormsgText,"Your email, password, IP address or location did not match");

        driver.quit();

    }

}
