package com.saurabhSeleniumAuto.base;

import com.saurabhSeleniumAuto.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToAllTest {
     // Start the driver
    // Down the driver

    @BeforeMethod
    public void setup(){
        DriverManager.init();
    }

    @AfterMethod
    public void tearDown(){
        DriverManager.down();
    }


}
