package org.Stanchik.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI api() {
        Info info = new Info()
                .title("Our Cats API")
                .version("1.0")
                .description("API for managing cat data");

        Server server = new Server()
                .url("http://localhost:8080");

        return new OpenAPI()
                .info(info)
                .servers(List.of(server));
    }
}