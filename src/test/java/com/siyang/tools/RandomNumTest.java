package com.siyang.tools;

import org.testng.annotations.Test;

public class RandomNumTest {

    @Test
    public void GetNumTest(){
      RandomNum.GetRandomNum(5);
    }

    @Test
    public void GetNumTest1(){
        RandomNum.GetRandomNum(5,15);
    }



}
