package com.gx.gxmail.product.exception;

import com.gx.common.exception.ErrCodeEnume;
import com.gx.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestControllerAdvice(basePackages = "com.gx.gxmail.product.controller")
//@ControllerAdvice
public class GxmailExceptionControllerAdvice {
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleVaildException(MethodArgumentNotValidException e) {
        log.error("数据校验出错{},异常类型{}", e.getMessage(), e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        Map<String, String> map = new HashMap<>();
        bindingResult.getFieldErrors().forEach(item ->
                map.put(item.getField(), item.getDefaultMessage())
        );
        return R.error(ErrCodeEnume.VALID_EXCEPTION.getCode(), ErrCodeEnume.VALID_EXCEPTION.getMsg()).put("data", map);
    }

    @ExceptionHandler(value = Throwable.class)
    public R handleException(Throwable throwable) {
            log.error("错误",throwable);
        return R.error(ErrCodeEnume.UNKNOWN_EXCEPTION.getCode(), ErrCodeEnume.UNKNOWN_EXCEPTION.getMsg());
    }
}
