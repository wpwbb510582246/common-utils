package com.grayson.common.util;

import com.grayson.common.constant.Constants;
import com.grayson.common.enums.ExceptionEnums;
import com.grayson.common.exception.ECommerceDataAnalysisPlatformException;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 * @author Grayson
 * @create 2018/10/17 10:26
 */
@Slf4j
public class DateUtils {

    private static Logger logger = LoggerFactory.getLogger(DateUtils.class);

    /**
     * 从时间字符串中获取小时
     * @param date  时间字符串，格式为 : yyyy-MM-dd HH:mm:ss
     * @return  小时
     */

    public static String getHourFromDateWithSeconds(String date) {
        return date.split(" ")[1].split(":")[0];
    }

    /**
     * 从时间字符串中获取年月日
     * @param date  时间字符串，格式为 : yyyy-MM-dd HH:mm:ss
     * @return  年月日
     */

    public static String getYearMonthDayFromDateWithSeconds(String date) {
        return date.split(" ")[0];
    }

    /**
     * 将日期字符串转换为日期对象
     * 字符串日期格式为 : yyyy-MM-dd HH:mm:ss
     * @param date  日期字符串
     * @return  日期对象
     */

    public static Date parseDateWithSeconds(String date) {
            return parseDate(date, Constants.DATE_FORMAT_PATTERN_WITH_SECONDS);
    }

    /**
     * 将日期字符串转换为日期对象
     * 日期字符串格式 : yyyy-MM-dd HH:mm:ss
     * @param date  日期字符串
     * @return  日期对象
     */

    public static Date parseDateDefault(String date) {
        return parseDate(date, Constants.DATE_FORMAT_PATTERN_DEFAULT);
    }

    /**
     * 将指定格式的日期字符串转换为日期对象
     * @param date      日期字符串
     * @param pattern   格式
     * @return  日期对象
     */

    public static Date parseDate(String date, String pattern) {
        try {
            return getDateFormat(pattern).parse(date);
        } catch (ParseException e) {
            logger.error(ExceptionEnums.UNMATCHED_DATE_PATTERN.value(), e);
            throw new ECommerceDataAnalysisPlatformException(ExceptionEnums.UNMATCHED_DATE_PATTERN);
        }
    }

    /**
     * 获取当前日期
     * @return  当前日期
     */

    public static String getTodayDate() {
        return formatDate(new Date(), Constants.DATE_FORMAT_PATTERN_DEFAULT);
    }

    /**
     * 获取指定格式指定日期格式化后的日期字符串
     * 格式为 : yyyyMMddHHmmss
     * @param date  日期
     * @return  格式化后的日期字符串
     */

    public static String formatDateWithSecondsWithoutSeparator(Date date) {
        return formatDate(date, Constants.DATE_FORMAT_PATTERN_WITH_SECONDS_WITHOUT_SEPARATOR);
    }

    /**
     * 获取指定格式指定日期格式化后的日期字符串
     * 格式为 : yyyy-MM-dd HH:mm:ss
     * @param date  日期
     * @return  格式化后的日期字符串
     */

    public static String formatDateWithSeconds(Date date) {
        return formatDate(date, Constants.DATE_FORMAT_PATTERN_WITH_SECONDS);
    }

    /**
     * 获取指定格式指定日期格式化后的日期字符串
     * 格式为 : yyyyMMdd
     * @param date  日期
     * @return  格式化后的日期字符串
     */

    public static String formatDateDefaultWithoutSeparator(Date date) {
        return formatDate(date, Constants.DATE_FORMAT_PATTERN_DEFAULT_WITHOUT_SEPARATOR);
    }

    /**
     * 获取指定格式指定日期格式化后的日期字符串
     * 格式为 : yyyy-MM-dd
     * @param date  日期
     * @return  格式化后的日期字符串
     */

    public static String formatDateDefault(Date date) {
        return formatDate(date, Constants.DATE_FORMAT_PATTERN_DEFAULT);
    }

    /**
     * 获取指定格式指定日期的格式化后的日期字符串
     * @param date      日期
     * @param pattern   格式
     * @return  格式化后的字符串
     */

    public static String formatDate(Date date, String pattern) {
        return getDateFormat(pattern).format(date);
    }

    /**
     * 获取指定格式的日期格式化对象
     * @param pattern   格式
     * @return  日期格式化对象
     */

    public static DateFormat getDateFormat(String pattern) {
        return new SimpleDateFormat(pattern);
    }

}
