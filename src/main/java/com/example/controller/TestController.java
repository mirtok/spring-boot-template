package com.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.service.UserService;
import com.example.utils.JSONUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private UserService userService;

    @GetMapping(value = "/test")
    public JSONObject test(Integer id){
        if(id == null){
            return JSONUtil.getFalseJson("参数错误");
        }
        JSONObject findAllData = userService.findAll(id);
        JSONObject user = findAllData.getJSONObject("user");
        if(user == null){
            return JSONUtil.getFalseJson("数据找不到了哦!");
        }
        JSONObject object = JSONUtil.getTrueJson();
        object.put("data", findAllData);
        return object;
    }
}
