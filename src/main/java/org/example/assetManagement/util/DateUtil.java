package org.example.assetManagement.util;


import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Slf4j
public class DateUtil {

    public static String formatAddDate(String date, Integer day) throws ParseException  {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        Calendar c = Calendar.getInstance();
        c.setTime(df.parse(date));
        c.add(Calendar.DATE, day);
        Date m = c.getTime();
        return df.format(m);
    }
    /**
     * 给定一个日期判断星期几
     * @param d
     * @return
     */
    public static String getWeekStr(String d) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        try {
            Date date = sdf.parse(d);
            Calendar cal = Calendar.getInstance();
            if(date!=null) {cal.setTime(date);}
            int week  = cal.get(Calendar.DAY_OF_WEEK);
            switch (week) {
                case 1:
                    return "星期日";
                case 2:
                    return "星期一";
                case 3:
                    return "星期二";
                case 4:
                    return "星期三";
                case 5:
                    return "星期四";
                case 6:
                    return "星期五";
                case 7:
                    return "星期六";
                default:
                    throw new IllegalStateException("Unexpected value: " + week);
            }
        } catch (Exception e) {
            log.error("getWeekStr:{}",e);
        }

        return "";
    }

    /**
     * 输入需要增加的天数  返回增加天数的日期
     *
     * @param day
     * @return
     */
    public static String getAfterDate(int day) {
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, day);
        return sf.format(c.getTime());
    }

    /**
     * 得到几天前的时间
     *  
     *
     * @param d
     * @param day
     * @return
     */
    public static String getDateBefore(String d, int day) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            Date date = simpleDateFormat.parse(d);
            Calendar no = Calendar.getInstance();
            no.setTime(date);
            no.set(Calendar.DATE, no.get(Calendar.DATE) - day);
            return simpleDateFormat.format(no.getTime());
        } catch (Exception e) {
            return null;
        }
    }


    /**
     * 时间转换
     */
    public static Date stringToDate(String date) {
        Date parse = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            parse = simpleDateFormat.parse(date);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return parse;
    }

    /**
     * 时间转换
     */
    public static Date stringToDate2(String date) {
        Date parse = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            parse = simpleDateFormat.parse(date);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return parse;
    }

    /**
     * 时间转换
     */
    public static Date stringToTime(String time) {
        Date parse = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HHmmss");
            parse = simpleDateFormat.parse(time);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return parse;
    }



    /**
     * 获取现在时间，yyyy-MM-dd HH:mm:ss格式
     *
     * @return
     */
    public static String formatCurrentDateTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(new Date());
    }

    /**
     * 获取现在日期，yyyy-MM-dd格式
     *
     * @return
     */
    public static String formatCurrentDate() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return df.format(new Date());
    }

    /**
     * 获取现在时间，HHmmss格式
     *
     * @return
     */
    public static String formatCurrentTime() {
        SimpleDateFormat df = new SimpleDateFormat("HHmmss");
        return df.format(new Date());
    }

    /**
     * 获取现在时间，yyyyMMddHHmmss格式
     *
     * @return
     */
    public static Long formatCurrentDateTimeLong() {
        return Long.valueOf(formatCurrentDateTime());
    }

    /**
     * 获取几个月的时间，yyyyMMddHHmmss格式
     *
     * @param mouth
     * @return
     */
    public static String formatMaouthDateTime(Integer mouth) {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.MONTH, mouth);
        Date m = c.getTime();
        return df.format(m);
    }

    /**
     * 获取几天的时间，yyyyMMddHHmmss格式
     *
     * @return
     */
    public static String formatAddDateTime(Integer date) {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE, date);
        Date m = c.getTime();
        return df.format(m);
    }

    public static String formatAddDateTime(String dateTime, Integer date) {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE, date);
        Date m = c.getTime();
        return df.format(m);
    }

    /**
     * 获取几分后的时间
     *
     * @param dateTime
     * @param minute
     * @return
     */
    public static String formatAddMinuteTime(String dateTime, Integer minute) {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.MINUTE, minute);
        Date m = c.getTime();
        return df.format(m);
    }

    /**
     * 获取几小时后的时间
     *
     * @param dateTime
     * @param hour
     * @return
     */
    public static String formatAddHourTime(String dateTime, Integer hour) throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar c = Calendar.getInstance();
        c.setTime(df.parse(dateTime));
        c.add(Calendar.HOUR, hour);
        Date m = c.getTime();
        return df.format(m);
    }

    /**
     * 获取本月
     *
     * @return
     */
    public static String formatCurrentMonth() {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMM");
        return df.format(new Date());
    }

    /**
     * Date转字符串
     */
    public static String DateToString(Date d) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(d);
    }


    /**
     * 返回两个时间的时间差，单位秒
     *
     * @param startTime yyyyMMDDHHmmss
     * @param endTime   yyyyMMDDHHmmss
     * @return
     */
    public static long getSecondsBetweenTwoTime(String startTime, String endTime){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

            Date startDateTime = sdf.parse(startTime);
            Date endDateTime = sdf.parse(endTime);
            return endDateTime.getTime() - startDateTime.getTime();
        } catch (Exception e) {
            return 0;
        }

    }

    /**
     * 判断当前日期是否在[startDate, endDate]区间
     *
     * @param startDate 开始日期
     * @param endDate   结束日期
     * @return
     * @author jqlin
     */
    public static boolean isEffectiveDate(Date startDate, Date endDate) {
        if (startDate == null || endDate == null) {
            return false;
        }
        long currentTime = System.currentTimeMillis();
        if (currentTime >= startDate.getTime()
                && currentTime <= endDate.getTime()) {
            return true;
        }
        return false;
    }



    /**
     * 获取一小时后的时间
     *
     * @return
     */
    public static String getOneHoursLater() {
        long curren = System.currentTimeMillis();
        curren += 60 * 60 * 1000 * 2 ;
        Date da = new Date(curren);
        SimpleDateFormat dateFormat = new SimpleDateFormat("HHmmss");
        return dateFormat.format(da);
    }
    /**
     * 获取一小时前的时间
     *
     * @return
     */
    public static String getOneHoursBefour(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date beforDate = null;
        try {
            Date appointdate = dateFormat.parse(date);
            beforDate = new Date(appointdate.getTime()- 3600000);
        } catch (Exception e) {
        }

        return dateFormat.format(beforDate);
    }

    /**
     * 将字符串日期（YYYYMMDD）转换为（YYYY-MM-DD）
     * @param date
     * @return
     */
    public static String formatDate(String date){
        return date.substring(0,4) + "-" + date.substring(4,6) + "-" + date.substring(6,8);
    }

    /**
     * 将字符串时间（HHmmss）转换为（HH:mm:ss）
     * @param time
     * @return
     */
    public static String formatTime(String time){
        System.out.println(time);
        return time.substring(0,2) + ":" + time.substring(2,4) + ":" + time.substring(4,6);
    }

    /**
     * 将字符串日期（YYYYMMDDHHmmss）转换为（YYYY-MM-DD HH:mm:ss）
     * @param datetime
     * @return
     */
    public static String formatDateTime(String datetime){
        return datetime.substring(0,4) + "-" + datetime.substring(4,6) + "-" + datetime.substring(6,8) + " "
           +   datetime.substring(8,10) + ":" + datetime.substring(10,12) + ":" + datetime.substring(12,14);
    }

    /**
     * 将hhmmss日期增加
     * @param addtime 毫秒数
     * @return
     */
    public static String addTime(String time,long addtime) throws Exception{
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
            Date date = sdf.parse(time);
            Date date1 = new Date(date.getTime() + addtime);
            return sdf.format(date1);
        } catch (Exception e) {

        }
       return null;

    }



    /**
     * 当月第一天
     * @return
     */
    public static String getFirstDayOfMonth() {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        Date theDate = calendar.getTime();
        GregorianCalendar gcLast = (GregorianCalendar) Calendar.getInstance();
        gcLast.setTime(theDate);
        gcLast.set(Calendar.DAY_OF_MONTH, 1);
        return df.format(gcLast.getTime());

    }

    /**
     * 当月最后一天
     * @return
     */
    public static String getLastDayOfMonth() {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        Date theDate = calendar.getTime();
        String s = df.format(theDate);
        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DATE, 1);
        calendar.add(Calendar.DATE, -1);
        return df.format(calendar.getTime());
    }


    public static void main(String[] args) {

        try {
            System.out.println(getAfterDate(1));
//            System.out.println(DateUtil.getFirstDayOfMonth());
//            System.out.println(DateUtil.getLastDayOfMonth());
//            System.out.println(addTime("090000", 28800000));
            //String current = DateUtil.formatCurrentDate();
//            System.out.println(DateUtil.formatDate("20200215"));
//            System.out.println(DateUtil.formatTime("100000"));
//            System.out.println(DateUtil.formatDateTime("20200215100000").substring(0,16));
//
//            System.out.println(DateUtil.getOneHoursLater());

           /* String current = DateUtil.formatCurrentDateTime();
            System.out.println("current=" + current);
            String now1 = DateUtil.formatAddHourTime(current, 4);
            System.out.println("now=" + now1);

            System.out.println("current=20190915183907");
            String now2 = DateUtil.formatAddHourTime("20190915183907", 4);
            System.out.println("now=" + now2);

            System.out.println("current=20190915233907");
            String now3 = DateUtil.formatAddHourTime("20190915233907", 4);
            System.out.println("now=" + now3);*/


            //DateUtil.getOneHoursLater();
        } catch (Exception e) {
            log.error("DateUtil-main:{}",e.getMessage());
        }

    }

}
