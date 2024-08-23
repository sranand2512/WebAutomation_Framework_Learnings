package com.saurabhSeleniumAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class vwoLoginNegative {
    @Test
    public void testvwoLoginNegative(){

       WebDriver driver = new EdgeDriver();
       driver.get("https://app.vwo.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       Assert.assertEquals(driver.getTitle(), "Login - VWO");
       Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");



        driver.findElement(By.id("login-username")).sendKeys("abc@123.com");
        driver.findElement(By.id("login-password")).sendKeys("test123");
        driver.findElement(By.id("js-login-btn")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_msg = driver.findElement(By.id("js-notification-box"));
        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");
        System.out.println(error_msg.getText());


        driver.quit();

    }


}
