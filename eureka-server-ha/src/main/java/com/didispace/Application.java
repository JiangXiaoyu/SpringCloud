package com.didispace;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer  //Eureka注册中心
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(true).run(args);
	}

}

/** 注册中心高可用
 * 1.创建注册中心a:= http://peer1:1111/eureka/
 * 2.创建注册中心b:= http://peer2:1112/eureka/
 * 3.创建服务中心,其zone定义如下
 * eureka.client.serviceUrl.defaultZone=http://peerl:llll/eureka/,http://peer2:lll2/eureka/ 
 * 4.若第3点中zone使用ip定义,则需增加eureka.instance.prefer-ip-address= true
 */

