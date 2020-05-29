package com.lpc.learn.rpc.soa;


import com.lpc.learn.rpc.domain.Request;
import com.lpc.learn.rpc.domain.Response;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/5/27
 * @Time: 21:57
 * @Description:
 */
public interface UserSoa {
    Response<String> deal(Request<String> request);
}
