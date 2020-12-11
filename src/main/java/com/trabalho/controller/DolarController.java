package com.trabalho.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.dto.DolarResponse;
import com.trabalho.service.DolarService;

@RestController
@RequestMapping("/dolar")
public class DolarController {
	
	private final DolarService dolarService;
	
	public DolarController(DolarService dolarService) {
		this.dolarService = dolarService;
	}
	
	@GetMapping
	public ResponseEntity<DolarResponse> getDolar() {
		return new ResponseEntity<>(dolarService.getDolar(), HttpStatus.OK);
	}

}
