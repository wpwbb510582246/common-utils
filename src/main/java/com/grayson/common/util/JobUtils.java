package com.grayson.common.util;

import com.grayson.common.conf.ConfigurationManager;

/**
 * 任务工具类
 * @author Grayson
 * @create 2018/10/21 9:52
 */
public class JobUtils {

    /**
     * 判断任务是否是本地模式运行
     * @param propertyName  配置文件中任务的 key
     * @return  任务是否是本地模式运行
     */

    public static Boolean isLocal(String propertyName) {
        return ConfigurationManager.getBoolean(propertyName);
    }

}
