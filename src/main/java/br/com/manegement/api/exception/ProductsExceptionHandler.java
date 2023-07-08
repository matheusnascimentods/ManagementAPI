package br.com.manegement.api.exception;


import br.com.manegement.api.exception.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ProductsExceptionHandler extends ResponseEntityExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND) @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<Error> productNotFound(Exception exception) {

        Error error = new Error(exception.getMessage(), 404, LocalDateTime.now());
        return ResponseEntity.status(404).body(error);
    }
}
