package net.zkbc.mgt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ComputeController {
	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	private DiscoveryClient client;

	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	@ResponseBody
	public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
		ServiceInstance instance = client.getLocalServiceInstance();
		Integer r = a + b;
		LOG.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
		return r;
	}

}
