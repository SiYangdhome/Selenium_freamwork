package com.siyang.tools;

import com.siyang.log4j.LoggerControler;

import java.util.Random;

public class RandomNum {

    final static LoggerControler log = LoggerControler.getloggerTest(RandomNum.class);

    //封装生成N位随机数

    public static String GetRandomNum(int length){

        String num  = "";

        // random() 生成一个【0,1）之间的随机数,(取整数部分，按输入参数确定保留几位整数）

        num =String.valueOf((long)(Math.random()*Math.pow(10,length)));
        log.info(num);

        return num;
    }


    //生成一个值到另一个值之间的数，如：【1,20）

    public static int GetRandomNum(int min,int max){
        int num = 0;
        // 实例化random类，调用random中nextInt方法，nextInt（10）：生成【1,10）之间的随机数
        Random random = new Random();
        num = random.nextInt(max-min+1)+min;
        log.info(num);
        return num;
    }




}
