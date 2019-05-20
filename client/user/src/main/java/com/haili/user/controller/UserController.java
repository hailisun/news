package com.haili.user.controller;

import com.haili.controller.BaseController;
import com.haili.user.model.request.LoginRequest;
import com.haili.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequestMapping("user")
@RestController
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    public String login(@Valid @RequestBody LoginRequest request, BindingResult result){
        validate(result);
        return userService.login(request);

    }

}
