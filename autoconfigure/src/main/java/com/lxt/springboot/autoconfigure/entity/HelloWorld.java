package com.lxt.springboot.autoconfigure.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName: HelloWorld
 * @Author: lxt
 * @Description:
 * @Version: 1.0
 */
@Slf4j
public class HelloWorld {
    public void hello(){
        log.info("hello world 2019!");
    }
}
