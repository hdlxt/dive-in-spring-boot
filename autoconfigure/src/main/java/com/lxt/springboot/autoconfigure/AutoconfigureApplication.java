package com.lxt.springboot.autoconfigure;

import com.lxt.springboot.autoconfigure.annotation.EnableHelloWorld;
import com.lxt.springboot.autoconfigure.configuration.HelloWorldConfiguration;
import com.lxt.springboot.autoconfigure.entity.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoconfigureApplication {
    public static void main(String[] args) {
        SpringApplication.run(AutoconfigureApplication.class, args);
    }
}
