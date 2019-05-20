package com.haili.user.service;

import com.haili.service.BaseService;
import com.haili.user.mapper.UserMapper;
import com.haili.user.model.bean.UserBean;
import com.haili.user.model.request.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = Exception.class)
@Service
public class UserService extends BaseService {

    @Autowired
    private UserMapper userMapper;

    public String login(LoginRequest request){
        String result = "";

        List<UserBean> userBeanList = userMapper.selectUser(request.getMobile(), request.getPassword());

        if(null != userBeanList && userBeanList.size() > 0){
//            if(userBeanList.get(0).getMobile() == request.getMobile())
            result += "login success";

        }else{
            result += "mobile or password error";
        }

        return result;
    }
}
