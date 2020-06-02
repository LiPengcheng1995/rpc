package com.lpc.lean.rpc;

import com.lpc.learn.rpc.service.UserService;
import com.lpc.learn.rpc.service.impl.UserServiceImpl;
import com.lpc.learn.rpc.soa.UserSoa;
import com.lpc.learn.rpc.soa.UserSoaImpl;
import lombok.extern.slf4j.Slf4j;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/6/2
 * @Time: 18:38
 * @Description:
 */
@Slf4j
public class CommonRmiProviderMain {
    public static void main(String[] args) throws RemoteException {
        UserService service = new UserServiceImpl();
        UserSoa soa = new UserSoaImpl(service);
        // 如果 UserSoaImpl 自行扩展 UnicastRemoteObject ，这里就不用手动暴露接口了
        UserSoa stub = (UserSoa) UnicastRemoteObject.exportObject(soa, 8091);

        Registry registry = LocateRegistry.createRegistry(8090);
        registry.rebind(UserSoa.PROVIDER_ALIAS, stub);
        log.info("完成启动");
        return;

    }
}
