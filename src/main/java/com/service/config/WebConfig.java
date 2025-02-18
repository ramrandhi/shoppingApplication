package com.service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.service.Interceptor.RequestInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new RequestInterceptor()).addPathPatterns("/api/**");
	}
	
//	@Bean
//	@LoadBalanced
//    RestTemplate restTemplate() {
//		return new RestTemplate();
//	}
	
	
}
