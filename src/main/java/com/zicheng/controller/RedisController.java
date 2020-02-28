package com.zicheng.controller;

import com.zicheng.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 子诚
 * Description：
 * 时间：2020/2/29 2:32
 */
@RestController
public class RedisController {

    private static final String RESULT_OK = "ok";

    @Autowired
    private RedisService redisService;


    @GetMapping("put/{key}/{value}/{seconds}")
    public String set(@PathVariable("key") String key, @PathVariable("value")String value, @PathVariable("seconds")long seconds) {
        redisService.set(key, value, seconds);
        return RESULT_OK;
    }


    @GetMapping("find/{key}")
    public String find(@PathVariable("key") String key) {
        String json = null;

        Object obj = redisService.get(key);
        if (obj != null) {
            json = (String) redisService.get(key);
        }

        return json;
    }
}
