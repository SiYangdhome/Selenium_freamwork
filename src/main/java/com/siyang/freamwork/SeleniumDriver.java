
package com.siyang.freamwork;


import com.siyang.log4j.LoggerControler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDriver {

     final static LoggerControler log = LoggerControler.getlogger(SeleniumDriver.class);

    public static WebDriver driver;

    // 封装启动浏览器方法
    public static WebDriver open(String browser){

        String path = System.getProperty("user.dir");
        if (browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver",path + "\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browser.equals("ie")){
            System.setProperty("webdriver.ie.driver",path + "\\drivers\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }else if (browser.equals("firefox")){
            driver = new FirefoxDriver();//火狐浏览器为47版本以下，如果为47版本以上需要设置driver路径
        }else{
            log.error("输入浏览器名称有误" + browser);
        }

        return driver;
    }


    //封装关闭浏览器方法
    public static void closedAll(){
        driver.quit();
    }

    //封装关闭浏览器当前窗口
    public static void closed(){
        driver.close();
    }


}