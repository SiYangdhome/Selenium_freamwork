package com.siyang.log4jTest;

import com.siyang.log4j.LoggerControler;
import org.testng.annotations.Test;

public class logTest {


      final static LoggerControler log =  LoggerControler.getloggerTest(logTest.class);

     @Test
    public void logcaseTest(){
         log.info("这是info日志");
         log.debug("这是debug日志");
         log.error("这是error日志");
     }

}
