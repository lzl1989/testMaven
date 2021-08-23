package com.testproject.exception;

import com.testproject.common.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 系统捕获全局异常
 *
 * 增强的 Controller。使用这个 Controller ，可以实现三个方面的功能：
 * 全局异常处理
 * 全局数据绑定
 * 全局数据预处理
 */
@ControllerAdvice
@Slf4j
public class ApiExceptionHandler {

    @Autowired
    MessageSource messageSource;
    /**
     * @ExceptionHandler 注解用来指明异常的处理类型
     * {DescriptionCstOrderException.class, SpecializationCstOrderException.class, NoUploadFileException.class,
     *                     DeadLineCstOrderException.class, DocumentCstOrderException.class, CommentCstOrderException.class}
     */
    /**
     * api异常
     *
     * @param request
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = BsException.class)
    @ResponseBody
    public ApiResponse handlerBsException(HttpServletRequest request, Exception e) {
        BsException violationException = (BsException) e;
        log.error("apiError:", e);
        String message = violationException.getMsg();
        int statusCode = violationException.getStatusCode();
//        try {
//            message = messageSource.getMessage(String.format(ApiResultCode.RESP_CODE_KEY, violationException.getStatusCode()),
//                    violationException.getParam(), null);
//        } catch (Exception error) {
//            message = messageSource.getMessage(String.format(ApiResultCode.RESP_CODE_KEY, 500),
//                    new Object[]{violationException.getStatusCode()}, null);
//        }
        return new ApiResponse(statusCode, message);
    }
}
