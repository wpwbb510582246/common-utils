package com.grayson.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Grayson
 * @create 2018/10/17 9:47
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnums {

    /**
     * 参数
     */

    PARAM_CANNOT_BE_NULL("参数不能为 null"),

    /**
     * 日期
     */

    UNMATCHED_DATE_PATTERN("不匹配的日期格式"),

    /**
     * 配置文件
     */

    INVALID_PROPERTIES_KEY("无效的 key"),

    /**
     * 文件
     */

    FILE_CREATE_ERROR("文件创建失败"),
    FILE_STREAM_CLOSE_ERROR("文件流关闭失败"),
    FILE_NOT_FOUND("文件没有找到"),
    FILE_IO_ERROR("文件读取或写入错误"),

    /**
     * 任务
     */

    INVALID_TASKID("无效的 taskId"),
    INVALID_PARAM_KEY("无效的任务参数 key"),

    ;
    private String message;

    /**
     * 获取异常信息
     * @return  异常信息
     */

    public String value() {
        return this.message;
    }

}
