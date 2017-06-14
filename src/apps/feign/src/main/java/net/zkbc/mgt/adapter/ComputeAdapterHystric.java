package net.zkbc.mgt.adapter;

import org.springframework.stereotype.Component;

@Component
public class ComputeAdapterHystric implements ComputeAdapter {

	@Override
	public String hi(String name) {
		return String.format("sorry %s.", name);
	}

}
