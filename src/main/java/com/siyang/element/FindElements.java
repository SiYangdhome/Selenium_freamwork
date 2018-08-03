package com.siyang.element;

import com.siyang.freamwork.SeleniumDriver;
import com.siyang.log4j.LoggerControler;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FindElements extends SeleniumDriver{

    final static LoggerControler log = LoggerControler.getloggerTest(FindElements.class);

    public static List<WebElement> findlist(By by){
       List<WebElement> elements = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
        }catch (Exception e){
            e.printStackTrace();
        }

        elements = driver.findElements(by);
        log.info("通过：" +by + "定位");

        return elements;


    }
}
