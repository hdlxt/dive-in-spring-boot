package com.lxt.springboot.autoconfigure.annotation;

import com.lxt.springboot.autoconfigure.configuration.HelloWorldConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

/**
 * @ClassName: HelloWorldImportSelector
 * @Author: lxt
 * @Description: 实现ImportSelector
 * @Version: 1.0
 */
@Slf4j
public class HelloWorldImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        log.info("annotationMetadata.getAnnotationTypes():{}",annotationMetadata.getAnnotationTypes());
        // 此处可写分支条件，根据指定条件选择性注册某些类 或者返回null

        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}
