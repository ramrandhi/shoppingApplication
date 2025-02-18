package com.service.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

	@Bean
	@LoadBalanced // Enables service discovery with Eureka or other service registries
	public WebClient.Builder webClientBuilder() {
		return WebClient.builder();
	}

}
