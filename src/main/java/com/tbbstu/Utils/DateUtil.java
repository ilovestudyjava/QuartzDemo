package com.tbbstu.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : 柠檬呀
 * @version ：1.0
 * @date : 2022/6/4 15:15:42
 */
public class DateUtil {

    public static String getDateTimeFormat(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sdf.format(new Date());
        return dateTime;
    }
}
