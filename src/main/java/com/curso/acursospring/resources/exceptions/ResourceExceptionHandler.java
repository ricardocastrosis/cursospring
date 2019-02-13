/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.acursospring.resources.exceptions;

import com.curso.acursospring.services.exceptions.ObjectNotFoundException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author RCastro
 */
@ControllerAdvice
public class ResourceExceptionHandler {
    
    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandartError> objectNofFound(ObjectNotFoundException e, HttpServletRequest request){
        StandartError err = new StandartError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
        
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }
    
}
