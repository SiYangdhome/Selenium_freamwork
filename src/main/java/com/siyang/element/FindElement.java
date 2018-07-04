package com.siyang.element;

import com.siyang.freamwork.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class FindElement extends SeleniumDriver{


    // 封装findelement
    public static WebElement find(By by){

        try{
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
        }catch (Exception e){
            e.printStackTrace();
        }
        return driver.findElement(by);

    }
}
