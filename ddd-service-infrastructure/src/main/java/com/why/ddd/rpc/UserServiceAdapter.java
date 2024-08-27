package com.why.ddd.rpc;

import org.springframework.stereotype.Component;

/**
 * @Author Hanyu.Wang
 * @Date 2024/8/27 14:54
 * @Description rpc服务防腐
 * @Version 1.0
 **/
@Component
public class UserServiceAdapter {


    public String getUsername(Long userId) {
        // rpc服务调用
        // 转换成内部对象
        return "";
    }

}

