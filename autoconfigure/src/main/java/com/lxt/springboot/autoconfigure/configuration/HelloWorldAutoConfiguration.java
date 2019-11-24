package com.lxt.springboot.autoconfigure.configuration;

import com.lxt.springboot.autoconfigure.annotation.EnableHelloWorld;
import com.lxt.springboot.autoconfigure.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: HelloWorldAutoConfiguration
 * @Author: lxt
 * @Description:
 * @Version: 1.0
 */
@ConditionalOnSystemProperty(name = "user.name", value = "Administrator") // 条件装配
//@ConditionalOnSystemProperty(name = "user.name", value = "lxt") // 条件装配
@Configuration // 模式注解
@EnableHelloWorld // Spring @Enable 模块装配
public class HelloWorldAutoConfiguration {
}
