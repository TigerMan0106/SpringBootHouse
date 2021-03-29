package com.shsxt.house;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cache.annotation.EnableCaching;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
@EnableCaching
@MapperScan("com.shsxt.house.dao")
public class StarterApplication {
    //添加日志对象
    private static Logger logger= LoggerFactory.getLogger(StarterApplication.class);
    public static void main(String[] args){
        //使用日志
        logger.info("{}正在使用日志","admin");
        SpringApplication.run(StarterApplication.class);
    }
}
