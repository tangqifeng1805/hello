package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy	//启动zuul
@EnableEurekaClient	//zuul注册到Eureka
public class ZuulRunApp {
	public static void main(String[] args) {
		SpringApplication.run(ZuulRunApp.class, args);
	}
}
