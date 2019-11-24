package com.lxt.springboot.autoconfigure.annotation;

import com.lxt.springboot.autoconfigure.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName: HelloWorldImportSelector
 * @Author: lxt
 * @Description: 实现ImportSelector
 * @Version: 1.0
 */
public class HelloWorldImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}
