package com.lxt.springboot.autoconfigure.configuration;

import com.lxt.springboot.autoconfigure.entity.HelloWorld;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName: HelloWorldConfiguration
 * @Author: lxt
 * @Description:
 * @Version: 1.0
 */
@Slf4j
public class HelloWorldConfiguration {

    @Bean
    public HelloWorld hello(){
        log.info("Load HelloWorld");
        return new HelloWorld();
    }
}
