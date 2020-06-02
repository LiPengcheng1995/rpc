package com.lpc.learn.rpc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/6/2
 * @Time: 20:42
 * @Description:
 */
@Slf4j
@SpringBootApplication
@ImportResource(locations = {"classpath:dubbo/dubbo.xml"})
public class SpringRmiProvider {
}
