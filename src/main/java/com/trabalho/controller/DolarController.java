package com.trabalho.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.dto.DolarResponse;
import com.trabalho.service.DolarService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Dolar")
@RestController
@RequestMapping("/dolar")
public class DolarController {
	
	private final DolarService dolarService;
	
	public DolarController(DolarService dolarService) {
		this.dolarService = dolarService;
	}
	
	@GetMapping
	@ApiOperation(value = "Retorna o preço do Dólar Comercial e Turismo")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Sucesso ao buscar o preço do dólar") })
	public ResponseEntity<DolarResponse> getDolar() {
		return new ResponseEntity<>(dolarService.getDolar(), HttpStatus.OK);
	}

}
