package com.example.service;


import com.alibaba.fastjson.JSONObject;

public interface UserService  {

    /**
     * 查询单个数据
     * @return
     */
    JSONObject findAll(Integer id);
}
