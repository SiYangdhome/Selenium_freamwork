package com.siyang.element;

import com.siyang.freamwork.SeleniumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindElementTest extends SeleniumDriver {

    @Test
    public void Find(){
        SeleniumDriver.open("chrome");
        driver.get("file:///C:/Users/Administrator/Desktop/index.html");
        FindElement.find(By.className("wait")).click();
        String text = FindElement.find(By.className("red")).getText();
        Assert.assertEquals(text,"wait for display");
        SeleniumDriver.closed();
    }
}
