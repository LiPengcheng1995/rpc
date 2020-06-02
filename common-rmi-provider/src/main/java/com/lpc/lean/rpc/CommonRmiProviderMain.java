package com.lpc.lean.rpc;

import com.lpc.learn.rpc.service.UserService;
import com.lpc.learn.rpc.service.impl.UserServiceImpl;
import com.lpc.learn.rpc.soa.UserSoa;
import com.lpc.learn.rpc.soa.UserSoaImpl;
import lombok.extern.slf4j.Slf4j;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/6/2
 * @Time: 18:38
 * @Description:
 */
@Slf4j
public class CommonRmiProviderMain {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        UserService service = new UserServiceImpl();
        UserSoa soa = new UserSoaImpl(service);

        Registry registry = LocateRegistry.createRegistry(8081);
        registry.rebind("userSoa", soa);
        log.info("完成启动");
        return;

    }
}
