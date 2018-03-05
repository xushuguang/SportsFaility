package com.james.utils;

import java.util.Random;

/**
 * User: 57140
 * Date: 2018/3/4
 * Time: 15:27
 * Version:V1.0
 */
public class AuthCodeUtil {
    public static  String getCode(String sources){
        StringBuffer flag = null;
        for (int i = 0; i <= 100; i++)
        {
            Random rand = new Random();
            flag = new StringBuffer();
            for (int j = 0; j < 6; j++)
            {
                flag.append(sources.charAt(rand.nextInt(9)) + "");
            }
        }
        return flag.toString();
    }
}

