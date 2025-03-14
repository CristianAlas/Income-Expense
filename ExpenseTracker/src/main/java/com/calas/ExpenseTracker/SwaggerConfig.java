package com.calas.ExpenseTracker;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
    info = @io.swagger.v3.oas.annotations.info.Info(
            title = "API REST CA",
            version = "1.0",
            description = "API REST CA"
    )
)
public class SwaggerConfig {

//http://localhost:8080/swagger-ui/index.html#/
}
