package com.trabalho.config;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public InetAddress inetAddress() throws UnknownHostException {
		return InetAddress.getLocalHost();
	}

}
