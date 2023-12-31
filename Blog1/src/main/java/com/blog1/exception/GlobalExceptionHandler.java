package com.blog1.exception;

import com.blog1.payload.ErroeClass;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CreateException.class)
    public ResponseEntity<ErroeClass> notfoundexception(CreateException exception,
                                                        WebRequest webRequest){
        ErroeClass erroeClass = new ErroeClass(new Date(), exception.getMessage(), webRequest.getDescription(true));

        return new ResponseEntity<>(erroeClass, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErroeClass> exception(Exception exception,
                                                        WebRequest webRequest){
        ErroeClass erroeClass = new ErroeClass(new Date(), exception.getMessage(), webRequest.getDescription(true));

        return new ResponseEntity<>(erroeClass, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
