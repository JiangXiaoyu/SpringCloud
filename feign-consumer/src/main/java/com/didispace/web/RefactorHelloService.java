package com.didispace.web;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "HELLO-SERVICE")
public interface RefactorHelloService extends com.didispace.service.HelloService {
//涉及HelloService,HelloService-Api,Feign-consumer三个项目
//需在遵守Java开闭原则的基础上进行使用
//开闭原则(Open-Closed Principle, OCP)：一个软件实体应当对扩展开放，对修改关闭。
//	即软件实体应尽量在不修改原有代码的情况下进行扩展。
}