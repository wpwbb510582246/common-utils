package com.grayson.common.util;

import com.grayson.common.enums.ExceptionEnums;
import com.grayson.common.exception.ECommerceDataAnalysisPlatformException;
import lombok.extern.slf4j.Slf4j;
import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Arrays;

/**
 * 文件工具类
 *
 * @author Grayson
 * @create 2018/10/17 11:37
 */
@Slf4j
public class FileUtils {

    private static Logger logger = LoggerFactory.getLogger(FileUtils.class);

    private static SparkConf conf = SparkUtils.getSparkConf();
    private static JavaSparkContext sc = SparkUtils.getSparkContext(conf);

    /**
     * 将数据写入文件
     *
     * @param path 文件路径
     * @param data 数据
     */

    public static void writeToFile(String path, String data) {
        if (SparkUtils.isLocal()) {
            //  如果 Spark 是以本地模式运行，则把数据写入到本地文件
            File file = new File(path);
            BufferedWriter writer = null;
            try {
                if (!file.exists()) {
                    //  如果目标文件不存在，则创建文件
                    //  创建文件
                    file.createNewFile();
                }
                //  将数据写入文件
                writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path, true)));
                writer.append(data);
                writer.newLine();
            } catch (IOException e) {
                logger.error(ExceptionEnums.FILE_CREATE_ERROR.value(), e);
                throw new ECommerceDataAnalysisPlatformException(ExceptionEnums.FILE_CREATE_ERROR);
            } finally {
                try {
                    writer.close();
                } catch (IOException e) {
                    logger.error(ExceptionEnums.FILE_CREATE_ERROR.value(), e);
                    throw new ECommerceDataAnalysisPlatformException(ExceptionEnums.FILE_CREATE_ERROR);
                }
            }
        } else {
            //  如果 Spark 是以集群模式运行，则把数据写入到 HDFS
            JavaRDD<String> dataRDD = sc.parallelize(Arrays.asList(data));
            dataRDD.saveAsTextFile(path);
        }
    }

}
