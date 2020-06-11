package com.ifg.ims.sidecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class SidecarApplication {
	
	// test 1111 develop
	public static void main(String[] args) {
		SpringApplication.run(SidecarApplication.class, args);
	}
	// develop
}
