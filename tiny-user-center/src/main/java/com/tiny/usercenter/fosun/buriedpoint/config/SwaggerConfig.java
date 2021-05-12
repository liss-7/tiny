package com.tiny.usercenter.fosun.buriedpoint.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * <Description> <br>
 *
 * @author liss
 * @createTime 2021年05月12日 11:05:00
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
         return new Docket(DocumentationType.OAS_30)
                 .apiInfo(apiInfo())
                 .select()
                 .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                 .paths(PathSelectors.any())
                 .build();
    }

     private ApiInfo apiInfo() {
         return new ApiInfoBuilder()
                 .title("fosun-poc接口文档")
                 .description("文档描述：更多问题，请联系开发者")
                 .contact(new Contact("liss", "作者网站(url)", "361726964@qq.com"))
                 .version("1.0")
                 .build();
     }
}
