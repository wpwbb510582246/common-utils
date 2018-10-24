package com.grayson.common.util;

import com.grayson.common.conf.ConfigurationManager;
import com.grayson.common.constant.Constants;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.hive.HiveContext;

/**
 * Spark 工具类
 * @author Grayson
 * @create 2018/10/17 9:10
 */
public class SparkUtils {

    /**
     * 获取随机抽取 session 数量
     * @return  随机抽取 session 数量
     */

    public static Long getSessionRandomExtractNumber() {
        return Constants.SESSION_RANDOM_EXTRACT_NUMBER;
    }

    /**
     * 创建 SQLContext 对象
     * @param sc    JavaSparkContext
     * @return  SQLContext 对象
     */

    public static SQLContext getSQLContext(JavaSparkContext sc) {
        if (isLocal()) {
            //  如果 Spark 是以本地模式启动，则创建 SQLContext
            return new SQLContext(sc);
        } else {
            //  如果是以集群模式启动，则创建 HiveContext
            return new HiveContext(sc);
        }
    }

    /**
     * 获取 Spark 上下文
     * @param conf  SparkConf
     * @return  Spark 上下文
     */

    public static JavaSparkContext getSparkContext(SparkConf conf) {
        return new JavaSparkContext(conf);
    }

    /**
     * 获取 SparkConf 对象
     * @param args  从控制台接收的参数
     * @return  SparkConf 对象
     */

    public static SparkConf getSparkConf(String[] args) {
        SparkConf conf = new SparkConf()
                .setAppName(Constants.SPARK_APP_NAME_SESSION)
                .set("spark.storage.memoryFraction", "0.5")
                .set("spark.shuffle.consolidateFiles", "true")
                .set("spark.shuffle.file.buffer", "64")
                .set("spark.shuffle.memoryFraction", "0.3")
                .set("spark.reducer.maxSizeInFlight", "24")
                .set("spark.shuffle.io.maxRetries", "60")
                .set("spark.shuffle.io.retryWait", "60")
                .set("spark.serializer", "org.apache.spark.serializer.KryoSerializer");
        setMaster(conf);
        return conf;
    }

    /**
     * 设置 master
     * @param conf SparkConf
     */

    public static void setMaster(SparkConf conf) {
        if (isLocal()) {
            //  Spark 以本地模式启动，设置 master 为 local
            conf.setMaster("local");
        }
    }

    /**
     * 判断 Spark 是否以本地模式启动
     * @return  Spark 是否以本地模式启动
     */

    public static Boolean isLocal() {
        return ConfigurationManager.getBoolean(Constants.SPARK_LOCAL);
    }

}
