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
	public String hi(@PathVariable("name") String name) {
		return String.format("hi %s, i am from port: %s.", name, port);
	}

}
