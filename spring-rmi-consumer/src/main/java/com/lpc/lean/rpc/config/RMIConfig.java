package com.lpc.lean.rpc.config;

import com.lpc.learn.rpc.soa.UserSoa;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

/**
 * @author lipengcheng1995 Created date 2020-06-04 10:23
 **/
@Slf4j
@Configuration
@ComponentScan(value = {"com.lpc.learn.rpc"})
public class RMIConfig {


    @Bean
    public RmiProxyFactoryBean rmiProxyFactoryBean() {
        RmiProxyFactoryBean factoryBean = new RmiProxyFactoryBean();
        factoryBean.setServiceInterface(UserSoa.class);
        factoryBean.setServiceUrl("rmi://localhost:8090/" + UserSoa.PROVIDER_ALIAS);
        return factoryBean;
    }
}
