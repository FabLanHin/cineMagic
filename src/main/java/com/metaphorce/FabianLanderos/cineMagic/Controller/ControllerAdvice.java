package com.metaphorce.FabianLanderos.cineMagic.Controller;

import com.metaphorce.FabianLanderos.cineMagic.Exception.*;
import com.metaphorce.FabianLanderos.cineMagic.Util.ModelError;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(value = EmptyErrorException.class)
    public ResponseEntity<ModelError> dataErrorSubmit(EmptyErrorException e){
        List<String> error = e.getResult().getFieldErrors().stream().map(FieldError::getDefaultMessage).collect(Collectors.toList());
        ModelError modelError = new ModelError(e.getCode(), e.getMessage(), error);
        return new ResponseEntity<>(modelError, e.getStatus());
    }

    @ExceptionHandler(value = NumCharException.class)
    public ResponseEntity<ModelError> charErrorSubmit(NumCharException e){
        List<String> error = e.getResult().getFieldErrors().stream().map(FieldError::getDefaultMessage).collect(Collectors.toList());
        ModelError modelError = new ModelError(e.getCode(), e.getMessage(), error);
        return new ResponseEntity<>(modelError, e.getStatus());
    }

    @ExceptionHandler(value = IncorrectEmailException.class)
    public ResponseEntity<ModelError> errorEmailSubmit(IncorrectEmailException e){
        List<String> error = e.getResult().getFieldErrors().stream().map(FieldError::getDefaultMessage).collect(Collectors.toList());
        ModelError modelError = new ModelError(e.getCode(), e.getMessage(), error);
        return new ResponseEntity<>(modelError, e.getStatus());
    }

    @ExceptionHandler(value = AuthAdminNotFoundException.class)
    public ResponseEntity<ModelError> authAdminErrorSubmit(AuthAdminNotFoundException e){
        List<String> error = e.getResult().getFieldErrors().stream().map(FieldError::getDefaultMessage).collect(Collectors.toList());
        ModelError modelError = new ModelError(e.getCode(), e.getMessage(), error);
        return new ResponseEntity<>(modelError, e.getStatus());
    }

    @ExceptionHandler(value = DigitCardIncorrectException.class  )
    public ResponseEntity<ModelError> digitCardSubmitError(DigitCardIncorrectException e){
        List<String> error = e.getResult().getFieldErrors().stream().map(FieldError::getDefaultMessage).collect(Collectors.toList());
        ModelError modelError = new ModelError(e.getCode(), e.getMessage(), error);
        return new ResponseEntity<>(modelError, e.getStatus());
    }
}
