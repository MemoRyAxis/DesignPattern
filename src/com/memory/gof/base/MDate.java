package com.memory.gof.base;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author MemoRyAxis
 * @todo Date
 * @date 2014/8/20 10:21
 */
public class MDate {

    public static String getFormatDate(String format) {
        return new SimpleDateFormat(format).format(new Date());
    }
}
