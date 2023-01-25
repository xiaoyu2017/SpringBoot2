package cn.fishland.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * TODO
 *
 * @author xiaoyu
 * @version 1.0
 */
@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public void handleException(Exception e) {
        // 通知开发人员
        // 通知维护人员
        // 进行友好返回，将void修改成返回类型即可
    }
}
