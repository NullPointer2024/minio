package com.orchids.minio.web.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ Author qwh
 * @ Date 2024/6/4 14:14
 */
@Configuration
public class Knife4jConfiguration {
    @Bean
    public OpenAPI OpenAPI() {
        return new OpenAPI().info(
                new Info()
                        .title("MinioAPI")
                        .version("1.0")
                        .description("UploadAPI"));
    }
    @Bean
    public GroupedOpenApi StudentAPI() {

        return GroupedOpenApi.builder().group("MinioFile管理").
                pathsToMatch(
                        "/minio/**"
                ).
                build();

    }
}
