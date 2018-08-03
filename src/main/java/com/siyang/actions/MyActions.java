package com.siyang.actions;

import com.siyang.element.FindElement;
import com.siyang.element.FindElements;
import com.siyang.log4j.LoggerControler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;


public class MyActions {

    final static LoggerControler log = LoggerControler.getloggerTest(MyActions.class);
    //点击方法
    public static void click(By by){

      FindElement.find(by).click();

      log.info("点击：" + by);

    }

    //文本框输入方法
    public static void sendtext(By by,String text){

      WebElement element = FindElement.find(by);
      element.clear();
      element.sendKeys(text);
      log.info("在文本框输入：" + text);

    }

    //Get方法的封装
    public static void geturl(WebDriver driver,String url){

        driver.get(url);
        log.info("获取的网址：" + url);
    }
    //获取文本方法封装
    public static String GetText(By by){
        String text = FindElement.find(by).getText();
        log.info("获取的文本：" + text);
        return text;

    }

    //获取多个文本
    public static ArrayList GetTexts(By by){
        ArrayList arrayList = new ArrayList();
        List<WebElement> list =  FindElements.findlist(by);
        for (int i=0;i<list.size();i++){
            String text = list.get(i).getText();
            arrayList.add(text);
            log.info("获取的文本："+ text);
        }

        return arrayList;
    }

    //双击封装
    public static void doubleClick(WebDriver driver,By by){
        Actions actions = new Actions(driver);
        WebElement element = FindElement.find(by);
        actions.doubleClick(element).perform();
    }
}
