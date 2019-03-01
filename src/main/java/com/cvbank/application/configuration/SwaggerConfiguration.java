package com.cvbank.application.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;


/**
 * author:Pavel Moriakov
 */
@Configuration
public class SwaggerConfiguration {

    @Bean
    public Docket api(ApiInfo apiInfo) {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("CV_Bank")
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo)
                .select()
                .paths(PathSelectors.regex("/.*"))
                .build();
    }

    @Bean
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("CV Bank API")
                .description("Java-2H CV bank project")
                .version("1.0.0")
                .build();
    }

    @Bean
    public UiConfiguration uiConfiguration() {
        return UiConfigurationBuilder.builder()
                .deepLinking(true)
                .validatorUrl(null)
                .build();
    }

}
