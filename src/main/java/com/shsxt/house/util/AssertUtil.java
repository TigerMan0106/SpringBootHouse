package com.shsxt.house.util;

import com.shsxt.house.exception.ParamsException;

public class AssertUtil {
    public static void isTrue(boolean flag,String msg){
        if (flag){
            throw new ParamsException(msg);
        }
    }
}
