package com.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * @Author MeiQx
 * @Description 远程调用别的服务
 *      1\引入open-feign
 *      2\编写一个接口,告诉springcloud这个接口需要调用远程服务
 *              1.声明接口的每一个方法都是调用哪一个远程服务的哪个请求
 *                  在接口名上添加@FeignClient("/服务名")
 *                  复制方法名和注解
 *              2.开启远程调用功能
 *                     在application @EnableFeignClients()
 * @Date 2020/4/29 13:35
 * @Param
 * @return
 **/
@EnableFeignClients(basePackages = "com.mall.member.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class MallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallMemberApplication.class, args);
    }

}
