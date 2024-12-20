package com.domorecode.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.domorecode.entity.Book;
import com.domorecode.entity.User;
@Configuration
public class RestrictedApiConfig implements RepositoryRestConfigurer{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		
		HttpMethod[] unsupportedMethod= {HttpMethod.PUT,HttpMethod.DELETE};
		config.getExposureConfiguration().forDomainType(Book.class).withItemExposure((metadata,http)->http.disable(unsupportedMethod))
		.withCollectionExposure((metadata,http)->http.disable(unsupportedMethod));

	  config.getExposureConfiguration()
      .forDomainType(User.class)
      .withItemExposure((metadata, httpMethods) -> httpMethods.disable(unsupportedMethod))
      .withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(unsupportedMethod));
	
	}
}
