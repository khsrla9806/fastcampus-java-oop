package com.fastcampus.springapply.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc // Web Mvc를 사용하기 위한 어노테이션
@ComponentScan("com.fastcampus.springapply")
@Configuration
public class Config {

}
