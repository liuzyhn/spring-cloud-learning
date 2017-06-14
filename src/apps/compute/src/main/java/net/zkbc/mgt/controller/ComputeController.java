package net.zkbc.mgt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ComputeController {
	@Value("${server.port}")
	private String port;

	@RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
	@ResponseBody
	public String add(@PathVariable("name") String name) {
		return "hi " + name + ", i am from port: " + port;
	}

}
