package net.zkbc.mgt.adapter;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "compute-service", fallback = ComputeAdapterHystric.class)
public interface ComputeAdapter {

	@RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
	String hi(@PathVariable("name") String name);

}
