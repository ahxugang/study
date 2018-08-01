package com.geoffrey.util;

/**
 * @author xug
 * @date 2018-08-01
 */
public class StringUtils {

    public static boolean isBlank(String str) {
        if(str != null && "".equals(str.trim())) {
            return false;
        } else {
            return true;
        }
    }
}
