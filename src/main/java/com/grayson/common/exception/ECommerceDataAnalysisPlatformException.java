package com.grayson.common.exception;

import com.grayson.common.enums.ExceptionEnums;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 异常类
 * @author Grayson
 * @create 2018/10/17 9:34
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ECommerceDataAnalysisPlatformException extends RuntimeException {

    private ExceptionEnums exceptionEnums;

}
