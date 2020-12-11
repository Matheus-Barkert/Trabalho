package com.trabalho.controller;

import java.util.Properties;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SystemController {
	
	@GetMapping("/info")
	public ResponseEntity<Properties> getInfos() {	
		return new ResponseEntity<>(System.getProperties(), HttpStatus.OK);
	}

}
