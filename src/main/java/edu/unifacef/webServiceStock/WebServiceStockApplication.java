package edu.unifacef.webServiceStock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableMongoAuditing
@EnableOpenApi
public class WebServiceStockApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceStockApplication.class, args);
	}

}
