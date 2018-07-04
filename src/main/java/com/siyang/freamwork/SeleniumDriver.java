package com.siyang.freamwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDriver {

    public static WebDriver driver;

    //打开浏览器（封装）
    public static WebDriver open(String browser){

        // 获取当前工程根目录
        String path = System.getProperty("user.dir");


        if(browser.equals("chrome")){
            //设置driver路径
            System.setProperty("webdriver.chrome.driver",path +"/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browser.equals("ie")){
            System.setProperty("webdriver.ie.driver",path +"/drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }else if (browser.equals("firefox")){
            driver = new FirefoxDriver();
        }else
            System.out.println("输入浏览器名称有误： "+browser);

        return driver;
    }

    //关闭浏览器
    public static void closed(){
        driver.quit();
    }
}
