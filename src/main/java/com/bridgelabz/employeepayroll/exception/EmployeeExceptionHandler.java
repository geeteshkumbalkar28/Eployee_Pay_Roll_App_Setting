package com.bridgelabz.employeepayroll.exception;

import com.bridgelabz.employeepayroll.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class EmployeeExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDTO> handlerMethodArgugumentValid(MethodArgumentNotValidException exception){
        List<ObjectError> errors = exception.getBindingResult().getAllErrors();
        List<String> errorMessage = errors.stream().map(objErrors -> objErrors.getDefaultMessage()).collect(Collectors.toList());
        ResponseDTO responseDTO = new ResponseDTO("Execption while handling RestApi call",errorMessage);
        return new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(EmployeeCustomException.class)
    public ResponseEntity<ResponseDTO> handlerMethodArgugumentValid(EmployeeCustomException exception){
        ResponseDTO responseDTO = new ResponseDTO("Execption while handling RestApi call",exception.getMessage());
        return new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);

    }
}
