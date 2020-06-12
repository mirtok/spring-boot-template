package com.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.dao.mapper.UserMapper;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public JSONObject findAll(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("user", user);
        return jsonObject;
    }
}
