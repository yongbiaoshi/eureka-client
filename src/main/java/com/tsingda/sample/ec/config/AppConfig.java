package com.tsingda.sample.ec.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.tsingda.config.web.MvcConfig;
import com.tsingda.config.web.SwaggerConfig;

@Configuration
@Import(value = { MvcConfig.class, SwaggerConfig.class })
public class AppConfig {

}
