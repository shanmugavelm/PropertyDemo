package com.velu.propertyclient;

import com.velu.propertyclient.restclient.PropertyRestClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(clients = {
		PropertyRestClient.class
})
public class PropertyclientdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertyclientdemoApplication.class, args);
	}

}
