package com.trabalho.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.model.DateInfo;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/data")
public class DateController {

	@GetMapping
	@ApiOperation(value = "Retorna a data e hora do sistema")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Data e hora do sistema:") })
	public ResponseEntity<DateInfo> getDate() {
		DateInfo dateInfo = new DateInfo();
		return new ResponseEntity<>(dateInfo, HttpStatus.OK);
	}

}
