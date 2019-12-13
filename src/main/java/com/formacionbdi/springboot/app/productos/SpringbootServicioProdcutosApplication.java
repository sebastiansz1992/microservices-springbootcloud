package com.formacionbdi.springboot.app.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringbootServicioProdcutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioProdcutosApplication.class, args);
	}

}
