package cn.intellif.springelastijob1.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BeanUtils {
    public static String getCurrentTime(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(new Date());
    }

}
