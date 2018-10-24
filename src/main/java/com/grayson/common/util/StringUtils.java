package com.grayson.common.util;

/**
 * 字符串工具类
 *
 * @author Grayson
 * @create 2018/10/17 10:39
 */
public class StringUtils {

    /**
     * 比较两个数值字符串的大小
     *
     * @param value1 第一个数值字符串
     * @param value2 第二个数值字符串
     * @return 第一个数值字符串是否大于第二个数值字符串
     */

    public static Boolean greater(String value1, String value2) {
        return greater(Long.valueOf(value1), Long.valueOf(value2));
    }

    /**
     * 比较两个数的大小
     *
     * @param value1 第一个数
     * @param value2 第二个数
     * @return 第一个数是否大于第二个数
     */

    public static Boolean greater(Long value1, Long value2) {
        return value1 > value2;
    }

    /**
     * 判断一个字符串数组中的字符串是否全部都不为空
     *
     * @param str 可变字符串数组
     * @return 字符串数组中的字符串是否全部都不为空
     */

    public static Boolean isNotEmptyAll(String... str) {
        for (String s : str) {
            if (isEmpty(s)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断字符串数组中的字符串是否都为空
     *
     * @param str 可变字符串数组
     * @return 字符串数组中的字符串是否都为空
     */

    public static Boolean isEmpty(String... str) {
        for (String s : str) {
            if (!org.apache.commons.lang3.StringUtils.isEmpty(s)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 更新一个字符串中指定字段的值
     *
     * @param str       字符串
     * @param separator 分隔符
     * @param field     字段
     * @param newValue  指定字段的新值
     * @return 更新后的字符串
     */

    public static String setFieldInConcatString(String str, String separator, String field, String newValue) {
        String tmpStr = str;
        for (String s : tmpStr.split(separator)) {
            String[] splited = s.split("=");
            String key = splited[0];
            if (key.equals(field)) {
                String value = splited[1];
                int index = tmpStr.indexOf(key);
                if (index == 0) {
                    str = org.apache.commons.lang3.StringUtils.replace(str, key + "=" + value, key + "=" + newValue);
                } else {
                    str = org.apache.commons.lang3.StringUtils.replace(str, "|" + key + "=" + value, "|" + key + "=" + newValue);
                }
                break;
            }
        }
        return str;
    }

    /**
     * 从一个字符串中以指定的分隔符获取指定字段名的值
     *
     * @param str       字符串
     * @param separator 分隔符
     * @param field     字段名
     * @return 字段值
     */

    public static String getFieldFromConcatString(String str, String separator, String field) {
        for (String s : str.split(separator)) {
            String[] splited = s.split("=");
            String key = splited[0];
            if (splited.length < 2) {
                continue;
            }
            if (key.equals(field)) {
                return splited[1];
            }
        }
        return null;
    }

    /**
     * 去除一个字符串缓冲末尾的逗号
     *
     * @param buffer 字符串缓冲
     * @return 去除末尾逗号的字符串缓冲
     */

    public static String trimComma(StringBuffer buffer) {
        return trimComma(buffer.toString());
    }

    /**
     * 去除一个字符串末尾的逗号
     *
     * @param str 字符串
     * @return 去除末尾逗号的字符串
     */

    public static String trimComma(String str) {
        if (str.endsWith(",")) {
            return org.apache.commons.lang3.StringUtils.substringBeforeLast(str, ",");
        }
        return str;
    }

    /**
     * 将一个数字字符串补全两位数字
     *
     * @param str 字符串
     * @return 补全两位数字后的字符串
     */

    public static String fullFillToTwoDigit(String str) {
        return str.length() == 2 ? str : 0 + str;
    }

    /**
     * 获取换行符
     *
     * @return 换行符
     */

    public static String getLineSeparator() {
        return System.lineSeparator();
    }

}
