package com.lxt.springboot.autoconfigure.service;

import com.lxt.springboot.autoconfigure.entity.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @ClassName: HelloWorldService
 * @Author: lxt
 * @Description:
 * @Version: 1.0
 */
@Component
public class HelloWorldService {

    @Autowired
    private HelloWorld helloWorld;

    @PostConstruct
    public void init(){
        helloWorld.hello();
    }

}
