package cn.tedu.hytrix;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="provider-user") //根提供者关联
public interface EurekaServiceFeign {
	
	@RequestMapping("/hello/{name}")
	//请求变量名也要全
	public String hello(@PathVariable("name") String name);
}
