package com.domorecode.swaggerConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Your API Title")
                        .version("1.0")
                        .description("API for managing your application"));
    }
    // Manually define which packages should be scanned
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                // Specify the base package to scan for controllers
//                .apis(RequestHandlerSelectors.basePackage("com.domorecode.controller"))
//                .build();
//    }
}
