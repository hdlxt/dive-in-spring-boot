package com.lxt.springboot.autoconfigure.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @ClassName: EnableHelloWorld
 * @Author: lxt
 * @Description:
 * @Version: 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
//@Import(HelloWorldConfiguration.class) // 基于注解驱动实现Sprig @Enable模块
@Import(HelloWorldImportSelector.class) // 基于接口驱动实现Spring @Enable模块
public @interface EnableHelloWorld {
}
