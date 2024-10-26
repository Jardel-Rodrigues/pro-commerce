package com.softstrem.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@OpenAPIDefinition
@SecurityScheme(name = "bearerAuth", type = SecuritySchemeType.HTTP, scheme = "bearer")
@Configuration
public class OpenApiConfig {
	
	@Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
           .info(new Info()
           .title("Vagas Online API")
           .description("Sistema de vagas online")
           .version("v0.0.1")
           .license(new License()
           .name("Apache 2.0")
           .url("http://localhost:8080/swagger-ui.html")));
    }
}
