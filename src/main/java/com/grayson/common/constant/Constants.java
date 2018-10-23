package com.grayson.common.constant;

/**
 * 常量类
 * @author Grayson
 * @create 2018/10/17 9:15
 */
public class Constants {

    /**
     * 随机抽取 session
     */

    //  随机抽取 session 数量
    public static final Long SESSION_RANDOM_EXTRACT_NUMBER = 100L;

    /**
     * 访问步长
     */

    //  访问步长范围在 1_3
    public static final String STEP_LENGTH_1_3 = "1_3";

    //  访问步长范围在 4_6
    public static final String STEP_LENGTH_4_6 = "4_6";

    //  访问步长范围在 7_9
    public static final String STEP_LENGTH_7_9 = "7_9";

    //  访问步长范围在 10_30
    public static final String STEP_LENGTH_10_30 = "10_30";

    //  访问步长范围在 30_60
    public static final String STEP_LENGTH_30_60 = "30_60";

    //  访问步长范围在 60
    public static final String STEP_LENGTH_60 = "60";

    /**
     * 访问时长
     */

    //  访问时长范围在 1s_3s
    public static final String TIME_PERIOD_1s_3s = "1s_3s";

    //  访问时长范围在 4s_6s
    public static final String TIME_PERIOD_4s_6s = "4s_6s";

    //  访问时长范围在 7s_9s
    public static final String TIME_PERIOD_7s_9s = "7s_9s";

    //  访问时长范围在 10s_30s
    public static final String TIME_PERIOD_10s_30s = "10s_30s";

    //  访问时长范围在 30s_60s
    public static final String TIME_PERIOD_30s_60s = "30s_60s";

    //  访问时长范围在 1m_3m
    public static final String TIME_PERIOD_1m_3m = "1m_3m";

    //  访问时长范围在 3m_10m
    public static final String TIME_PERIOD_3m_10m = "3m_10m";

    //  访问时长范围在 10m_30m
    public static final String TIME_PERIOD_10m_30m = "10m_30m";

    //  访问时长范围在 30m 以上
    public static final String TIME_PERIOD_30m = "30m";

    /**
     * 筛选后的 session 数量
     */

    //  筛选后的 session 数量
    public static final String SESSION_COUNT = "sessionCount";

    /**
     * 筛选参数
     */

    //  起始年龄
    public static final String PARAM_START_AGE = "startAge";

    //  结束年龄
    public static final String PARAM_END_AGE = "endAge";

    //  职业
    public static final String PARAM_PROFESSIONALS = "professionals";

    //  所在城市
    public static final String PARAM_CITIES = "cities";

    //  性别
    public static final String PARAM_SEX = "sex";

    //  搜索关键词
    public static final String PARAM_SEARCH_KEYWORDS = "searchKeywords";

    //  品类 id
    public static final String PARAM_CLICK_CATEGORY_IDS = "clickCategoryIds";

    /**
     * 字段值
     */

    //  用户访问 sessionid
    public static final String FIELD_SESSIONID = "sessionid";

    //  搜索关键词
    public static final String FIELD_SEARCH_KEYWORDS = "searchKeywords";

    //  点击品类 id 集合
    public static final String FIELD_CLICK_CATEGORY_IDS = "clickCategoryIds";

    //  访问时长
    public static final String FIELD_VISIT_LENGTH = "visitLength";

    //  访问步长
    public static final String FIELD_STEP_LENGTH = "stepLength";

    //  一次访问 session 的起始时间
    public static final String FIELD_START_TIME = "startTime";

    //  年龄
    public static final String FIELD_AGE = "age";

    //  职业
    public static final String FIELD_PROFESSIONAL = "professional";

    //  所在城市
    public static final String FIELD_CITY = "city";

    //  性别
    public static final String FIELD_SEX = "sex";

    /**
     * 模拟数据
     */

    //  保存生成的模拟数据的文件路径的前缀
    public static final String MOCK_DATA_FILE_PATH_PREFIX = "I:\\LearningData\\MyProjects\\BigDataProjects\\e-commerce-data-analysis-platform\\file\\source\\";

    //  保存生成的用户访问行为数据的文件路径
    public static final String MOCK_DATA_USER_VISIT_ACTION = MOCK_DATA_FILE_PATH_PREFIX + "user_visit_action.txt";

    //  保存生成的用户信息的文件路径
    public static final String MOCK_DATA_USER_INFO = MOCK_DATA_FILE_PATH_PREFIX + "user_info.txt";

    //  保存生成的商品信息的文件路径
    public static final String MOCK_DATA_PRODUCT_INFO = MOCK_DATA_FILE_PATH_PREFIX + "product_info.txt";

    /**
     * 配置文件
     */

    //  配置文件名称
    public static final String PROPERTIES_FILE_NAME = "properties";

    /**
     * 应用程序名称
     */

    //  用户访问 session 分析应用程序名称
    public static final String SPARK_APP_NAME_SESSION = "UserVisitSessionAnalysisSpark";

    /**
     * Spark
     */

    //  Spark 是否以本地模式启动
    public static final String SPARK_LOCAL = "spark.local";

    /**
     * 日期
     */

    //  默认的日期格式化格式
    public static final String DATE_FORMAT_PATTERN_DEFAULT = "yyyy-MM-dd";

    //  没有分隔符的默认的日期格式化格式
    public static final String DATE_FORMAT_PATTERN_DEFAULT_WITHOUT_SEPARATOR = "yyyyMMdd";

    //  含有秒的日期格式
    public static final String DATE_FORMAT_PATTERN_WITH_SECONDS = "yyyy-MM-dd HH:mm:ss";

    //  没有分隔符的含有秒的日期格式
    public static final String DATE_FORMAT_PATTERN_WITH_SECONDS_WITHOUT_SEPARATOR = "yyyyMMddHHmmss";

    /**
     * 任务参数
     */

    //  本地模式运行时用户访问 session 分析模块的任务 id 的 key
    public static final String SPARK_LOCAL_TASKID_SESSION = "spark.local.taskid.session";

    //  任务参数中的起始日期
    public static final String PARAM_START_DATE = "startDate";

    //  任务参数中的结束日期
    public static final String PARAM_END_DATE = "endDate";

}
