package com.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author MeiQx
 * @Description 1.整合mybatis-plus
 *                 1.导入依赖
 *                  2.配置数据源
 *                      导入数据库驱动
 *
 * @Date 2020/4/28 20:25
 * @Param
 * @return
 **/
@MapperScan("com.mall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
