package com.lpc.lean.rpc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lipengcheng1995 Created date 2020-06-04 10:42
 **/
@Slf4j
@SpringBootApplication
public class SpringRmiConsumer {
    public static void main(String[] args) {
        SpringApplication.run(SpringRmiConsumer.class, args);
    }

}
