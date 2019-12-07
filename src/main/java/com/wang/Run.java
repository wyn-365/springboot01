package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 标注主程序说明是这是一个springboot应用
 * 主入口类 是一个springboot应用，标注在某个类上，
 */

//将所在包机器子包左右的组件扫描到spring容器中
@SpringBootApplication
public class Run {
    public static void main(String[] args) {

        //springboot应用启动程序
        SpringApplication.run(com.wang.Run.class,args);
        System.out.println("启动成功");

    }
}
