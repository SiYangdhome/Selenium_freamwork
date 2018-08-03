package com.siyang.actions;

import com.siyang.freamwork.SeleniumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class MyActionsTest extends SeleniumDriver{



    @Test
    public void ClickTest(){
        SeleniumDriver.open("chrome");
        driver.get("https://www.baidu.com/");
        MyActions.click(By.linkText("新闻"));
        SeleniumDriver.closed();

    }

    @Test
    public void OpenUrlTest(){
        SeleniumDriver.open("chrome");
        MyActions.geturl(driver,"https://www.baidu.com/");
        SeleniumDriver.closed();
    }

    @Test
    public void SendTextTest(){
        SeleniumDriver.open("chrome");
        MyActions.geturl(driver,"https://www.baidu.com/");
        MyActions.sendtext(By.id("kw"),"小土科技");
        MyActions.click(By.id("su"));
        SeleniumDriver.closed();

    }

    @Test
    public void GetTextTest(){
        SeleniumDriver.open("chrome");
        MyActions.geturl(driver,"https://www.baidu.com/");
        String text = MyActions.GetText(By.linkText("新闻"));
        Assert.assertEquals(text,"新闻");
        SeleniumDriver.closed();
    }

    @Test
    public void GetTextsTest(){
        SeleniumDriver.open("chrome");
        MyActions.geturl(driver,"https://www.baidu.com/");
        ArrayList  list = MyActions.GetTexts(By.xpath(".//*[@id='u1']/a"));
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        SeleniumDriver.closed();

    }

    @Test
    public void DoubleClickTest(){
        SeleniumDriver.open("chrome");
        MyActions.geturl(driver,"https://www.baidu.com/");
        MyActions.doubleClick(driver,By.id("su"));
        SeleniumDriver.closed();
    }
}
