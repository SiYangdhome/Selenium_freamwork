package com.siyang.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoggerControler {

    private static Logger logger = null;
    private static LoggerControler logg = null;

    public static LoggerControler getloggerTest(Class<?> T){
        if (logger == null){
    // 实例化Properties类，为了处理 .properties格式的文件
            Properties pro = new Properties();
            try{
               String path = System.getProperty("user.dir");
               String filepath = path + "/config/Log4j.properties";
               InputStream is = new FileInputStream(filepath);
               pro.load(is);
            }catch (IOException e){
                e.printStackTrace();
            }
            PropertyConfigurator.configure(pro);
            logger = Logger.getLogger(T);
            logg = new LoggerControler();
        }
        return logg;

    }

    public void info(Object msg){
        logger.info(msg);
    }


    public void debug(Object msg){
        logger.debug(msg);
    }

    public void warn(Object msg){
        logger.warn(msg);
    }

    public void error(Object msg){
        logger.error(msg);
    }
}
