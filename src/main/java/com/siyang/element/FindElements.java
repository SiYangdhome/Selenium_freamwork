package com.siyang.element;

import com.siyang.freamwork.SeleniumDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FindElements extends SeleniumDriver{



    public static List<WebElement> findlist(By by){
       List<WebElement> elements = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
        }catch (Exception e){
            e.printStackTrace();
        }

        elements = driver.findElements(by);

        return elements;

    }
}
