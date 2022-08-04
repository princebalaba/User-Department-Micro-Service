package com.princeCODEZ.departmentuserserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DepartmentUserServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentUserServiceRegistryApplication.class, args);
	}

}
