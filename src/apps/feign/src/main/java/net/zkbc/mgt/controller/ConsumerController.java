package net.zkbc.mgt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.zkbc.mgt.adapter.ComputeAdapter;

@RestController
public class ConsumerController {

	@Autowired
	private ComputeAdapter computeAdapter;

	@RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
	public String hi(@PathVariable("name") String name) {
		return computeAdapter.hi(name);
	}
}
