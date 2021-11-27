package com.spring.practice.AnnotationConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.spring.practice.AnnotationConfig")
@PropertySource("classpath:AnnotationConfig.properties")
public class Config {

}
