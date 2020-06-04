package com.lpc.lean.rpc.rpc.impl;

import com.lpc.learn.rpc.domain.Request;
import com.lpc.learn.rpc.rpc.UserRpc;
import com.lpc.learn.rpc.soa.UserSoa;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/6/2
 * @Time: 20:18
 * @Description:
 */
@Slf4j
@Service
public class UserRpcImpl implements UserRpc {
    @Resource
    private UserSoa soa;

    @Override
    public String deal(String input) {

        try {
            return soa.deal(Request.build(input)).getData();
        } catch (RemoteException e) {
            log.error("",e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public String dealBatch(String input) {
        return "暂不支持";
    }

}
