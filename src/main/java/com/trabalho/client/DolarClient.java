package com.trabalho.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.trabalho.dto.DolarResponse;

@FeignClient(name = "dolar", url = "https://economia.awesomeapi.com.br/json")
public interface DolarClient {

	@GetMapping(value = "/all")
	DolarResponse getDolar();

}
