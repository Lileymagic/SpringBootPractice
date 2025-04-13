package com.example.testproject.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@CommonsLog
@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI api() {
        return new OpenAPI()
                .info(new Info()
                .title("Around Hub Open API test With Swagger")
                        .description("설명 부분")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Your Name")
                                .email("yourEmail@email.com")
                                .url("https://yourwebsite.com")));

    }

}
