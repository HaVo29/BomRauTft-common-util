package com.bomrautft.common_util.util.exception;

import com.bomrautft.common_util.util.constant.ResultJson;
import com.bomrautft.common_util.util.error.SysError;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import jakarta.validation.ConstraintViolationException;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@RestControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionHandler {

    private final MessageSource messageSource;
    // Validate @PathVariable, @RequestParamr
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ResultJson> handleConstraintViolation(
            ConstraintViolationException ex) {

        String code = ex.getConstraintViolations()
                .stream()
                .findFirst()
                .map(v -> v.getMessage())
                .orElse("validation.error");

        return ResponseEntity.badRequest()
                .body(new ResultJson(
                        new SysError(code),
                        code
                ));
    }
    // Validate @RequestBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResultJson> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex) {

        String code = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .findFirst()
                .map(err -> err.getDefaultMessage())
                .orElse("validation.error");

        return ResponseEntity.badRequest()
                .body(new ResultJson(
                        new SysError(code),
                        code
                ));
    }
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ResultJson> handleTypeMismatch(
            MethodArgumentTypeMismatchException ex) {

        String field = ex.getName(); // id
        String code = "account." + field + ".invalid";

        return ResponseEntity.badRequest()
                .body(new ResultJson(
                        new SysError(code),
                        code
                ));
    }
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ResultJson> handleNotFound(NotFoundException ex, Locale locale) {

        String code = ex.getMessage(); // account.notFound

        String message = messageSource.getMessage(
                code,
                null,
                code,     // fallback
                locale
        );

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ResultJson(
                        message,
                        new SysError(code),
                        null
                ));
    }
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ResultJson> handleRuntime(RuntimeException ex) {

        String message;
        try {
            message = messageSource.getMessage(
                    ex.getMessage(),
                    null,
                    LocaleContextHolder.getLocale()
            );
        } catch (Exception e) {
            message = ex.getMessage(); // fallback
        }

        return ResponseEntity
                .badRequest()
                .body(new ResultJson(message));
    }
}
