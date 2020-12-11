package com.trabalho.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.model.DateInfo;

@RestController
@RequestMapping("/data")
public class DateController {

	@GetMapping
	public ResponseEntity<DateInfo> getDate() {
		DateInfo dateInfo = new DateInfo();
		return new ResponseEntity<>(dateInfo, HttpStatus.OK);
	}

}
