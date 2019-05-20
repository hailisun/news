package com.haili.controller;

import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

public class BaseController {

    protected void validate(BindingResult result){
        if (result.hasFieldErrors()){
            List<FieldError> errors = result.getFieldErrors();
            errors.stream().forEach(item -> Assert.isTrue(false, item.getDefaultMessage()));
        }
    }
}
