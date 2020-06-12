package com.example.utils;

import com.alibaba.fastjson.JSONObject;

public class JSONUtil {

    public static JSONObject getTrueJson(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", 1);
        return jsonObject;
    }

    public static JSONObject getFalseJson(String message){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag", 0);
        jsonObject.put("message",message);
        return jsonObject;
    }

    public static JSONObject setData(JSONObject jsonObject,String key,Object value){
        JSONObject dataJson = jsonObject.getJSONObject("data");
        if(dataJson == null){
            dataJson = new JSONObject();
            dataJson.put(key,value);
            jsonObject.put("data",dataJson);
        } else {
            dataJson.put(key,value);
            jsonObject.put("data",dataJson);
        }
        return jsonObject;
    }
}
