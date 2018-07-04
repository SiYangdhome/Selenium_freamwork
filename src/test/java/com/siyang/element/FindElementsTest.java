package com.siyang.element;

import com.siyang.freamwork.SeleniumDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FindElementsTest extends SeleniumDriver{



    @Test
    public void findlist(){
        SeleniumDriver.open("chrome");
        driver.get("https://www.baidu.com/");
        List<WebElement> elements = FindElements.findlist(By.xpath("//*[@id=\"u1\"]/a"));
        String text = elements.get(1).getText();
        System.out.println(text);
        Assert.assertEquals(text,"hao123");
        SeleniumDriver.closed();
    }
}
