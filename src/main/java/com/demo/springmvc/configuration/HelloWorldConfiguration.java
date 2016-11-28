package com.demo.springmvc.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by vagrant on 11/26/16.
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.demo.springmvc")
public class HelloWorldConfiguration {
}
