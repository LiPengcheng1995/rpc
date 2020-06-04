package com.lpc.learn.rpc.config;

import com.lpc.learn.rpc.service.UserService;
import com.lpc.learn.rpc.service.impl.UserServiceImpl;
import com.lpc.learn.rpc.soa.UserSoa;
import com.lpc.learn.rpc.soa.UserSoaImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * @author lipengcheng1995 Created date 2020-06-04 10:23
 **/
@Slf4j
@Configuration
public class RMIConfig {



    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }

    @Bean
    public UserSoa userSoa(UserService userService){
        return new UserSoaImpl(userService);
    }

    @Bean
    public RmiServiceExporter rmiServiceExporter(UserSoa userSoa){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setService(userSoa);
        exporter.setServiceName(UserSoa.PROVIDER_ALIAS);
        exporter.setServiceInterface(UserSoa.class);
        exporter.setServicePort(8091);
        exporter.setRegistryPort(8090);
        return exporter;
    }
}
