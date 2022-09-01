package com.rindraibi.website.configurations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;




@Configuration
@EnableSwagger2
@EnableWebMvc
/**
 * 
 * A specific class for any configuration related to a functionning Swagger (2) 
 * for a Spring REST web service.
 * @author Rindra Mbolamananamalala
 *
 */
public class SwaggerConfig implements WebMvcConfigurer{
	
	@Bean
	/**
	 * 
	 * @return A personalized and configured Docket corresponding to a functionning Docket. 
	 */
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()          
          //documentation for our whole set of RESTful APIs
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.regex("/api.+"))                          
          .build();                                           
    }
	
	 @Bean
	 /**
	  * 
	  * @return A default Internal Resource View Resolver.
	  */
	 public InternalResourceViewResolver defaultViewResolver() {
		 return new InternalResourceViewResolver();
	 }
	
	 
	@Override
	/**
	 *  
	 *  Manually managing all the static resources used by the Web Application.
	 */
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// All the JavaScript Files
		registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
		// All the CSS Files
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
        // All the Assets Files
        registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/static/assets/");
        // All the Files directly contained under the "Static" resource  sub-folder
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
	}
}
