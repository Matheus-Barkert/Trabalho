package com.trabalho.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@Import(SpringDataRestConfiguration.class)
public class SwaggerConfig {

	@Bean
	public Docket swagger() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("br.com.compasso.DesafioPauta"))
				.paths(PathSelectors.ant("/**")).build().apiInfo(metaInfo());

	}

	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo("Trabalho de Redes", "Trabalho de Redes de Computadores - UNISC 2020", "1.0", "",
				new Contact("Matheus Barkert", "https://github.com/Matheus-Barkert", "mbarkert11@hotmail.com"), "", "",
				new ArrayList<VendorExtension>());

		return apiInfo;
	}

}
