package com.zicheng.service;

/**
 * 子诚
 * Description：
 * 时间：2020/2/29 2:28
 */
public interface RedisService {
    public void set(String key, Object value, long seconds);
    public Object get(String key);
}
