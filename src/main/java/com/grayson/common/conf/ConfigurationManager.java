package com.grayson.common.conf;

import com.grayson.common.constant.Constants;

import java.util.ResourceBundle;

/**
 * 配置管理器
 * @author Grayson
 * @create 2018/10/17 9:26
 */
public class ConfigurationManager {

    private static ResourceBundle bundle;

    static {
        //  加载配置文件
        bundle = ResourceBundle.getBundle(Constants.PROPERTIES_FILE_NAME);
    }

    /**
     * 获取 String 类型的参数值
     * @param key   参数名
     * @return  String 类型的参数值
     */

    public static String getString(String key) {
        return bundle.getString(key);
    }

    /**
     * 获取 Boolean 类型的参数值
     * @param key   参数名
     * @return  Boolean 类型的参数值
     */

    public static Boolean getBoolean(String key) {
        return Boolean.valueOf(getString(key));
    }

    /**
     * 获取 Integer 类型的参数值
     * @param key   参数名
     * @return  Integer 类型的参数值
     */

    public static Integer getInteger(String key) {
        return Integer.parseInt(getString(key));
    }

}
