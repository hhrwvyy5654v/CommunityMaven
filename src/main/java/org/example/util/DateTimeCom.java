package org.example.util;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * @Project: CommunityMaven
 * @Package: org.example.util
 * @ClassName: DateTimeCom
 * @Datetime: 2023/05/26 15:05
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */

public class DateTimeCom {
    //计算两个日期之间的天数差
    public static long getBetweenDay(LocalDate start, LocalDate end) {
        return end.toEpochDay() - start.toEpochDay();
    }

    //计算指定日期到今天的天数
    public static long getBetweenDay(Date jzsj) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(jzsj); //放入Date类型数据
        int year = calendar.get(Calendar.YEAR);   //获取年份
        int month = calendar.get(Calendar.MONTH); //获取月份
        int day = calendar.get(Calendar.DATE);   //获取日期
        LocalDate start = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();  //获取当前日期
        return getBetweenDay(start, now);    //返回计算的两个日期之间的天数
    }

    /*
     * 通过时间秒毫秒数判断两个时间的间隔
     * @param date1  截至时间
     * @param date2 当前时间
     * @return
     */
    public static int getBetweenDay(Date date1, Date date2) {
        int days = (int) ((date2.getTime() - date1.getTime())) / (1000 * 3600 * 24);
        return days;
    }

}

