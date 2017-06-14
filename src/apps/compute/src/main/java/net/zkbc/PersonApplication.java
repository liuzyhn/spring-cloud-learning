package net.zkbc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PersonApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(PersonApplication.class).web(true).run(args);
	}

}
