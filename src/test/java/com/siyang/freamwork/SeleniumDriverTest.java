package com.siyang.freamwork;

import org.testng.annotations.Test;

public class SeleniumDriverTest extends SeleniumDriver {

  @Test
    public void OpenBrowser()  {
       SeleniumDriver.open("chrome11");
       SeleniumDriver.closedAll();

  }
}
