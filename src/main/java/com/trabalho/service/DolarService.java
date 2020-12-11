package com.trabalho.service;

import org.springframework.stereotype.Service;

import com.trabalho.client.DolarClient;
import com.trabalho.dto.DolarResponse;

@Service
public class DolarService {
	
	private final DolarClient dolarClient;
	
	public DolarService(DolarClient dolarClient) {
		this.dolarClient = dolarClient;
	}
	
	public DolarResponse getDolar() {
		return dolarClient.getDolar();
	}
}
